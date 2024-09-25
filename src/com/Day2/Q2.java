package com.Day2;

//A switch statement is like a multi-choice test. 
//You check one variable against several possible values and execute different code for each value.

public class Q2 {

	public static void main(String[] args) {
		String fruit = "Apple";

		switch (fruit) {
		    case "Apple":
		        System.out.println("It's an apple.");
		        break;
		    case "Banana":
		        System.out.println("It's a banana.");
		        break;
		    case "Cherry":
		        System.out.println("It's a cherry.");
		        break;
		    default:
		        System.out.println("Unknown fruit.");
		}

	}

}
