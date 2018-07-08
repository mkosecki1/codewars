package com.codewars.kyu8.RoboticTattooRemoval;

public class RoboticTattooRemoval {
    public static String[][] robot(String[][] skinScan) {
        for (int i=0; i<skinScan.length; i++){
            for (int n=0; n<skinScan[i].length; n++){
                skinScan[i][n] = skinScan[i][n].replace("X","*");
            }
        }
        return skinScan;
    }

    /*
    public static String[][] robot(String[][] skinScan) {
        return Arrays
            .stream(skinScan)
            .map(x -> Arrays.stream(x).map(y -> y.equals("X") ? "*" : y).toArray(i -> new String[i]))
            .toArray(i -> new String[i][i]);
    }
    */
}
