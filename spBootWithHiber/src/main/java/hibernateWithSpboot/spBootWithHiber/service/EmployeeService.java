package hibernateWithSpboot.spBootWithHiber.service;

import hibernateWithSpboot.spBootWithHiber.Model.EmployeeModel;

import java.util.List;


public interface EmployeeService {

    List<EmployeeModel> getAllEmployees();
    EmployeeModel getEmployeeById(int id);
    void saveEmployee(EmployeeModel emp);

    void deleteEmployeeById(int id);
}
