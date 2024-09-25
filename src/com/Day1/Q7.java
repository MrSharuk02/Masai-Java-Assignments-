package com.Day1;
import java.util.Scanner;

public class Q7 {
	 public static void main(String[] args) {
	        // Create a Scanner object to take input from the user
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user to enter the first integer
	        System.out.print("Enter the first integer: ");
	        int num1 = scanner.nextInt();
	        
	        // Prompt the user to enter the second integer
	        System.out.print("Enter the second integer: ");
	        int num2 = scanner.nextInt();
	        
	        // Calculate the remainder of the division of num1 by num2
	        int remainder = num1 % num2;
	        
	        // Print the result
	        System.out.println("The remainder of " + num1 + " divided by " + num2 + " is: " + remainder);
	        
	        // Close the scanner to avoid resource leak
	        scanner.close();
	    }

}
