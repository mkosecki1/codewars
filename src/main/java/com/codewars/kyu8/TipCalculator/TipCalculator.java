package com.codewars.kyu8.TipCalculator;

public class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        String theReting = rating.toLowerCase();
        if (theReting.equals("terrible")){
            return Math.toIntExact((long) Math.ceil(amount * 0));
        } else if (theReting.equals("poor")) {
            return Math.toIntExact((long) Math.ceil(amount * 0.05));
        } else if (theReting.equals("good")) {
            return Math.toIntExact((long) Math.ceil(amount * 0.10));
        } else if (theReting.equals("great")) {
            return Math.toIntExact((long) Math.ceil(amount * 0.15));
        } else if (theReting.equals("excellent")) {
            return Math.toIntExact((long) Math.ceil(amount * 0.20));
        }
        return null;
    }

     /* ANOTHER SOLUTIONS:

     public static Integer calculateTip(double amount, String rating) {
        switch(rating.toLowerCase()) {
            case "terrible": return 0;
            case "poor": return (int) Math.ceil(amount * 0.05);
            case "good": return (int) Math.ceil(amount * 0.1);
            case "great": return (int) Math.ceil(amount * 0.15);
            case "excellent": return (int) Math.ceil(amount * 0.2);
            default: return null;
    }
  }


     */
}
