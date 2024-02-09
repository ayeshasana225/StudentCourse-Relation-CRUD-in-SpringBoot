package com.example.studentcourserelation.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// Student.java
@Entity
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Course course;

    // getters and setters
}

