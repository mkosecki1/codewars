package com.codewars.kyu8.AStrangeTripToTheMarket;

public class Nessie {
    public static boolean isLockNessMonster(String s){
        if (s.contains("tree fiddy")){
            return true;
        } else if (s.contains("3.50")){
            return true;
        }
        return false;
    }

    /* ANOTHER SOLUTIONS:
    public static boolean isLockNessMonster(String s){
        return s.contains("tree fiddy") || s.contains("3.50");
     */
}
