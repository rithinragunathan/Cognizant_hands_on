package com.cognizant.javaframeworks;

public class LoginAuthenticator {
    public boolean authenticate(String usr, String pwd) {
        return usr.equals("admin") && pwd.equals("admin");
    }
}
