package com.example.autowire.name;

public class Car  {
    private Specification specification; //Car needs specification as the dependency
    //we are implementing autowiring by name basically ;; specification name which is mentioned in xml file

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }


    public void displayDetails(){
        System.out.println("Car Details: "+ specification.toString());

    }
}
