package com.example.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    @Autowired  // field injection
    @Qualifier("employee") // if there are two beans registered with the same name, @qualifier is used.
    private Employee employee;

   // @Autowired // this is doing constructor injection
    //public Manager(Employee employee) {
      //  this.employee = employee;
    //}

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
