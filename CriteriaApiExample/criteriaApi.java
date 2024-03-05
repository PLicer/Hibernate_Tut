package CriteriaApiExample;

import HiberbnateQueryLanguage.Student;
import javax.persistence.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;

public class criteriaApi {
    public static void main(String[] args) {
        Configuration configuration =new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();
        Criteria cs= session.createCriteria(Student.class);
        cs.add(Restrictions.lt("Roll",14));
        List<Student>list=cs.list();
        for(Student s:list)
        {
            System.out.println(s);
        }
    }
}


