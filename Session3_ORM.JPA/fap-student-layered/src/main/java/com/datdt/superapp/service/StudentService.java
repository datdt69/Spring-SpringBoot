package com.datdt.superapp.service;

import com.datdt.superapp.entity.Student;
import com.datdt.superapp.repository.StudentRepo;

import java.util.List;

public class StudentService {
    private StudentRepo studentRepo = new StudentRepo();
    public void createStudent(Student student){
        studentRepo.save(student);
    }
    public List<Student> getAllStudents(){
       return studentRepo.findAll();

    }
}
