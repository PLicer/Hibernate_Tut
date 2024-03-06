package hibernateWithSpboot.spBootWithHiber.contoller;

import hibernateWithSpboot.spBootWithHiber.Model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import hibernateWithSpboot.spBootWithHiber.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class employeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getallemp")
    public List<EmployeeModel> getListOfEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @PostMapping("/postemp")
    public String saveEmployee(@RequestBody  EmployeeModel empl)
    {
        employeeService.saveEmployee(empl);
        return "Save in DB";
    }
    @GetMapping("/getbyid/{id}")
    public EmployeeModel getEmployeeById(@PathVariable int id)
    {
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping("/deletebyid/{id}")
    public String deleteEmployeeById(@PathVariable int id)
    {
        employeeService.deleteEmployeeById(id);
        return "Delete Action Performed Succesfully.......";
    }
    @PutMapping("/update")
    public EmployeeModel updateEmployeeById(@RequestBody EmployeeModel empl)
    {
        employeeService.saveEmployee(empl);
        return empl;
    }
}
