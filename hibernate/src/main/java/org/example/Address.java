package org.example;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Model_Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Address_id;

    @Column(name="STREET")
    private int Street;

    @Column(name="CITY")
    private String city;


    @Column(name="ISOPEN")
    private boolean isopen;

    @Transient
    private double x;

    @Column(name="Added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;


   @Lob
    private byte[] image;

    public Address(int address_id, int street, String city, boolean isopen, double x, byte[] image, Date addedDate) {
        Address_id = address_id;
        Street = street;
        this.city = city;
        this.isopen = isopen;
        this.x = x;
        this.image = image;
        this.addedDate = addedDate;
    }



    public Address() {
    }

    public int getAddress_id() {
        return Address_id;
    }

    public void setAddress_id(int address_id) {
        Address_id = address_id;
    }

    public int getStreet() {
        return Street;
    }

    public void setStreet(int street) {
        Street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isIsopen() {
        return isopen;
    }

    public void setIsopen(boolean isopen) {
        this.isopen = isopen;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
