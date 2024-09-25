package com.Day3;
import java.util.*;

//Write a Java program to take input for an integer array of size 5 from the user, 
//then print all the elements of the array.


public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i < arr.length;i++) {
			System.out.printf("Enter the values in arr[%d]: %n",i);
			arr[i] = sc.nextInt();
		}
		System.out.println("The values entered are: ");
		for(int i: arr) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}
