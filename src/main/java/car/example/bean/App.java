package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context // An interface in Spring (IOC container) which manages the beans and dependencies
                = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBean myBean = (MyBean) context.getBean("myBean");
        // here we are retrieving the bean (myBean) from context (Spring container) using getBean method
        System.out.println(myBean);
    }
}
