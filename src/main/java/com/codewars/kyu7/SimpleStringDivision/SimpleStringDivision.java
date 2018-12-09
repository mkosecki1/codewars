package com.codewars.kyu7.SimpleStringDivision;

public class SimpleStringDivision {
    public static int solve(String s, int k) {
        String[] cutOfS = s.split(" ");
        int counter = 0;
        for (int i=0;i<cutOfS.length;i++) {
            for (int n=0;n<cutOfS.length;n++){
                if(i!=n){
                    if ((Integer.parseInt(cutOfS[i] + cutOfS[n]) % k == 0)){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}