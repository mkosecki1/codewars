package com.codewars.kyu8.DoIGetBonus;

public class BonusTime {
    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus){
            return String.valueOf("£"+salary * 10);
        }
        return String.valueOf("£"+salary);
    }

     /* ANOTHER SOLUTIONS:

     public static String bonusTime(final int salary, final boolean bonus) {
        return "\u00A3" + (bonus ? 10 : 1) * salary;
     }

     public static String bonusTime(final int salary, final boolean bonus) {
        return (bonus)?new String("\u00A3"+salary*10):new String("\u00A3"+salary);
     }

     public static String bonusTime(final int salary, final boolean bonus) {
        return "\u00A3" + new Integer((bonus)? salary*10 : salary).toString();
     }

     */
}
