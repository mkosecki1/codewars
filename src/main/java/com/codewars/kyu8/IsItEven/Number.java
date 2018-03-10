package com.codewars.kyu8.IsItEven;

public class Number {
    public boolean isEven(double n) {
        if((n % 2) == 0){
            return true;
        }
        return false;
    }

     /* ANOTHER SOLUTIONS:

     public boolean isEven(double n) {
         return n % 2 == 0;
     }

     public boolean isEven(double n) {
        return n % 2 == 0 ? true : false;
    }

      */
}
