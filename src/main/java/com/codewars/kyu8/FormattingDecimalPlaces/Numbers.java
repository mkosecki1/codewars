package com.codewars.kyu8.FormattingDecimalPlaces;

public class Numbers {
    public static double TwoDecimalPlaces(double number) {
        return Math.round(number *100.0)/100.0;
    }
}
