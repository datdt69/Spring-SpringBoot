package com.datdt.superapp.entity.bidirectional;

import com.datdt.superapp.infra.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class MainBiDirection {
    public static void main(String[] args) {
        getAll();
    }
    public static void getAll(){
        EntityManager em = JpaUtil.getEntityManager();
        Major major = em.find(Major.class, "SE");
        Major major1 = em.find(Major.class, "GD");
        System.out.println("THe list of major SE:");
        System.out.println(major);
        System.out.println("THe list of major GD:");
        System.out.println(major1);
        List<Student> students = major.getStuList();
        students.forEach(st -> System.out.println(st));
        em.close();
    }
    public static void createStudentMajor(){
        Major se = new Major("SE","SOFTWARE ENGINEERING");
        Major gd = new Major("GD","GAME DEVELOPMENT");

        Student student1 = new Student("SE101","Nguyen Van A",1999,8.6);
        Student student2 = new Student("SE102","Nguyen Van B",2000,6.9);
        Student student3 = new Student("GD103","Nguyen Van C",2001,7.8);
        Student student4 = new Student("GD104","Nguyen Van D",2002,9.1);
        Student student5 = new Student("GD105","Nguyen Van E",2003,8.4);

        se.addStudent(student1);
        se.addStudent(student2);
        gd.addStudent(student3);
        gd.addStudent(student4);
        gd.addStudent(student5);

        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(se);
        em.persist(gd);
        em.getTransaction().commit();
        em.close();

    }
}
