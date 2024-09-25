package com.Day3;
import java.util.Scanner;

//Write a Java program that takes a string input from the user
//and prints the reversed version of that string using the StringBuilder class.

public class Q1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String str = sc.nextLine().trim();
	StringBuilder sb = new StringBuilder(str);
	System.out.println("The Reversed String is: ");
	for(int i = sb.length() - 1; i >= 0; i--) {
		  System.out.print(sb.charAt(i)+" ");
	}
	
		sc.close();
	
	}

}
