package com.datdt.superapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Name",columnDefinition = "NVARCHAR(50)",length = 50,nullable = false)
    private String name;
    @Column(name = "Yob",nullable = false)
    private int yob;
    @Column(name = "Gpa")
    private double gpa;

    public Student(String name, int yob, double gpa) {
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }
}
