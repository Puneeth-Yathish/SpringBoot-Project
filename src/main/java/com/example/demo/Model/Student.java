package com.example.demo.Model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@jakarta.persistence.Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

// I Have created Entity class and  using getter And setter
public class Student {


    // id will be automatically generated
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;


}
