package com.Day3;

//Write a Java program to initialize a 2D array of integers with dimensions 3x3.
//populate it with values from 1 to 9 and print the array in a matrix format.

public class Q6 {

	public static void main(String[] args) {
		int[][] n = new int[3][3];
		int p = 1;
		for(int i = 0; i< n.length; i++) {
			for(int j = 0;j < n.length;j++) {
					n[i][j] = p;
					p++;
			}
		}
		for(int i = 0; i< n.length; i++) {
			for(int j = 0;j < n.length;j++) {
					System.out.print(n[i][j]+" ");
				
			} 
			System.out.println();
		}
		
	}

}
