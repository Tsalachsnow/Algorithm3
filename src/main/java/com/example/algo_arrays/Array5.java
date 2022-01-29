package com.example.algo_arrays;

//GIVEN AN IMAGE REPRESENTED BY AN N X N MATRIX WRITE A METHOD TO ROTATE THE IMAGE BY 90 DEGREES
public class Array5 {
    public boolean rotateMatrix(int[][] matrix) {
        if (matrix.length==0 || matrix.length !=matrix[0].length) return false;
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n-1-layer;
            for (int i = first; i < last; i++){
                int offset = i-first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }
}
