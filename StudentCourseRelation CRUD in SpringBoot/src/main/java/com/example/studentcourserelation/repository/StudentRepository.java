package com.example.studentcourserelation.repository;

import com.example.studentcourserelation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}