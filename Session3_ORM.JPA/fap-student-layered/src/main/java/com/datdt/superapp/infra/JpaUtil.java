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
            throw new RuntimeException(e);
        }
    }
    private JpaUtil() {
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public static void closeEntityManagerFactory() {
        emf.close();
    }
}
