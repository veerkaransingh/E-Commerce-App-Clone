package car.example.bean;

public class MyBean { // Spring Container will be responsible for managing this particular class bean

    /* SPRING CONTAINER -  2 TYPES :
     APPLICATION CONTEXT,
     BEAN FACTORY*/

    private String message;

    public void setMessage(String message){
        this.message = message; // this.message is object's variable
    }
    public void showMessage(){
        System.out.println("Message: " + message);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
