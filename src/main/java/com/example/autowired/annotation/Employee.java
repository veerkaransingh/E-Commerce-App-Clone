package com.example.autowired.annotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee") //to register this class as a bean

// Now spring will handle it
public class Employee {

    private int employeeId;
    @Value("Hello") // for giving a value __ to firstName here!
    private String firstName;
    @Value("${java.home}") //for giving a path
    private String lastName;
    @Value("#{4*4}")
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
