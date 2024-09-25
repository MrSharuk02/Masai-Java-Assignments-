package com.Day11;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidProductCodeException extends Exception{

	public InvalidProductCodeException(String msg) {
		super(msg);
	}
}
class Q2{
	
	public static void cheakProduct(String prd) throws InvalidProductCodeException{
		if(prd.matches("PRD\\d{4}")) {
			System.out.println("Valid Product Code");
		}
		else {
			throw new InvalidProductCodeException("Caught the exception: Invalid product code. Must start with PRD and followed by 4 digits.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product Id: ");
		String prd = sc.nextLine();
		try {
			cheakProduct(prd);
		}catch (InvalidProductCodeException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}
}

//package com.Day11;
//
//import java.util.*;
//
//
//@SuppressWarnings("serial")
//class InvalidProductCodeException extends Exception{
//	public InvalidProductCodeException(String str) {
//			super(str);
//	}
//}
//
//public class Q2 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//		String msg = sc.nextLine();
//		int len = msg.length();
//		if(len==7 && (msg.charAt(0)=='P' && msg.charAt(1)=='R' && msg.charAt(2)=='D')) {
//			System.out.println("Valid");
//		}
//		else {
//			throw new InvalidProductCodeException("Caught the exception: Invalid product code. Must start with \"PRD\" and followed by 4 digits.");
//		}
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//	}
//
//}
