package com.sneha.day39;

public class PatternHard {
    public static void main(String[] args) {
        int n=4;
        for (int i=4;i>=1;i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.println(" ");
            }

            System.out.println("*");

        }
    }
}
