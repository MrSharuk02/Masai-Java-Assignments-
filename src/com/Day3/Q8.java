package com.Day3;

//Write a Java program that converts a string to a character
//array and prints each character on a new line.


public class Q8 {

	public static void main(String[] args) {
		String str = "Sharfuddin";
		char[] c = str.toCharArray();
		for(char i: c) {
			System.out.println(i);
		}
	}

}
