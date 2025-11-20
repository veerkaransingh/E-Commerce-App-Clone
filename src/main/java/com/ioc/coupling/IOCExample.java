package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationIOCLooseCouplingExample.xml");



       /* UserDataProvider databaseProvider = new UserDatabaseProvider(); // Created the reference of an interface and assigned to object of a class
        UserManager userManagerWithDB = new UserManager(databaseProvider);

         Now we will be using beans instead of doing it manually which spring will manage ( IOC) */
        UserManager userManagerWithDB =
                (UserManager) applicationContext.getBean("userManagerWithUserDatabaseProvider");
        System.out.println(userManagerWithDB.getUserInfo());

        /*UserDataProvider webServiceProvider = new WebServiceDataProvider();
        UserManager userManagerWithWebService = new UserManager(webServiceProvider);*/

        UserManager userManagerWithWebService =
                (UserManager) applicationContext.getBean("userManagerWithWebServiceDataProvider");
        System.out.println(userManagerWithWebService.getUserInfo());



       /* UserDataProvider newDatabaseProvider = new NewDatabaseProvider();
        UserManager userManagerWithNewDatabase = new UserManager(newDatabaseProvider);*/

        UserManager userManagerWithNewDatabase =
                (UserManager) applicationContext.getBean("userManagerWithNewDatabaseProvider");
        System.out.println(userManagerWithNewDatabase.getUserInfo());
    }
}
