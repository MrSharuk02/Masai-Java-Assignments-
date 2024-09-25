package com.Day7;

import java.util.*;

class Student{
	
	private int roll;
	private String name;
	private int marks;
	
	public Student(int roll, String name, int marks) {
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "[roll= " + roll + ", name= " + name + ", marks= " + marks + "]";
	}
	public int getMarks() {
		// TODO Auto-generated method stub
		return marks;
	}
	
}
public class Q1 {

	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in)) {
			Map<String,Student> st = new HashMap<>();
			System.out.println("Enter number of students: ");
			int n = s.nextInt();
			for(int i = 0; i < n; i++) {
				System.out.println("Enter student " + (i + 1) + " details");
				System.out.println("Enter State: ");
				String State = s.next();
				System.out.println("Enter roll number: ");
				int Roll = s.nextInt();
				System.out.println("Enter Name: ");
				String Name = s.next();
				System.out.println("Enter marks: ");
				int Marks = s.nextInt();
				st.put(State, new Student(Roll, Name, Marks));
			}
			List<Map.Entry<String, Student>> list = new LinkedList<>(st.entrySet());
			System.out.println("Before sort: " + list);
			list.sort((e1, e2) -> e1.getValue().getMarks() - e2.getValue().getMarks());
			System.out.println("After sort "+ list);
		}
		
	}

}
