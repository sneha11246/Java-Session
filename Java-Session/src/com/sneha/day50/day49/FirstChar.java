package com.sneha.day49;

public class FirstChar {

        public static void main(String[] args) {
            String name = "aman";
            char[] charArray = name.toCharArray();
            charArray[0] = 's';
            System.out.println("Modified char array: " + new String(charArray));
            System.out.println("Original string: " + name);
        }
    }

