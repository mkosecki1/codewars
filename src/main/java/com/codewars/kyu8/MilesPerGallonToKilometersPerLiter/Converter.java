package com.codewars.kyu8.MilesPerGallonToKilometersPerLiter;

import java.math.BigDecimal;

public class Converter {
    public static float mpgToKPM(final float mpg) {
        return BigDecimal.valueOf(mpg * 0.354).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
    }
}
