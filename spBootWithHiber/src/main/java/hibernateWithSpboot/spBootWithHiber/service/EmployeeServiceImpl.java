package hibernateWithSpboot.spBootWithHiber.service;

import hibernateWithSpboot.spBootWithHiber.Dao.EmployeeDao;

import hibernateWithSpboot.spBootWithHiber.Model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao empl;

    @Transactional
    @Override
    public List<EmployeeModel> getAllEmployees() {
        return empl.getAllEmployees();
    }

    @Override
    public EmployeeModel getEmployeeById(int id) {
        return empl.getEmployeeById(id);
    }

    @Override
    public void saveEmployee(EmployeeModel emp) {
        empl.saveEmployee(emp);


    }

    @Override
    public void deleteEmployeeById(int id) {
        empl.deleteEmployeeById(id);
    }
}
