package com.codewars.kyu8.AreYouPlayingBanjo;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return (name.substring(0,1).toUpperCase().equals("R")) ? name + " plays banjo" :
                name + " does not play banjo";
    }
}
