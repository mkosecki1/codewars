package com.codewars.kyu8.ThisIsAProblem;

import lombok.Getter;

@Getter
public class NameMe {
    private String firstName;
    private String lastName;
    private String fullName;

    public NameMe(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = String.join(" ", firstName, lastName);
    }
}
