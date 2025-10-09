package com.datdt.superapp.entity.bidirectional;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @Column(name = "Id", columnDefinition = "CHAR(8)")
    private String id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(50)",nullable = false)
    private String name;
    @Column(name = "Yob", nullable = false)
    private int yob;
    @Column(name = "Gpa")
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }
    @ManyToOne
    @JoinColumn(name = "MajorId")
    private Major major;

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return String.format("|%2s|%-40s|%4d|%4.1f|",id,name,yob,gpa);

    }
}
