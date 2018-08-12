package com.codewars.kyu8.PythagoreanTriple;

public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple){
        return (triple[2]>triple[1] && triple[2]>triple[0] &&
                (Math.pow(triple[2],2) == Math.pow(triple[0],2) + Math.pow(triple[1],2))) ? 1 : 0;
    }
}