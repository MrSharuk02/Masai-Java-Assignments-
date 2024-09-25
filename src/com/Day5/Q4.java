package com.Day5;

class Example {
    int a;

    Example(int a) {
        this.a = a; // 'this.a' refers to the instance variable, while 'a' refers to the parameter
    }

    void display() {
        System.out.println("Value of a: " + this.a); // this.a refers to the current object's 'a'
    }
}
class Parent {
    int a;

    Parent(int a) {
        this.a = a;
    }

    void display() {
        System.out.println("Parent class value of a: " + a);
    }
}
class Child extends Parent {
    int a;

    Child(int a, int b) {
        super(a); // Calls Parent class constructor
        this.a = b; // Child class's 'a' initialized with b
    }

    void display() {
        super.display(); // Calls the Parent class display() method
        System.out.println("Child class value of a: " + a);
    }
}
        public class Q4 {
    public static void main(String[] args) {
    	Child obj = new Child(5, 10);
        obj.display();
        Example obj1 = new Example(10);
        obj1.display(); 
    }
}

