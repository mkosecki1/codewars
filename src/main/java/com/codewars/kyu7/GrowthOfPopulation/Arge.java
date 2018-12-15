package com.codewars.kyu7.GrowthOfPopulation;

public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int yearCounter = 0;
        int population = p0;
        while (population<p){
            population = population + (int)(population*(percent/100)) + aug;
            yearCounter++;
        }
        return yearCounter;
    }
}