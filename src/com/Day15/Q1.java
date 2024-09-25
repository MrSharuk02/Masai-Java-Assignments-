package com.Day15;

class A{
	
	int num;
	
	int sum = 0;
	
	boolean flage = false;
	
	public synchronized void put(int num) {
		
		while(flage) {
			try {wait();} catch (InterruptedException e) {}
		}
		
		this.num = num;
		System.out.println("Producer Produced : " + num);
		flage = true;
		notify();
	}
	
	public synchronized void get() {
		while(!flage) {
		try {wait();} catch (InterruptedException e) {}
		}
		sum += num;
		System.out.println("Consumer Calculated Sum is: " + sum);
		flage = false;
		notify();
	}
}

class Producer implements Runnable{
	
	A a;
	
	int  i = 0;
	
	public Producer(A a) {
		this.a = a;
		Thread t = new Thread(this, "Producer");
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			a.put(i++);
			try { Thread.sleep(1000);} catch(InterruptedException e) {}

		}
	}
}

class Consumer implements Runnable{
	
	A a;
	
	public Consumer(A a) {
		
		this.a = a;
		
		Thread t = new Thread(this,"Consumer");
		
		t.start();
	}
	
public void run() {
		
		while(true) {
			
			a.get();
			
			try { Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}

public class Q1 {

	public static void main(String[] args) {
		A a = new A();
		new Producer(a);
		new Consumer(a);
		
	}

}
