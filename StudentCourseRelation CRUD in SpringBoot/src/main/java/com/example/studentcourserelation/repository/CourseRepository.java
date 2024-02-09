package com.example.studentcourserelation.repository;

import com.example.studentcourserelation.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}