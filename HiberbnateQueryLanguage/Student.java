package HiberbnateQueryLanguage;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    private String name;
    @Id
    private int Roll;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    private String course;


    public Student() {
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    private String State;


    public Student(String name, int roll) {
        this.name = name;
        Roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    @Override
    public String toString()
    {
        return this.getName()+" "+this.getRoll()+" "+this.getState();
    }
}
