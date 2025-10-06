package com.sneha.day43;

import java.util.Scanner;

public class Cache {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the cache size");
        int n=input.nextInt();
        input.nextLine();

        String arr[]=new String[n];
        int count=0;
       for (int i=0;i<n;i++)
       {
           System.out.println("enter"+i+1+"data");
           arr[i]=input.nextLine();
       }
       for (int i=n-1;i>0;i--)
       {
           arr[i]=arr[i-1];
           System.out.println(arr[i]);
       }
        System.out.println();


    }
}