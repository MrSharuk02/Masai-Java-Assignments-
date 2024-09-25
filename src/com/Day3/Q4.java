package com.Day3;

//Compare StringBuilder and StringBuffer in terms of performance. 
//Write a code snippet to show how you can use StringBuilder to build a string efficiently.


public class Q4 {

	public static void main(String[] args) {
		//StringBuffer
		long start,end;
		start = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i <=100000; i++) {
			sb.append("Hello");
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken to append in to the StringBuffer is -->"+" "+ (end - start)+" (Milli Sec)");
		
		// StringBuider
		start = System.currentTimeMillis();
		StringBuilder sB = new StringBuilder();
		for(int i = 0; i <=100000; i++) {
			sB.append("Hello");
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken to append in to the StringBuilder is -->"+" "+ (end - start)+" (Milli Sec)");
		
		//Println
		start = System.currentTimeMillis();
		String str = new String("Hello");
		for(int i = 0; i <=100000; i++) {
			str += "he";
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken to append in to the String is -->"+" "+ (end - start)+" (Milli Sec)");
	}
	

}
