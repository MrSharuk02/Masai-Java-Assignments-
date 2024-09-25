package com.Day15;

class Enum{
	
	 int MAX_PRY = 10;
	 int NOR_PRY = 5;
	 int LOW_PRY = 1;
}

public class Q3 {

	public static void main(String[] args) {
		
		Enum e = new Enum();
		
		Thread virat = new Thread(() -> {
			
			int sum = 0;
			for(int i = 1; i <= 20; i++) {
				sum += i;
			}
			System.out.println("Virat: "+sum);
		},"Virat");
		
		Thread dhoni = new Thread(() -> {
			System.out.print("Dhoni: ");
			for(int i = 1; i < 11; i++) {
				System.out.print(i+" ");
			}
		},"Dhoni");
		
		dhoni.setPriority(e.MAX_PRY);
		
		Thread rohit = new Thread(()-> {
			int pro = 1;
			for(int i = 1; i < 11; i++) {
				pro *= i;
			}
			System.out.println("\n\r"+"Rohit: "+pro+"\r");
		},"Rohit");
		
		
		dhoni.start();
		try{dhoni.join();} catch (Exception e1) {}
		rohit.start();
		try{rohit.join();} catch (Exception e1) {}
		virat.start(); 
		};
	}


