package com.codewars.kyu8.BasicMathematicalOperations;

public class BasicOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        switch (op){
            case "+" : return v1 + v2;
            case "-" : return v1 - v2;
            case "*" : return v1 * v2;
            case "/" : return (v2>0) ?  v1 / v2 : Integer.valueOf("Nie dziel przez zero");
        }
        return 0;
    }
}
