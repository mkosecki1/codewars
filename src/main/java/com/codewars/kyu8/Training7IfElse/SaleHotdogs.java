package com.codewars.kyu8.Training7IfElse;

public class SaleHotdogs {
    public static int saleHotdogs(final int n){
        if (n<5) {
            return n*100;
        } else if (n>=5 && n<10){
            return n*95;
        }
        return n*90;
    }
}
