package com.codewars.kyu8.WelcomeToTheCity;

public class Hello {
    public String sayHello(String [] name, String city, String state){
        String allName = String.join(" ",name);
        return "Hello, " + String.join(" ",name) + "! Welcome to " + city + ", " + state + "!";
    }
}
