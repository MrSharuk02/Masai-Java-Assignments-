package com.Day3;
import java.util.Scanner;
//How can you compare two strings for equality in Java? 
//Write a code snippet to compare two strings str1 and 
//str2 and print whether they are equal or not.

// Answer:- To check the contents are equal in a String we use the equals() method.
// It will check the unicode values of the String and then it will give us the output.

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String str1 = new String();	//--> String object has been initialised 
		String str2 = sc.nextLine();//--> String Litral has been initialised
		System.out.println("Enter the second String: ");
		str1 = sc.nextLine();
		if(str1.equals(str2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are Not equal");
		}
		sc.close();
		
	}

}
