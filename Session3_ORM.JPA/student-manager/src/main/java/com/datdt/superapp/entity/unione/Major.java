package com.datdt.superapp.entity.unione;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "Major")
public class Major {
    @Column(name = "Name", columnDefinition = "NVARCHAR(100)",nullable = false)
    private String name;
    @Id
    @Column(name = "Id", columnDefinition = "CHAR(2)")
    private String id;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    //câu lệnh này làm cho cái table này là one và table khai báo ở dưới là many có nghĩa là 1 chuyên nghành có thể có nhiều thằng sinh viên và khi dùng lệnh này phải khai báo join column để map sang bên kia
    @JoinColumn(name = "MajorId") // cái sẽ tự gen ra bên class Student 1 cái khóa ngoại mang tên là MajorId
    private List<Student> students = new ArrayList<>();
    public Major() {
    }

    public Major(String id, String name) {
        this.name = name;
        this.id = id;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Major{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
