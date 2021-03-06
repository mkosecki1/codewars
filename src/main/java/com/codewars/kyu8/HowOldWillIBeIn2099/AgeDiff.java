package com.codewars.kyu8.HowOldWillIBeIn2099;

public class AgeDiff {
    public String CalculateAge(int birth, int yearTo) {
        if (birth<yearTo){
            int result = yearTo - birth;
            if (result>1){
                return "You are "+ result +" years old.";
            } else {
                return "You are "+ result +" year old.";
            }
        } else if (birth>yearTo){
            int result = birth - yearTo;
            if (result>1){
                return "You will be born in "+ result +" years.";
            } else {
                return "You will be born in "+ result +" year.";
            }
        }
        return "You were born this very year!";
    }

    /* ANOTHER SOLUTIONS:
    public static String CalculateAge(int birth, int year) {
        final int age = year - birth;
        return
        age == 0 ? "You were born this very year!" :
        age > 0 ? String.format("You are %d year%s old.", age, age == 1 ? "" : "s") :
        String.format("You will be born in %d year%s.", -age, -age == 1 ? "" : "s");
    }
    */
}
