package com.codewars.kyu8.GetFullName;

public class Dinglemouse {

    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if(firstName != null && lastName != null){
            if (firstName.equals("")){
                return lastName;
            }
            if (lastName.equals("")){
                return firstName;
            }
            return firstName + " " + lastName;
        } else {
            throw new NullPointerException("Null!");
        }
    }
}
