package com.codewars.kyu8.CatYearsDogYears;

public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int firstYear = 15;
        int secendYear = 9;
        int nextCatYear = 4;
        int nextDogYear = 5;
        if (humanYears==1){
            return new int[]{humanYears,firstYear,firstYear};
        } else if (humanYears==2){
            return new int[]{humanYears,firstYear+secendYear,firstYear+secendYear};
        }
        int afterTwoYears = humanYears-2;
        return new int[]{humanYears,firstYear+secendYear+(afterTwoYears*nextCatYear),
                firstYear+secendYear+(afterTwoYears*nextDogYear)};
    }
}
