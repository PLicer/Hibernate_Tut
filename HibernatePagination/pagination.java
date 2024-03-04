package HibernatePagination;

import HiberbnateQueryLanguage.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;


public class pagination {

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sf =configuration.buildSessionFactory();
        Session session =sf.openSession();
        Query<Student> query =session.createQuery("from Student",Student.class);

        //Implementing Pagination using Hibernate--->>
        query.setFirstResult(2);  // wants to Start from
        query.setMaxResults(5);    //Total page size u want
        List<Student> list=query.list();
        for(Student st:list)
        {
            System.out.println(st.getRoll()+" "+st.getName()+" "+st.getState()+" "+st.getCourse());
        }
    }


}
