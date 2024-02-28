package one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {
    public static void main(String[] args) {
        question q=new question(1,"who are you");
        Answer a=new Answer(1,"my name is hritik");
        question q1=new question(2,"How old are u");
        Answer a1=new Answer(2,"I am 22 years old");

        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session session=sf.openSession();
        q.setAnswer(a);
        q1.setAnswer(a1);
        Transaction tx = session.beginTransaction();

        session.save(q);
        session.save(a);
        session.save(q1);
        session.save(a1);
        tx.commit();

       question quest= (question) session.get(question.class,2);
        System.out.println(quest);
        System.out.println(quest.getAnswer().getAnswer());

        session.close();
    }
}


