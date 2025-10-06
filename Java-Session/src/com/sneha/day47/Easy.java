package com.sneha.day47;

public class Easy {
        public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            int[] numbers = {64, 25, 12, 22, 11, 35};

            System.out.println("Before Selection Sort:");
            printArray(numbers);

            selectionSort(numbers);

            System.out.println("After Selection Sort:");
            printArray(numbers);
        }
    }


