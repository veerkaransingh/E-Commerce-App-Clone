package com.ioc.coupling;



public class UserManager {

    private UserDataProvider/*an interface*/ userDataProvider; //Reference of an interface
    public UserManager(UserDataProvider userDataProvider) { // Arg- constructor -- Dendency Injection
        this.userDataProvider = userDataProvider;

    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();

    }
}
