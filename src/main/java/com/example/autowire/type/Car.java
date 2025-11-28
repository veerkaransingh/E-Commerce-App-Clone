package com.example.autowire.type;

public class Car  {
    private Specification specification; //Car needs specification as the dependency
    // Autowiring by type --
    /* spring will lookup for a bean of type specification, find it in xml file, then injects it */

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }


    public void displayDetails(){
        System.out.println("Car Details: "+ specification.toString());

    }
}
