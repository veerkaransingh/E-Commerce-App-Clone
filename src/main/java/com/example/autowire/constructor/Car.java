package com.example.autowire.constructor;

public class Car  {
    private Specification specification; //Car needs specification as the dependency

    /*implementing autowiring by constructor, needs to have a constructor in Car class*/

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: "+ specification.toString());

    }
}
