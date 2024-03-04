package HiberbnateQueryLanguage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {
    public static void main(String[] args) {
        Student s =new Student("Hritik",12);
        s.setState("Haryana");
        s.setCourse("Btech");
        Student s1=new Student("Kishan",13);
        s1.setState("Mumbai");
        s1.setCourse("Btech");
        Student s3=new Student("Vishal",14);
        s3.setState("UP");
        s3.setCourse("Diploma");
        //transient State
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf =config.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx =session.beginTransaction();
        session.save(s);
        session.save(s1);
        session.save(s3);
        //persistence State

        tx.commit();
        session.close();
        //Detech State
        s.setName("Hritik");
    }
}
