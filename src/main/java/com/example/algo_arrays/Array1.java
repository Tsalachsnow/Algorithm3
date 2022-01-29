package com.example.algo_arrays;


// FIND ALL PAIRS OF INTEGER WHOSE SUM IS EQUAL TO A GIVEN NUMBER
public class Array1 {
    public int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
    }
}
