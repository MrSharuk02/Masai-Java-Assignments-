package com.Day2;

/*if statement: Think of this as checking a condition. If it’s true, you do something specific.
 
else if statement: This is the backup plan if the initial if condition wasn't true.
 It lets you check another condition.
 
else statement: This is the fallback option. If none of the previous conditions were true, 
this block runs. */

public class Q1 {

	public static void main(String[] args) {
		String weather = "sunny";

		if (weather.equals("rainy")) {
		    System.out.println("Take an umbrella.");
		} else if (weather.equals("sunny")) {
		    System.out.println("Wear sunglasses.");
		} else {
		    System.out.println("Check the weather app.");
		}
	}

}
