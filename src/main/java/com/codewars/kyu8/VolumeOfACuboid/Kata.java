package com.codewars.kyu8.VolumeOfACuboid;

public class Kata {

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return (length <= 0 || width <= 0 || height <=0) ? 0 : length * width * height ;
    }
}