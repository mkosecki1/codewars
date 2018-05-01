package com.codewars.kyu8.AdamAndEve;

public class God {
    public static Human[] create(){
        return new Human[]{new Man(),new Woman()};
    }

    /* ANOTHER SOLUTIONS:
    public static Human[] create(){
        Human[] human = new Human[2];
        human[0] = new Man();
        human[1] = new Woman();
        return human;
    }
    */
}
