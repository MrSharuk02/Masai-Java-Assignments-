package com.Day1;

public class Q9 {
	public static void main(String[] args) {
        // Declare and initialize two String variables
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Compare the strings using the == operator
        if (str1 == str2) {
            System.out.println("Using '==': The strings are the same (references are equal).");
        } else {
            System.out.println("Using '==': The strings are different (references are not equal).");
        }

        // Compare the strings using the equals() method
        if (str1.equals(str2)) {
            System.out.println("Using equals(): The strings are the same (contents are equal).");
        } else {
            System.out.println("Using equals(): The strings are different (contents are not equal).");
        }

        // Demonstrating the == operator with string literals
        String str3 = "Hello";
        String str4 = "Hello";

        if (str3 == str4) {
            System.out.println("Using '==': The string literals are the same (references are equal).");
        } else {
            System.out.println("Using '==': The string literals are different (references are not equal).");
        }
    }

}
