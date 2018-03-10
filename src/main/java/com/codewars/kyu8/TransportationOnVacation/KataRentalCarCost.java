package com.codewars.kyu8.TransportationOnVacation;

public class KataRentalCarCost {
    public static int rentalCarCost(int d) {
        int cost = d * 40;
        if (d<3){
            return cost;
        } else if (d>=3 && d<7){
            return cost - 20;
        }
        return cost - 50;
    }

    /* ANOTHER SOLUTIONS:

    public static int rentalCarCost(int d) {
        final int COST_PER_DAY = 40;
        return d * COST_PER_DAY - (d >= 7 ? 50 : d >= 3 ? 20 : 0);
    }

    static final int PRICE_PER_DAY = 40;

    public static int rentalCarCost(int d) {
        int totalPrice = PRICE_PER_DAY * d;
        int discount = 0;
        if (d >=7) discount = 50;
        else if (d>=3) discount = 20;
        return totalPrice - discount;
    }

    */
}
