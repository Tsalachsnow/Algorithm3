package com.example.algo_arrays;
//ARRAY SELECTION SORT
public class Array6_sort1 {
    static void test(int[] arr1, int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < (n - 1); j++) {
                int k = j + 1;
                int a = arr1[j];
                int b = arr1[k];
                if (b < a) {
                    int temp1 = a;
                    int temp2 = b;
                    arr1[j] = temp2;
                    arr1[k] = temp1;
                }
            }
        }
        for (int d = 0; d < n; d++) {
            System.out.println(arr1[d] + " ");
        }
    }

}
