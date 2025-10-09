package com.datdt.superapp.entity.unimany;

import com.datdt.superapp.infra.JpaUtil;
import jakarta.persistence.EntityManager;

public class MainUniMany {
    public static void main(String[] args) {
        createMajorStudents();
    }
    public static void createMajorStudents(){
        Major major1 = new Major("SE","SOFTWARE ENGINEERING");
        Student student = new Student("SE100","An Nguyễn",2004,6.9);
        Student student1 = new Student("SE101", "Nguyễn Văn B",2000,6.8);
        student1.setMajor(major1);
        student.setMajor(major1);
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(major1);
        em.persist(student);
        em.persist(student1);
        em.getTransaction().commit();
        em.close();
    }
}
