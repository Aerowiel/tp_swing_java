package app;

import java.io.Serializable;

public abstract class Employee implements Serializable {

    public String firstname;
    public String lastname;
    public int age;
    public String dateOfEntry;
    public double salary;

    public Employee(String firstname, String lastname, int age, String dateOfEntry){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.dateOfEntry = dateOfEntry;
    }

    public abstract double calculateSalary();


}
