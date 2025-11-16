package com.tight.coupling;


// In tight coupling (never scalable), UserManager is bound to a UserDatabase!
public class UserManager {
    private UserDatabase userDatabase = new UserDatabase();


    public String getUserInfo(){
        return userDatabase.getUserDetails();

    }
}
