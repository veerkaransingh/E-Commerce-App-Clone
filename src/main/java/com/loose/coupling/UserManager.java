package com.loose.coupling;


// In loose-coupling, UserManager is using an interface(a contract) rather than a concrete class.
// So, what class is implementing UserDataProvider interface, can make use of UserManager
public class UserManager {

    private UserDataProvider/*an interface*/ userDataProvider; //Reference of an interface
    public UserManager(UserDataProvider userDataProvider) { // Arg- constructor
        this.userDataProvider = userDataProvider;

    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();

    }
}
