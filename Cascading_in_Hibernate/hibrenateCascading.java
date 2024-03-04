package Cascading_in_Hibernate;

import HiberbnateQueryLanguage.Student;
import many_to_one.answer_new;
import many_to_one.question_new;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class hibrenateCascading {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sf=configuration.buildSessionFactory();
        Session session=sf.openSession();

        question_new q= new question_new();
        q.setQuestionId(12);
        q.setQuestion("Your Favourite Movies?");
        answer_new a=new answer_new();
        a.setAnswerId(123);
        a.setAnswer("Avengers Endgame");
        a.setQ(q);
        answer_new a1=new answer_new();
        a1.setAnswerId(124);
        a1.setAnswer("Avengers Infinity  wars");
        a1.setQ(q);
        answer_new a2=new answer_new();
        a2.setAnswerId(125);
        a2.setAnswer("It");
        a2.setQ(q);
        List<answer_new> list=new ArrayList<>();
        list.add(a);
        list.add(a1);
        list.add(a2);
        q.setAnswer(list);

        Transaction tx=session.beginTransaction();
        session.save(q);

        tx.commit();
        session.close();
        System.out.println("Completed..........");



    }
}
