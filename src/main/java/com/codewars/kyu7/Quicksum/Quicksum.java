package com.codewars.kyu7.Quicksum;

public class Quicksum {
    public int quicksum(String packet){
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int sum = 0;
        for (int i = 0; i < packet.length(); i++) {
            char a = packet.charAt(i);
            if(alph.indexOf(a) < 0 && a != ' ')
                return 0;
            if(a != ' ')
                sum += (i+1) * (alph.indexOf(a)+1);
        }
        return sum;
    }
}