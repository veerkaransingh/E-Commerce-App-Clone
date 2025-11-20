package car.example.setter.injection;

public class Car  {
    private Specification specification; //Car needs specification as the dependency

   public void setSpecification(Specification specification) { // Here dependency is being injected with help of a setter -- setter injection
       this.specification = specification;
   }
    public void displayDetails(){
        System.out.println("Car Details: "+ specification.toString());

    }
}
