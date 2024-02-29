package persistenceLifeCyle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentMain {
    public static void main(String[] args) {
        Student s =new Student("Hritik",12);
        //transient State
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf =config.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx =session.beginTransaction();
        session.save(s);
        //persistence State
        s.setName("Kishan");
        tx.commit();
        session.close();
        //Detech State
        s.setName("Hritik");
    }
}
