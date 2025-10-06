package com.sneha.day45;
import java.util.Scanner;
public class BinarySearching {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a number to search: ");
            int target =sc.nextInt();
            int flag=0;
            int []arr={1,2,3,4,5,9,10,12};
            int start=0, end=arr.length-1;
            while(start<=end)
            {
                int mid=(start+end)/2;
                if(arr[mid]==target)
                {
                    flag=1;
                    System.out.print("The number "+target+" is found on the index "+mid);
                }
                if(arr[mid]<target)
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            if(flag==0)
            {
                System.out.print("Number "+target+" not found in the array.");
 }}
    }

