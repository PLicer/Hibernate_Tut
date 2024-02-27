package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;


public class Main {
    public static void main(String[] args)throws IOException {
        System.out.println("Started............");
       model m1 =new model();

        model m3 =new model(91,"pankaj","medium fair");

        Address addr =new Address();
        addr.setAddedDate(new Date());
        addr.setCity("Faridabad");
        addr.setAddress_id(1);
        addr.setIsopen(true);
        addr.setStreet(24);
        addr.setX(1222.9);

       Configuration config = new Configuration();
       config.configure("hibernate.cfg.xml");
       SessionFactory sf =config.buildSessionFactory();
        FileInputStream fs =new FileInputStream("src/main/java/pic.png");
        byte[] data =new byte[fs.available()];
        fs.read(data);
        addr.setImage(data);
       Session session = sf.openSession();
       Transaction tr=session.beginTransaction();
       session.save(m3);
       session.save(addr);
       tr.commit();

       session.close();
        System.out.println(m3);
    }
}