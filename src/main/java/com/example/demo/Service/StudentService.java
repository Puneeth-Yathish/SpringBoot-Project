package com.example.demo.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repo.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private Repository repository;

    public List<Student> findAllStudentDetails(){
        return repository.findAll();
        // We can use null point exception also
        //In Some Other case we can Use Http status code also . WE CAN USE Below code also but return type should be in ResponseEntity<Object>
//        try {
//            List<Entity> StudentDetails=repository.findAll();
//            return ResponseEntity.ok().body(StudentDetails).getBody();
//        }
//        catch (Exception e){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
    }

    public Optional<Student> findByStudentId(@PathVariable Long Id) {
        return repository.findById(Id);
        // We can use null point exception also  and I have commented below code both will work
        //In Some Other case we can Use Http status code also . WE CAN USE Below code also but return type should be in ResponseEntity<Object>
//        try {
//            Optional<Student> StudentDetails= Optional.ofNullable(repository.findById(Id).get());
//            return ResponseEntity.ok().body(StudentDetails).getBody();
//        }
//        catch (Exception e){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
    }

    public Student postStudentDetails(@RequestBody Student student){
        return repository.save(student);
//        Student saving=new Student(student.getName(),student.getAddress());
//        return repository.save(saving);
        //In Some Other case we can Use Http status code also . WE CAN USE Below code also but return type should be in ResponseEntity<Object>
//        try {
//            Student saving=new Student(student.getName(),student.getAddress());
//            return ResponseEntity.status(HttpStatus.CREATED).body(entity1);
//        }
//        catch (Exception e){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
    }

    public String deleteStudentDetailsById(@PathVariable Long Id){
        try {
        repository.deleteById(Id);
        return "Entry Has been Deleted Successfully";}
        catch (Exception e){
            return "Nothing to delete";
        }
        // We can use null point exception also
        //In Some Other case we can Use Http status code also . WE CAN USE Below code also but return type should be in ResponseEntity<Object>
//        try {
//            Optional<Entity> entities=repository.findById(Id);
//            if(entities.isPresent()){
//                repository.deleteById(Id);
//            }
//            else{
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//            }
//        }
//        catch (Exception e){
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
    }
}
