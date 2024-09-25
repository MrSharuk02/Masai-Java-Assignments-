package com.Day6;

abstract class Animal{

	public abstract void makeNoise();
	public void eat(){
	System.out.println("Animal is eating");
	}
	
	public void walk(){
	System.out.println("Animal is walking");
	}
}

class Dog extends Animal{
	@Override
	public void makeNoise(){
		System.out.println("Barking...");
	}
	public void hanshake() {
		System.out.println("Dog is handshaking"); 
	}
}

class Cat extends Animal{
	@Override
public void makeNoise(){
	System.out.println("Meaw...");
	}
}

class Tiger extends Animal{
	@Override
public void makeNoise(){
	System.out.println("Raoring...");
	}
}
public class Q1 {
public static void main(String[] args) {
	Q1 q = new Q1();
	Animal[] obj =  q.getAnimals();
	
	for(Animal o: obj) {
		o.makeNoise();
		o.eat();
		o.walk(); 
		if(o instanceof Dog)
		((Dog) o).hanshake();
	}
}
	public Animal[] getAnimals() {
		Animal[] a = new Animal[3];
		
		a[0] = new Dog();
		a[1] = new Cat();
		a[2] = new Tiger();
		return a;
		
	}
}
