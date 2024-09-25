package com.Day6;
import java.util.*;
class Student1{
	Scanner sc = new Scanner(System.in);
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	public void displayDetails() {
		System.out.println("Enter Roll No: ");
		roll = sc.nextInt();
		System.out.println("Enter Student Name: ");
		name = sc.next();
		System.out.println("Marks: ");
		marks = sc.nextInt();
		grade = calculateGrade(marks);
	}
	
	private char calculateGrade(int marks) {
		if(marks >= 500) {
			return 'A';
		}
		else if(marks < 500 && marks >=400) {
			return 'B';
		}
		else {
			return 'C';
		}
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
}
public class Q2 {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		s1.displayDetails();
		s2.displayDetails();
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
