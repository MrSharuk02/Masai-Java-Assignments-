package com.Day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q5 {

	public static void main(String[] args) throws IOException {
		String[] names= {"Sharfoddin","Mainoddin","Salauddin"};
		try {
			BufferedWriter bd = new BufferedWriter(new FileWriter("C:\\MasaiJava\\Output.txt"));
			bd.write("Welcome ");
			bd.write("\nTo MasaiJava");
			
			
			for(String str:names) {
				bd.write("\n"+str);
			}
			bd.close();
			System.out.println("Writing is completed..Go and check in Output.txt file..");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("\n");
		try {
			BufferedReader bf = new BufferedReader(new FileReader("C:\\MasaiJava\\Output.txt"));
			String line;
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
			System.out.println("Reading is completed..");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}