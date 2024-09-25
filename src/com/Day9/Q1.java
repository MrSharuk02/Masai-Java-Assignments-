package com.Day9;

import java.util.*;
public class Q1 {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			try {
				System.out.println("Enter num1: ");
				int num1 = Integer.parseInt(s.nextLine());
				System.out.println("Enter num2: ");
				int num2 = Integer.parseInt(s.nextLine());
				if (num2 == 0) {
					throw new NumberFormatException("num2 should not be 0");
				}
				int num3 = num1 / num2;
				if (num3 > 10) {
					throw new ArithmeticException("String value is null");
				}
				if (num3 > 10) {
					throw new Exception("WELCOME TO EXCEPTION HANDLING");
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println("end of main");
			}
			s.close();
		}

}
