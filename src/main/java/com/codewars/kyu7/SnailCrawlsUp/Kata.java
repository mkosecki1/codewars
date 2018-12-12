package com.codewars.kyu7.SnailCrawlsUp;

public class Kata {
    public static int snail(int column, int day, int night) {
        int counter = 1;
        int height = day;
        while (height<column){
            height += day;
            height -= night;
            counter++;
        }
        return counter;
    }
}