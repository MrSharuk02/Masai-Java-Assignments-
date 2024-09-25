package com.Day8;
import java.util.*;

class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private double salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "\nEmployee Id: " + getEmpId() + "\n" +
               "Employee Name: " + getEmpName() + "\n" +
               "Employee Salary: " + getSalary();
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(other.salary,this.salary); 
    }
}



public class Q2 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        TreeSet<Employee> treeSet = new TreeSet<>();
	        Employee[] emp = new Employee[4];

	        for (int i = 0; i < 4; i++) {
	            emp[i] = new Employee();
	            System.out.println("Enter Id :(" + (i + 1) + ") ");
	            emp[i].setEmpId(sc.nextInt());
	            sc.nextLine(); 

	            System.out.println("Enter Name: ");
	            emp[i].setEmpName(sc.nextLine());

	            System.out.println("Enter Salary: ");
	            emp[i].setSalary(sc.nextDouble());
	            sc.nextLine(); 

	            treeSet.add(emp[i]);
	        }

	        System.out.println(treeSet);
	        sc.close();

	}

}
