package com.codewars.kyu7.AlphabetWar;

import java.util.HashMap;

public class Kata{
    public static String alphabetWar(String fight){
        HashMap<Character, Integer> letters = new HashMap<>();
        letters.put('w', 4);
        letters.put('p', 3);
        letters.put('b', 2);
        letters.put('s', 1);
        letters.put('m', -4);
        letters.put('q', -3);
        letters.put('d', -2);
        letters.put('z', -1);

        int total = 0;

        for (Character letter : fight.toCharArray()){
            if (letters.containsKey(letter))
                total += letters.get(letter);
        }

        if (total == 0) return "Let's fight again!";
        return total > 0 ? "Left side wins!" : "Right side wins!";
    }
}