package com.inventory.util;

/*
 Student Name : K. Sidda Lalith Kumar Reddy
 Register No  : 2400031799
*/

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory =
            new Configuration().configure().buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
