package many_to_many;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class project {

    @Id
    private int pId;
    private String projectName;

    @ManyToMany
    private List<Employees> emp;


    public List<Employees> getEmp() {
        return emp;
    }

    public void setEmp(List<Employees> emp) {
        this.emp = emp;
    }


    public project() {
    }

    public project(int pId, String projectName) {
        this.pId = pId;
        this.projectName = projectName;
    }


    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
