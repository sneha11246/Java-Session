package com.sneha.day47;

public class Hard {
     public static int selectionSortAndCountSwaps(int[] arr) {
            int n = arr.length;
            int swapCount = 0;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                    swapCount++;
                }
            }
            return swapCount;
        }
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int[] numbers = {29, 10, 14, 37, 13, 5, 20, 25, 8, 17};
            System.out.println("Original Array:");
            printArray(numbers);
            int totalSwaps = selectionSortAndCountSwaps(numbers);
            System.out.println("Sorted Array:");
            printArray(numbers);
            System.out.println("Total number of swaps: " + totalSwaps);
        }
    }
