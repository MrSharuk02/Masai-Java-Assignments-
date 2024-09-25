package com.Day2;

//You can use an if-else statement to check if data meets certain criteria before proceeding.

public class Q4 {
	public static void main(String[] args) {
		String password = "password123";

		if (password.length() >= 8) {
		    System.out.println("Password is valid.");
		} else {
		    System.out.println("Password is too short.");
		}
	}
}
