package com.Day4;
import java.util.Scanner;

//Employee Salary Calculation

class Employee{
	
	//Declaration of private variables
	private int employeeid;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	
	
	//Method to calculate the net salary
	public void calculateNetSalary(int pfpercentage) {
		double pf = salary*((double)pfpercentage/100);
		netSalary = salary - pf;
	}

	//Getters and Setters
	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() { 
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}
	
	//Method to enter the details.
	public void enterdetails(Scanner sc) {
		
		System.out.println("Enter Id: ");
		setEmployeeid(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Name: ");
		setEmployeeName(sc.nextLine().trim());
		System.out.println("Enter salary: ");
		setSalary(sc.nextDouble());
		System.out.println("Enter PF percentage: ");
		calculateNetSalary(sc.nextInt());
		sc.close();
	}
	
	//Method to show the details
	public void showdetails() { 
		System.out.println("Id: " + getEmployeeid());
		System.out.println("Name: " + getEmployeeName());
		System.out.println("Salary: "+ getSalary());
		System.out.println("Net Salary: "+ getNetSalary());
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		e.enterdetails(sc);
		e.showdetails();
		
		
	}

}
