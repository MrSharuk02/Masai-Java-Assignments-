package com.Day5;
import java.util.*;
class Student{
	
	int studId;
	String studName;
	double examFee;
	
	
	
	public Student(int studId, String studName, double examFee) {
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}

	void displayDetails() {
		
		System.out.println("Studen Id: "+ studId);
		System.out.println("Studen Name: "+ studName);
		System.out.println("Studen exam Fee: "+ examFee);
		
	}
	
	double payFee(double amount) {
		if(amount < examFee) {
			examFee -= amount;
		}
		else {
			examFee = 0;
		}
		return examFee;
		
	}
	
}

class Dayscholar extends Student{
	double transportFee;
	double totalFee;
	
	public Dayscholar(int studId, String studName, double examFee, double transportFee) {
		super(studId, studName, examFee);
		totalFee = examFee + transportFee;
		this.transportFee = transportFee;
	}
	
	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("TransportFee: "+ transportFee);
		System.out.println("Total Fee: "+ totalFee);
	}
	
	@Override
	double payFee(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount paid by Student: "+ amount);
		if(amount < totalFee) {
			totalFee -= amount;
		}
		else {
			totalFee = 0;
		}
		return totalFee;
	}
}

class hosteller extends Student{
	double hostelFee;
	double totalFee;
	
	public hosteller(int studId, String studName, double examFee, double hostelFee) {
		super(studId, studName, examFee);
		this.hostelFee = hostelFee;
		totalFee = examFee + hostelFee;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("hostle Fee: "+ hostelFee);
		System.out.println("Total Fee: "+ totalFee);
	}
	
	@Override
	double payFee(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount paid by Student: "+ amount);
		if(amount < this.totalFee) {
			totalFee -= amount;
		}
		else {
			totalFee = 0;
		}
		return totalFee;
	}
}

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Dayscholar ds1 = new Dayscholar(1, "Sharfuddin", 52000, 6000);
		Dayscholar ds2 = new Dayscholar(2,"Gautham", 52000,12000);
		
		hosteller hs1 = new hosteller(3,"Harsha",30000,15000);
		hosteller hs2 = new hosteller(4,"Navya",52000,30000);
		
		
		ds1.displayDetails();
		System.out.print("Enter the fee you hava paid for "+ds1.studName+": ");
		System.out.println("Remaining Fee after payment: " + ds1.payFee(sc.nextDouble())+"\n");
		
		
		ds2.displayDetails();
		System.out.print("Enter the fee you hava paid for "+ds2.studName+": ");
		System.out.println("Remaining Fee after payment: " + ds2.payFee(sc.nextDouble())+"\n");
		
		
		hs1.displayDetails();
		System.out.print("Enter the fee you hava paid for "+hs1.studName+": ");
		System.out.println("Remaining Fee after payment: " + hs1.payFee(sc.nextDouble())+"\n");
		
	
		hs2.displayDetails();
		System.out.print("Enter the fee you hava paid for "+hs2.studName+": ");
		System.out.println("Remaining Fee after payment: " + hs2.payFee(sc.nextDouble())+"\n");
		
		sc.close();
	}

}
