package com.sneha.day42;

import java.util.Scanner;

public class LargestElements {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            int max = row[0];


            for (int j = 0; j < row.length; j++) {
                if (row[j] > max) {
                    max = row[j];
                }
            }
            System.out.println(max);


        }
    }
}

