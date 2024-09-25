package com.Day4;
import java.util.Scanner;
class Student{
int roll;
String name;
String address;
int marks;
}
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many student object do you want: ");
		int n = sc.nextInt();
		Student[] st = new Student[n];
		int sum = 0;
		double avg = 0;
		for(int i = 1; i<n+1; i++) {
			System.out.print(i+" Enter Student Roll No: ");
			st[i-1] = new Student();
			st[i-1].roll = sc.nextInt();
			sc.nextLine();
			System.out.print(i+" Enter Student Name: ");
			st[i-1].name = sc.nextLine();
			System.out.print(i+" Enter Student Address: ");
			st[i-1].address = sc.nextLine();
			System.out.print(i+" Enter Student Marks: ");
			st[i-1].marks = sc.nextInt();
			System.out.println();
			sum += st[i-1].marks;
		}
		System.out.println();
		for(int i = 0; i<n; i++) {
			System.out.println("Student Roll No: " + st[i].roll); 
			System.out.println("Student Name: " + st[i].name);
			System.out.println("Student Address: " + st[i].address);
			System.out.println("Student Marks: " + st[i].marks); 
			System.out.println();
		}
		avg = (double)sum/n;
		System.out.println("The avarage marks of all "+n+" students: "+avg);
		sc.close();
	}

}
