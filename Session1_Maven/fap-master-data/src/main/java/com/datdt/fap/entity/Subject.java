package com.datdt.fap.entity;

public class Subject {
    private String code;
    private String name;
    private int credit;
    private double hours;

    public Subject() {
    }

    public Subject(String code, String name, int credit, double hours) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.hours = hours;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", credit=" + credit +
                ", hours=" + hours +
                '}';
    }
}
