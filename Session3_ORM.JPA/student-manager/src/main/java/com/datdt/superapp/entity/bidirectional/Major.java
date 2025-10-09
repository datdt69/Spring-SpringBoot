package com.datdt.superapp.entity.bidirectional;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.*;

@Entity
@Table(name = "Major")
@NoArgsConstructor
@AllArgsConstructor
public class Major {
    @Id
    @Column(name = "Id", columnDefinition = "CHAR(2)")
    private String id;
    @Column(name = "Name", columnDefinition = "NVARCHAR(100)",nullable = false)
    private String name;

    @Override
    public String toString() {
       return String.format("|%2s|%-40s|",id,name);
    }
    @OneToMany(mappedBy = "major", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> stuList = new ArrayList<>();
    public void addStudent(Student student){
        stuList.add(student);
        student.setMajor(this);
    }
    public void removeStudent(Student student){
        stuList.remove(student);
        student.setMajor(null);
    }

    public Major(String id, String name) {
        this.name = name;
        this.id = id;
    }

    public List<Student> getStuList() {
        return stuList;
    }
}
