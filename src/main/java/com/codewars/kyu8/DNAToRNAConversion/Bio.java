package com.codewars.kyu8.DNAToRNAConversion;

public class Bio {

    public String dnaToRna(String dna){
        if(dna.contains("T")) {
            return dna.replace("T","U");
        }
        return dna;
    }

    /* ANOTHER SOLUTIONS:

    public String dnaToRna(String dna){
        return dna.replace("T","U");
    }

    public String dnaToRna(String dna){
        char[] arr = dna.toCharArray();
        String rna = "";
        for(int i=0;i<arr.length;i++){
            if((arr[i])=='T'){
                arr[i]='U';
            }
        }
    rna = String.valueOf(arr);
    return rna;
    }
    */


}
