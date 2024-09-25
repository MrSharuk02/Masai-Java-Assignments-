package com.Day2;

//A for loop can be used to multiply a sequence of numbers together, like finding the factorial of a number.

public class Q8 {

	public static void main(String[] args) {
		int num = 5;
		int factorial = 1;

		for (int i = 1; i <= num; i++) {
		    factorial *= i;
		}

		System.out.println("Factorial of " + num + " is " + factorial);

	}

}
