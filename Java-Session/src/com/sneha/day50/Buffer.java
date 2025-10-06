package com.sneha.day50;
public class Buffer {
        public static void main(String[] args) {
            StringBuffer sb = new StringBuffer("Learning");
            sb.append(" Java");
            sb.insert(sb.length(), " with fun");
            System.out.println("Final Sentence: " + sb.toString());
        }
    }
