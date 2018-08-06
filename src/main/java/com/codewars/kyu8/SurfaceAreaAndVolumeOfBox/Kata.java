package com.codewars.kyu8.SurfaceAreaAndVolumeOfBox;

public class Kata {
    public static int[] getSize(int w,int h,int d) {
        int area = 2*w*d + 2*d*h + 2*w*h;
        int volume = w*h*d;
        return new int[] {area,volume};
    }
}
