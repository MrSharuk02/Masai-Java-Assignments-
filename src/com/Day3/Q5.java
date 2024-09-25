package com.Day3;

//Write a Java program to initialize an integer 
//array with 10 elements and print the sum of all elements.

public class Q5 {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int i: n) {
			sum += i;
		}
		System.out.print("The Sum of the array is: ");
		System.out.print(sum);
	}

}
