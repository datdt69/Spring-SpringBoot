package com.datdt.superapp.infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory emf;

    static{
        try {
            emf = Persistence.createEntityManagerFactory("com.datdt.superapp-PU");
        }
        catch (Exception e) {
            System.out.println( "Failed to create EntityManagerFactory");
            throw new RuntimeException(e);
        }
    }
    private JpaUtil() {
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
    public static void shutdown() {
        emf.close();
    }
}
