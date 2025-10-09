package com.datdt.superapp.entity.unione;

import com.datdt.superapp.infra.JpaUtil;
import jakarta.persistence.EntityManager;

public class MainUniOne {
    public static void main(String[] args) {
        createMajorStudents();
    }
    public static void createMajorStudents(){
        Major major1 = new Major("SE","SOFTWARE ENGINEERING|KĨ THUẬT PHẦN MỀM");
        Student student1 = new Student("SE101","Nguyen Van A",1999,8.6);
        Student student2 = new Student("SE102","Nguyen Van B",2000,6.9);
        //cai này là oop liên quan đế các obj với nhau thay vì dùng trực tiếp thằng list ở trong class Major thì chúng ta dùng 1 thăng nữa public nó lên gọi đến hàm list cái này là abstraction
        major1.addStudent(student1);
        major1.addStudent(student2);
        // gio đến phần table trong db, cái này là cascade nó như là hieu ung domino nghia la 1 đi xuống many đi theo(theo dạng one to many)
        // dùng JpaUtil để kết nối đến db
        // trong JpaUtil EntityManagerFactory dùng để gọi ra những cấu hình từ file persistence.xml để kết nối đến db
        // chúng ta có nhà xưởng rồi thì phải có thằng để quản lý thế là phải gọi EntityManager
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(major1);
        em.getTransaction().commit();
        em.close();

    }

}
