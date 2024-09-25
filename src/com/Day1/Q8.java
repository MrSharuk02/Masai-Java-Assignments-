package com.Day1;
import java.util.Scanner;
public class Q8 {
	 public static void main(String[] args) {
	        // Create a Scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the first double value
	        System.out.print("Enter the first double value: ");
	        double value1 = scanner.nextDouble();

	        // Prompt the user to enter the second double value
	        System.out.print("Enter the second double value: ");
	        double value2 = scanner.nextDouble();

	        // Compare the two double values and print the results
	        if (value1 > value2) {
	            System.out.println("The first value (" + value1 + ") is greater than the second value (" + value2 + ").");
	        } else if (value1 < value2) {
	            System.out.println("The first value (" + value1 + ") is less than the second value (" + value2 + ").");
	        } else {
	            System.out.println("The first value (" + value1 + ") is equal to the second value (" + value2 + ").");
	        }

	        // Close the scanner to avoid resource leak
	        scanner.close();
	    }

}
