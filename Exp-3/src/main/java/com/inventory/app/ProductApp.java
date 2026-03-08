package com.inventory.app;

/*
 Student Name : K. Sidda Lalith Kumar Reddy
 Register No  : 2400031799
*/

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.inventory.entity.Product;
import com.inventory.util.HibernateUtil;

public class ProductApp {
    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p1 = new Product("Laptop", "Gaming Laptop", 75000, 10);
        Product p2 = new Product("Mouse", "Wireless Mouse", 1200, 50);

        session.save(p1);
        session.save(p2);

        tx.commit();
        session.close();
    }
}
