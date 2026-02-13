package com.example.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    // Save student
    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    // Get all students
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // Get student by email
    public Optional<Student> getStudentsByEmail(String email) {
        return repo.findByEmail(email);
    }
}
