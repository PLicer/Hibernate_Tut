package many_to_many;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Employees {

    @Id
    private int empid;
    private String empName;

    @ManyToMany
    @JoinTable(
            name = "EmployeeToProject",
            joinColumns={@JoinColumn(name = "eId")},
            inverseJoinColumns = {@JoinColumn(name = "pId")}

    )
    private List<project>proj;



    public List<project> getProj() {
        return proj;
    }

    public void setProj(List<project> proj) {
        this.proj = proj;
    }



    public Employees() {
    }

    public Employees(int empid, String empName) {
        this.empid = empid;
        this.empName = empName;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
