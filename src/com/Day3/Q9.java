package com.Day3;

//Explain the difference between StringBuffer and StringBuilder. 
//Write a short program that uses both to demonstrate their differences 
//in terms of synchronisation.


public class Q9 {

	public static void main(String[] args) {
		//StringBuffer
		long start,end;
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i <=1000000; i++) {
			sb.append("Hello");
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken to append in to the StringBuffer is -->"+" "+ (end - start)+" (Milli Sec)");
		
		// StringBuider
		start = System.currentTimeMillis();
		StringBuilder sB = new StringBuilder();
		for(int i = 0; i <=1000000; i++) {
			sB.append("Hello");
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken to append in to the StringBuilder is -->"+" "+ (end - start)+" (Milli Sec)");
	}
	

}
