package com.sneha.day47;

public class SortArray {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {20, 50, 40, 10, 30};
        System.out.println("Before Insertion Sort:");
        printArray(numbers);
        insertionSort(numbers);
        System.out.println("After Insertion Sort:");
        printArray(numbers);
    }
}


