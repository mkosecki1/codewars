package com.codewars.kyu8.IfYouCantSleep;

class Kata {
    public static String countingSheep(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=1; i<=num;i++){
            stringBuilder.append(i).append(" sheep...");
        }
        return stringBuilder.toString();
    }
}
