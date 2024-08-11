package com.example.demo.Api;

import com.example.demo.Model.Student;
import com.example.demo.Repo.Repository;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//Controller Class
@RestController
@RequestMapping("api/studentDetails")
public class Controller {

    @Autowired
    StudentService studentService;

    @Autowired
    Repository repository;


    //Getting all the Details of Students
    @GetMapping
    public List<Student> GetAllStudents(){
        return studentService.findAllStudentDetails();
    }

    //Fetching the Details of Student
    @GetMapping("/{id}")
    public Optional<Student> GetStudentById(@PathVariable Long id){
        return studentService.findByStudentId(id);
    }

    //Creating  new Student Details
    @PostMapping
    public Student postStudentDetails(@RequestBody Student student){
        return studentService.postStudentDetails(student);
    }


    //Deleting Student Details By using id
    @DeleteMapping("/{id}")
    public String deleteStudentDetail(@PathVariable Long id){
        return studentService.deleteStudentDetailsById(id);
    }
}
