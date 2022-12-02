package com.example.jfs_dependency_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.ArrayList;

@Configuration
public class StudentConfig {
    public List<Student> students = new ArrayList<>();

    Student student1 = new Student(1L, "student one", "studentone@gmail.com", LocalDate.of(1998, Month.AUGUST, 25));
    Student student2 = new Student(2L, "student two", "studentotwo@gmail.com", LocalDate.of(1999, Month.AUGUST, 25));

    @Bean
    public void addStudents() {
        students.addAll(List.of(student1, student2));
    }
}
