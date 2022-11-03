package com.UST.Hib.Entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="Hib_TBL")

public class Person {

   @Id
    @GeneratedValue
    private int ID, age;
    
    @JsonBackReference
    private Set<Person>person;
    
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDOB() {
        return DOB;
    }
    public void setDOB(Date dOB) {
        DOB = dOB;
    }
    private String name;
    private Date DOB;       
    
}