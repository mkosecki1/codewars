package com.codewars.kyu8.DuckDuckGoose;

public class Kata {
    public static String duckDuckGoose(Player[] players, int goose) {
        int index = (goose - 1) % players.length;
        System.out.println(index);
        return players[index].name;
    }
}