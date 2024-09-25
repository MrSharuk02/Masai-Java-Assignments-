package com.Day6;
abstract class Student{
    String name;
    String address;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract double getPercentage();

    public static int getTotalNoStudents() {
        return ScienceStudent.noOfStudents + HistoryStudent.noOfStudents;
    }
}

class ScienceStudent extends Student {
    int physicsMarks;
    int chemistryMarks;
    int mathsMarks;
    static int noOfStudents = 0;

    ScienceStudent(String name, String address, int physicsMarks, int chemistryMarks, int mathsMarks) {
        super(name, address);
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathsMarks = mathsMarks;
        noOfStudents++;
    }

    @Override
    public double getPercentage() {
        return (physicsMarks + chemistryMarks + mathsMarks) / 3.0;
    }
}

class HistoryStudent extends Student {
    int historyMarks;
    int civicsMarks;
    static int noOfStudents = 0;

    HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
        super(name, address);
        this.historyMarks = historyMarks;
        this.civicsMarks = civicsMarks;
        noOfStudents++;
    }

    @Override
    public double getPercentage() {
        return (historyMarks + civicsMarks) / 2.0;
    }
}

public class Q3 {
    public static void main(String[] args) {

        ScienceStudent scienceStudent1 = new ScienceStudent("Sharfuddin", "123 Street A", 85, 90, 80);
        ScienceStudent scienceStudent2 = new ScienceStudent("Pavan", "456 Street B", 75, 85, 90);

        HistoryStudent historyStudent1 = new HistoryStudent("Sharuk", "789 Street C", 80, 70);
        HistoryStudent historyStudent2 = new HistoryStudent("Pakkir", "101 Street D", 90, 85);

        System.out.println(scienceStudent1.name + "'s Percentage: " + scienceStudent1.getPercentage());
        System.out.println(scienceStudent2.name + "'s Percentage: " + scienceStudent2.getPercentage());
        System.out.println(historyStudent1.name + "'s Percentage: " + historyStudent1.getPercentage());
        System.out.println(historyStudent2.name + "'s Percentage: " + historyStudent2.getPercentage());

        System.out.println("Total number of students: " + Student.getTotalNoStudents());

    }
}

/*
class Student{
	String name;
	String address;
	
	Student(String name,String address){
		this.name = name;
		this.address = address;
	}
	//abstract getPercentage();
	
	static void getTotalNoStudents() {
		
	}
}
class ScienceStudent extends Student{
	int phisicsMarks, chemistryMarks, mathsMarks;
	static int noOfStudents;
	
	int getPercentage(int phisicsMarks, int chemistryMarks, int mathsMarks) {
		if(phisicsMarks <= 100 )
		return phisicsMarks;
		
		
		
	}
	ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	
	

	
	
}
class HistoryStudent extends Student{
	int historyMarks, civicsMarks;
	static int noOfStudents;
}
*/



