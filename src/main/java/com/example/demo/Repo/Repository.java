package com.example.demo.Repo;

import com.example.demo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student,Long> {

//     List<Entity> findById(Long Id);
}
