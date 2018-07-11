package com.codewars.kyu8.GetTheMiddleCharacter;

import java.util.Scanner;

class Kata {
    public static String getMiddle(String word) {
        int index = 0;
        if (word.length() % 2 == 0) {
            index = word.length() / 2;
            String searchedValue = String.valueOf(word.charAt(index - 1)) + String.valueOf(word.charAt(index));
            System.out.println("The searched even value is: " + searchedValue);
            return searchedValue;
        } else {
            index = word.length() / 2;
            String searchedValue = String.valueOf(word.charAt(index));
            System.out.println("The searched odd value is: " + searchedValue);
            return searchedValue;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String seekWord = sc.next();
        getMiddle(seekWord);
        sc.close();
    }
}
