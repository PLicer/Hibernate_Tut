package hibernateWithSpboot.spBootWithHiber.Dao;

import hibernateWithSpboot.spBootWithHiber.Model.EmployeeModel;

import java.util.List;

public interface EmployeeDao {
    List<EmployeeModel>getAllEmployees();
    EmployeeModel getEmployeeById(int id);
    void saveEmployee(EmployeeModel emp);

    void deleteEmployeeById(int id);

}
