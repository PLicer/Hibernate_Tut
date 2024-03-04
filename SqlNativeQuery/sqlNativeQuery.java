package SqlNativeQuery;

import HiberbnateQueryLanguage.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.List;


public class sqlNativeQuery {
    public static void main(String[] args) {

        Configuration configuration =new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();

        //SqlQuery

        String sqlQuery = "SELECT * FROM Student where name like 'a%' or length(name) = 4";
         NativeQuery<Student> query = session.createNativeQuery(sqlQuery,Student.class);
         List<Student> list=query.list();
        for (Student st:list)
        {
            System.out.println(st.getRoll()+" "+st.getName()+" "+st.getState()+" "+st.getCourse());
        }


    }
}
