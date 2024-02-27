package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class model {
    @Id
   private int id;
    private String name;

    private String Color;


    public model(int id, String name, String color) {
        this.id = id;
        this.name = name;
        Color = color;
    }

    public model() {

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

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
     public  String toString()
     {
         return this.id+" "+this.name+" "+this.Color;
     }
}
