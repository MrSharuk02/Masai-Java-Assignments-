package com.Day5;
import java.util.Scanner;
class Bank{
	String branchName;
	String ifscCode;
	
	void displayDetails() {
		System.out.println("Branch Name: "+ branchName);
		System.out.println("IFSC Code: "+ ifscCode);
	}
}

class AxisBank extends Bank{
	
	double rateOfInterest;
	
	public AxisBank(String branchName, String ifscCode, double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	AxisBank(){
		
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis bank");
	}



	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("Rate of interest: "+ rateOfInterest);
	}
	
}

class ICICBank extends Bank{
	
	double rateOfInterest; 
	
	
	
	public ICICBank(String branchName, String ifscCode,double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
		ICICBank(){
			
		}


	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("Rate of interest: "+ rateOfInterest);
	}
	
}

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Bank: ");
		String bank = sc.next();
		getBank(bank,sc);
		sc.close();
	
	}
	
	public static Bank getBank(String bank, Scanner sc) {
		
		if("axis".equals(bank)) {
			AxisBank ab = new AxisBank();
			System.out.println("Enter the Branch Name: ");
			ab.branchName = sc.nextLine();
			System.out.println("Enter the Ifsc code: ");
			ab.ifscCode = sc.next();
			System.out.println("Enter the  rateOfInterest: ");
			ab.rateOfInterest = sc.nextDouble();
			ab.displayDetails();
			ab.getCreditCard();
			return new AxisBank(ab.branchName,ab.ifscCode,ab.rateOfInterest);
			
		}
		
		else if("icici".equals(bank)) {
			ICICBank ic = new ICICBank();
			System.out.println("Enter the Branch Name: ");
			ic.branchName = sc.nextLine();
			System.out.println("Enter the Ifsc code: ");
			ic.ifscCode = sc.next();
			System.out.println("Enter the  rateOfInterest: ");
			ic.rateOfInterest = sc.nextDouble();
			ic.displayDetails();
			return new ICICBank(ic.branchName,ic.ifscCode,ic.rateOfInterest);
			
		}
		
		else {
			System.out.print("Enter the valid Bank name");
			return null;
		}
		
	}
	
}
