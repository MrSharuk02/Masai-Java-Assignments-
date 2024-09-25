package com.Day5.Q2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Hosteller st = new Hosteller();
		Main m = new Main();
		m.enterStudentDetails(st, sc);
		getHostellerDetails(sc, st);
	
	}
	
	void enterStudentDetails(Hosteller st, Scanner sc){
		System.out.println("Enter the Details: ");
		System.out.println("StudentId: ");
		st.setStudentId(sc.nextInt());
		sc.nextLine();
		System.out.println("Student Name: ");
		st.setName(sc.nextLine());
		System.out.println("Department Id: ");
		st.setDepartmentId(sc.nextInt());
		sc.nextLine();
		System.out.println("Gender: ");
		st.setGender(sc.nextLine());
		System.out.println("Phone Number: ");
		st.setPhone(sc.nextLine());
		System.out.println("Hostel Name: ");
		st.setHostelname(sc.nextLine());
		System.out.println("Room Number: ");
		st.setRoomNumber(sc.nextInt());
	}
	
	public static Hosteller getHostellerDetails(Scanner sc,Hosteller st) {
		System.out.println("Modify Room Number(Y/N): ");
		sc.nextLine();
		String f = sc.nextLine();
		if("Y".equals(f)) {
			System.out.println("New Room Number: ");
			st.setRoomNumber(sc.nextInt());
			sc.nextLine();
		}
		else if("N".equals(f)) {
			
		}
		System.out.println("Modify Phone Number(Y/N): ");
		String s = sc.nextLine();
		if("Y".equals(s)) {
			System.out.println("New Phone Number: ");
			st.setPhone(sc.nextLine());
		}
		else {
			
		}
		System.out.println("The Student Details: "+st.getStudentId()+" "+st.getName()+" "+st.getDepartmentId()+" "+st.getGender()+" "+st.getPhone()+" "+st.getHostelname()+" "+st.getRoomNumber());
		return null;
			
		
	}

}
