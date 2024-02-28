package many_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class main1 {
    public static void main(String[] args) {
        question_new q = new question_new(1,"what are your Hobbies");
        answer_new a=new answer_new(1,"i love playing Cricket");
        a.setQ(q);
        answer_new a1=new answer_new(2,"i love solving puzzels");
        a1.setQ(q);
        answer_new a2 =new answer_new(3,"i love coding");
        a2.setQ(q);
        List<answer_new>list = new ArrayList<>();
        list.add(a);
        list.add(a1);
        list.add(a2);
        q.setAnswer(list);
        Configuration config =new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx =session.beginTransaction();

        session.save(q);
        session.save(a);
        session.save(a1);
        session.save(a2);

        tx.commit();

        question_new quest=(question_new) session.get(question_new.class,1);
        System.out.println(quest.getQuestion());
        List<answer_new>list1=quest.getAnswer();
        for(answer_new ans:list1)
        {
            System.out.println(ans);
        }
        session.close();
    }
}
