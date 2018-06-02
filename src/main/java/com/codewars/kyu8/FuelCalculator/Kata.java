package com.codewars.kyu8.FuelCalculator;

public class Kata {
    public static double fuelPrice(int litres, double pricePerLiter) {
        return litres * (pricePerLiter - Math.min(litres / 2 * 0.05, 0.25));
    }
}
