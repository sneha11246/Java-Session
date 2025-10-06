package com.sneha.day50;
import java.util.Scanner;
public class Reverse {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            StringBuilder sb = new StringBuilder(input);
            sb.reverse();
            System.out.println("Reversed String: " + sb.toString());
            scanner.close();
        }
    }
