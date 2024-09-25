package com.Day15;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Student implements Callable<String>{
	
	int roll;
	String Name;
	String Address;
	int marks;
	
	public Student(int roll, String name, String address, int marks) {
		this.roll = roll;
		this.Name = name;
		this.Address = address;
		this.marks = marks;
	}
	
	

	@Override
	public String toString() {
		return "Roll: "+roll+" Student is "+(marks > 40? "Pass":"Fail");
	}



	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return toString();
		
	}
	
	
}

public class Q2 {

	public static void main(String[] args) {
		
		Student[] students = {
				new Student(1, "Sharuk", "Atp", 500),
		        new Student(2, "John", "Address1", 50),
		        new Student(3, "Jane", "Address2", 30),
		        new Student(4, "Tom", "Address3", 70),
		        new Student(5, "Alice", "Address4", 20),
		        new Student(6, "Bob", "Address5", 60)
		};
		
		ExecutorService e = Executors.newFixedThreadPool(3);
		
		@SuppressWarnings("unchecked")
		Future<String>[] futures = new Future[students.length];
        for (int i = 0; i < students.length; i++) {
			futures[i] = e.submit(students[i]);
			
        }
        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
                
            } catch (Exception o) {
                System.err.println("Error occurred while processing student: " + o.getMessage());
            }
        }
        e.shutdown();
        
	}

}
