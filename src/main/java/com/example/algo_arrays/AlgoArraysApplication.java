package com.example.algo_arrays;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgoArraysApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgoArraysApplication.class, args);

        Array1 mn = new Array1();
        int[] intArray = {2,7,13,15};
        int[] result = mn.twoSum(intArray, 20);
        System.out.println(Arrays.toString(result));

        Array2 rq = new Array2();
        int[] intArray1 = {1,2,3,4,5,6};
        rq.linearSearch(intArray1, 4);


        Array3 rk = new Array3();
        int[] intArray2 = {10,60,30,40,50};
        String pairs = rk.maxProduct(intArray2);
        System.out.println(pairs);


        Array4 rf = new Array4();
        int[] intArray3 = {1,2,3,6,5,7};
        boolean result1 = rf.isUnique(intArray3);
        System.out.println(result1);

        Array5 rg = new Array5();
        int[][]matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rg.rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));

        Array6_sort qr = new Array6_sort();
        int[] arr = {5,4,1,0,5,95,4,-100,200,0};
        int arrSize = 10;
        qr.selectionSort(arr, arrSize);
        qr.obj.printArray(arr, arrSize);

        Array6_sort1 fg = new Array6_sort1();
        int[] arr1 = {2, 5, 7, 8, 9, 4, 3,1};
        int n = 7;
        fg.test(arr1, n);
    }
}
