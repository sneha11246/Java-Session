package com.sneha.day39;

import java.util.Scanner;

public class EvenSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n =input.nextInt();
        int sum=0;
        int i=1;
        while( i<=n)
        {
            if (i%2==0)
            {
                sum+=i;
            }
            i++;
        }
        System.out.println("sum of even number"+sum);
    }
}

