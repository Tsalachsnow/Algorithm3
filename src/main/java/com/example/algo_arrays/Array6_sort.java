package com.example.algo_arrays;

//ARRAY SORTING ALGORITHM
public class Array6_sort {
    static Helper obj = new Helper();

    public static void selectionSort(int[] arr, int arrSize) {
        int minInd;
        //traverse through all elements of the array
        for (int i = 0; i < arrSize; i++) {
            //find the minimum element in the unsorted array
            minInd = obj.findMin(arr, i, arrSize - 1);
            //Swap the found minimum element with the leftmost unsorted element
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }

}

