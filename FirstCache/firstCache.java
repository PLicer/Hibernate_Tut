package FirstCache;

import HiberbnateQueryLanguage.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class firstCache {
    public static void main(String[] args) {
        Configuration configuration =new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sf=configuration.buildSessionFactory();
        // session is open here
        Session session =sf.openSession();
        Student std=(Student) session.get(Student.class,17);
        System.out.println(std);
        System.out.println("Working Something..............");
        Student std1=(Student) session.get(Student.class,17);
        System.out.println(std1);
        //session is closed here.....
        session.close();
        //session1 is open here..............

        System.out.println("session is closed.............");

        Session session1 = sf.openSession();
        Student std2=(Student) session1.get(Student.class,17);
        System.out.println(std2);
        //session1 is closed here............
        session1.close();


    }
}
