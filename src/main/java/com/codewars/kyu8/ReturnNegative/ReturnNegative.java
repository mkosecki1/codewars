package com.codewars.kyu8.ReturnNegative;

public class ReturnNegative {
    public static int makeNegative(final int x) {
        if(x>0){
            return x * (-1);
        }
        return x;
    }

     /* ANOTHER SOLUTIONS:

     public static int makeNegative(final int x) {
        return (x < 0) ? x : -x;
     }

     public static int makeNegative(final int x) {
        int neg = Math.abs(x)*-1; return neg;
     }

     */
}
