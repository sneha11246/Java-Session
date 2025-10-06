package com.sneha.day49;
public class ReplaceVowels {
    public static String replaceVowels(String input) {
        return input.replaceAll("[AEIOUaeiou]", "*");
    }
    public static void main(String[] args) {
        String original = "Sneha";
        String modified = replaceVowels(original);
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);
    }
}

