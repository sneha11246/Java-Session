package com.sneha.day39;

public class table {
    public static void main(String[] args) {
        for (int i=2;i<=5;i++) {
            System.out.println("table of "+i);
            for (int j = 1; j <= 10; j++)
                System.out.println(i+"x"+j+"="+(i*j));
        }
        System.out.println();
    }

}
