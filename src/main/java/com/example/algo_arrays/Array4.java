package com.example.algo_arrays;


//WRITE A PROGRAM TO CHECK IF AN ARRAY IS UNIQUE OR NOT
public class Array4 {
    public boolean isUnique(int[] intArray){
        for(int i=0; i<intArray.length; i++){
            for(int j=i+1; j<intArray.length; j++){
                if(intArray[i]==intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
