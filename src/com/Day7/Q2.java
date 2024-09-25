package com.Day7;

//import java.util.Map.Entry;
import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		LinkedHashMap<String, String> Capital = new LinkedHashMap<>();
		Capital.put("Andhra Pradesh", "Amaravathi");
		Capital.put("Telangana", "Hyderabad");
		Capital.put("Karnataka", "Bengaluru");
		Capital.put("Tamil Nadu", "Chennai");
		Capital.put("Bihar", "Patna");
		for(Map.Entry<String, String> entry : Capital.entrySet()) {
			System.out.println("State: " + entry.getKey() + " - Capital: " + entry.getValue());
		}
	}
}
