package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetchDemo {
    public static void main(String[] args) {
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf= config.buildSessionFactory();
        Session session =sf.openSession();
        model m =(model)session.get(model.class,93);
        System.out.println(m);



    }
}
