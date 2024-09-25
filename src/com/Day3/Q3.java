package com.Day3;

//Write a Java program to demonstrate how to use StringBuffer to append a 
//string to an existing string and then print the result.

public class Q3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("World!");
		System.out.println(sb);
	}

}
