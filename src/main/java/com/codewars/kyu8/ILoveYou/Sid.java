package com.codewars.kyu8.ILoveYou;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        switch (nb_petals %6){
            case 1:
               return "I love you";
            case 2:
                return "a little";
            case 3:
                return "a lot";
            case 4:
                return "passionately";
            case 5:
                return "madly";
            case 0:
                return "not at all";
            default:
                break;
        }
        return "Wrong number";
    }
}