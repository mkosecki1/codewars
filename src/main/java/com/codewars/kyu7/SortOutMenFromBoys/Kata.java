package com.codewars.kyu7.SortOutMenFromBoys;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Kata {
    public static int[] menFromBoys(final int[] values) {
        List<Integer> menList = new LinkedList<>();
        List<Integer> boysList = new LinkedList<>();

        for (int i=0;i<values.length;i++) {
            if (values[i] % 2 == 0) {
                menList.add(values[i]);
            } else{
                boysList.add(values[i]);
            }
        }

        Collections.sort(menList);
        Collections.sort(boysList,Collections.reverseOrder());

        menList.addAll(boysList);

        int[] array = menList.stream().mapToInt(i->i).toArray();

        int j = 0;
        int i = 1;
        while(i < array.length){
            if(array[i] == array[j]){
                i++;
            }else{
                array[++j] = array[i++];
            }
        }
        int[] menAndBoys = new int[j+1];
        for(int k=0; k<menAndBoys.length; k++){
            menAndBoys[k] = array[k];
        }

        return menAndBoys;
    }
}