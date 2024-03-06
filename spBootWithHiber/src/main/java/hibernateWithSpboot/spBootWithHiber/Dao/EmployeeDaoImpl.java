package hibernateWithSpboot.spBootWithHiber.Dao;

import hibernateWithSpboot.spBootWithHiber.Model.EmployeeModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    @Autowired
    private EntityManager entityManager;
    public List<EmployeeModel>getAllEmployees()
    {
        Session session =entityManager.unwrap(Session.class);
        Query query =session.createQuery("From EmployeeModel",EmployeeModel.class);
        List<EmployeeModel>list=query.getResultList();
        return list;

    }
    public EmployeeModel getEmployeeById(int id)
    {
        Session session =entityManager.unwrap(Session.class);
        String str="From EmployeeModel where id = "+id;
        Query q =session.createQuery(str);
        EmployeeModel emp=(EmployeeModel) q.getSingleResult();
        return emp;

    }

    @Transactional
    public void saveEmployee(EmployeeModel emp)
    {
        Session session =entityManager.unwrap(Session.class);
        session.saveOrUpdate(emp);
    }

    public void deleteEmployeeById(int id){

        Session session =entityManager.unwrap(Session.class);
        String str="Delete from EmployeeModel where id="+id;
        Query q=session.createQuery(str);
        Transaction tx = session.beginTransaction();
        q.executeUpdate();
        tx.commit();

    }

}
