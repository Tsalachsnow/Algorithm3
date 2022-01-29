package com.example.algo_arrays;

//WRITE A PROGRAM TO CHECK IF AN ARRAY CONTAINS A NUMBER IN JAVA
public class Array2 {

    public  void linearSearch(int[] intArray, int value){
        for (int i = 0; i < intArray.length; i++){
            if (intArray[i]==value){
                System.out.println("value is found at the index of "+i);
                return;
            }
        }
        System.out.println(value+" is not found");
    }
}
