package com.codewars.kyu8.LeonardoDicaprioOscars;

public class Kata {
    public static String leo(final int oscar) {
        String massage;
        switch (oscar){
            case 86: massage = "Not even for Wolf of wallstreet?!"; break;
            case 88: massage = "Leo finally won the oscar! Leo is happy"; break;
            default: massage = oscar<88 ? "When will you give Leo an Oscar?" :  "Leo got one already!";
        }
        return massage;
    }
}
