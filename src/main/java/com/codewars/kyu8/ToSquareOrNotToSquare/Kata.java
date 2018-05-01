package com.codewars.kyu8.ToSquareOrNotToSquare;

public class Kata {
    public static int[] squareOrSquareRoot(int[] array){
        for(int i=0;i<array.length;i++){
            if (Math.sqrt(array[i]) % 1  == 0) array[i] = (int)(Math.sqrt(array[i]));
            else array[i] = array[i] * array[i];
        }
        return array;
    }

    /* ANOTHER SOLUTIONS:

    public static int[] squareOrSquareRoot(int[] array)
    {
    return Arrays.stream(array)
          .map(i -> Math.sqrt(i) % 1 == 0 ? ((int) Math.sqrt(i)) : (i * i))
          .toArray();
    }

     */
}
