package com.Day1;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        // Prompt the user to enter the height of the rectangle
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();
        
        // Calculate the area of the rectangle
        double area = width * height;
        
        // Print the calculated area
        System.out.println("The area of the rectangle is: " + area);
        
        // Close the scanner to avoid resource leak
        scanner.close();
    }

}
