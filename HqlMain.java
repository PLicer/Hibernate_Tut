package HiberbnateQueryLanguage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HqlMain {

    public static void main(String[] args) {
        Configuration config =new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf= config.buildSessionFactory();

        List<Student>ans=HqlMain.getStudents(sf);
        System.out.println(ans);
        Student std = HqlMain.getStudentbyid(sf);
        System.out.println(std);
        List<Student>ans1=HqlMain.getStudentsbycourses(sf);
        System.out.println(ans1);
        List<Student>ans2=HqlMain.getStudentsbyname(sf);
        System.out.println(ans2);
        HqlMain.deleteByid(sf);
        HqlMain.updateByid(sf);

    }

    //update
    private static void updateByid(SessionFactory sf) {
        try(Session session=sf.openSession()){

            session.beginTransaction();
            String string="update Student set course = 'Medical' where id =13";
            Query q =session.createQuery(string);
            int a=q.executeUpdate();
            System.out.println(a+"Rows updates");

        }
        catch (Exception e)
        {
            System.out.println("Sorry");
        }
    }
    //delete
    private static void deleteByid(SessionFactory sf) {
        try(Session sc=sf.openSession()){
            Transaction tx = sc.beginTransaction();
            String string=" delete Student where id=12";
            Query q=sc.createQuery(string);
            int a=q.executeUpdate();
            System.out.println(a+" Rows Deleted...");


        }
        catch (Exception e)
        {
            System.out.println("Sorry");
        }


    }

    //select
    private static List<Student> getStudentsbyname(SessionFactory sf) {
        try(Session sc=sf.openSession()){
            Transaction tx = sc.beginTransaction();
            String string=" from Student where name='Kishan'";
            Query q=sc.createQuery(string);
            List<Student>std=q.list();
            return std;


        }
        catch (Exception e)
        {
            System.out.println("Sorry");
        }
        return null;

    }
    //select
    private static List<Student> getStudentsbycourses(SessionFactory sf) {
        try(Session sc=sf.openSession()){
            Transaction tx = sc.beginTransaction();
            String string=" from Student where course='Btech'";
            Query q=sc.createQuery(string);
            List<Student>std=q.list();
            return std;

        }
        catch (Exception e)
        {
            System.out.println("Sorry");
        }
        return null;
    }
    //select
    private static Student getStudentbyid(SessionFactory sf) {

        try(Session sc=sf.openSession()){
            Transaction tx = sc.beginTransaction();
            String string=" from Student where Roll =:i";
            Query q=sc.createQuery(string);
            q.setParameter("i","14");
            Student std=(Student)q.uniqueResult();
            return std;

        }
        catch (Exception e)
        {
            System.out.println("Sorry");
        }
        return null;
    }

    //select
    public static List<Student> getStudents(SessionFactory s)
    {
        try(Session sc=s.openSession()){
            Transaction tx = sc.beginTransaction();
            String string=" from Student ";
            Query q=sc.createQuery(string);
           List<Student>std=q.list();
            return std;

        }
        catch (Exception e)
        {
            System.out.println("Sorry");
        }
        return null;
    }


}
