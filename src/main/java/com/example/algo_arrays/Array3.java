package com.example.algo_arrays;

//WRITE A PROGRAM TO FIND MAXIMUM PRODUCT OF TWO INTEGERS IN THE ARRAY WHERE ALL ELEMENTS ARE POSITIVE?
public class Array3 {
    public String maxProduct(int[] intArray){
        int maxProduct =0;
        String pairs = "";
        for(int i=0; i<intArray.length; i++){
            for(int j=i+1; j<intArray.length; j++){
                if(intArray[i]*intArray[j]>maxProduct){
                    maxProduct = intArray[i]*intArray[j];
                    pairs = Integer.toString(intArray[i])+ "," +Integer.toString(intArray[j]);
                }
            }
        }
        return pairs;
    }
}
