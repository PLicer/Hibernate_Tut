package many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class main2 {
    public static void main(String[] args) {
       Configuration config = new Configuration();
       config.configure("hibernate.cfg.xml");
        SessionFactory sf =config.buildSessionFactory();


        Employees e1 = new Employees(1,"Hritik");
        Employees e2=new Employees(2,"Neha");
        Employees e3=new Employees(3,"Rohit");
        Employees e4 =new Employees(4,"Mohan");
        List<Employees>list1=new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        project p1=new project(1,"Library Management System");
        project p2 =new project(2,"Erp Portal");

        p1.setEmp(list1);
        List<Employees>list2=new ArrayList<>();
        list2.add(e1);
        list2.add(e2);
        list2.add(e3);
        p2.setEmp(list2);
        List<project>list3=new ArrayList<>();
        list3.add(p1);
        list3.add(p2);
        e1.setProj(list3);
        List<project>list4=new ArrayList<>();
        list4.add(p1);
        e2.setProj(list3);
        e3.setProj(list4);
     Session session = sf.openSession();
     Transaction tx = session.beginTransaction();
     session.save(e1);
     session.save(e2);
     session.save(e3);
     session.save(e4);
     session.save(p1);
     session.save(p2);
        tx.commit();
        session.close();

    }
}
