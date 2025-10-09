package com.datdt.fap.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// working with loombok
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private String id;
    private String name;
    private int yob;
    private double gpa;

}
