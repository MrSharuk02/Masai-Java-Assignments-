package com.Day2;
import java.util.Scanner;


public class Q6 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        String input = "";

		        System.out.print("Enter 'yes' or 'no': ");
		        input = scanner.nextLine();

		        while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")) {
		            System.out.print("Invalid input. Please enter 'yes' or 'no': ");
		            input = scanner.nextLine();
		        }

		        System.out.println("You entered a valid response.");
		        
		        scanner.close();
		    }
		

}

