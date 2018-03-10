package com.codewars.kyu8.NumberOfPeopleInTheBus;

import java.util.ArrayList;

public class Metro {

    public static int countPassengers(ArrayList<int[]> stops){
        int enter = 0;
        int leave = 0;
        for (int[] stop : stops) {
            enter += stop[0];
            leave += stop[1];
        }
        return enter - leave;
    }

     /* ANOTHER SOLUTIONS:

    public static int countPassengers(ArrayList<int[]> stops){
        return stops.stream().mapToInt(n-> n[0]- n[1]).sum();
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int sum = 0;
        for(int[] i : stops){
        sum += i[0]-i[1];
        }
        return sum;
    }
    */
}
