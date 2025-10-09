package com.datdt.superapp;

import com.datdt.superapp.entity.Student;
import com.datdt.superapp.service.StudentService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.createStudent(new Student("Dat", 1999, 3.5));
        System.out.println("All Students:");
        studentService.getAllStudents().forEach(x -> System.out.println(x));


    }
}