package com.datdt.superapp.repository;

import com.datdt.superapp.entity.Student;
import com.datdt.superapp.infra.JpaUtil;
import jakarta.persistence.EntityManager;

import java.util.List;

public class StudentRepo {
    public void save(Student student){
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }
    public List<Student> findAll(){
        EntityManager em = JpaUtil.getEntityManager();
        return em.createQuery("FROM Student", Student.class).getResultList();
    }
}
