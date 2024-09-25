package com.Day3;

//Write a Java program to calculate and print the 
//sum of all elements in a 2D array of size 4x4.

public class Q10 {

	public static void main(String[] args) {
		int[][] n = new int[4][4];
		int sum = 0;
		int p = 1;
		for(int i = 0; i< n.length; i++) {
			for(int j = 0;j < n.length;j++) {
					n[i][j] = p;
					p++;
					sum += n[i][j];
			}
		}
		System.out.print("The sum of 2D array is: ");
		System.out.print(sum);
	}

}
