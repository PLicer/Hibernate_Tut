package hibernateWithSpboot.spBootWithHiber.Model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Emp_Table")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;

    @Column(name="Emp_name")
    private String name;

    @Column(name="Emp_Department")
    private String department;

    @Column(name="Emp_Gender")
    private String gender;

    @Column(name="Emp_DOB")
    private Date dob;

    public EmployeeModel() {
    }

    public EmployeeModel(int id, String name, String department, String gender, Date dob) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.gender = gender;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
