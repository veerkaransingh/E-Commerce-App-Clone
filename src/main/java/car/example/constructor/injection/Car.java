package car.example.constructor.injection;

public class Car  {
    private Specification specification; //Car needs specification as the dependency

    public Car(Specification specification) { //Here dependency is being injected with help of a constructor
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: "+ specification.toString());

    }
}
