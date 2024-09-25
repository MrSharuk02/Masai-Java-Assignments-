package com.Day15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
class Address implements Serializable {
    private String state;
    private String city;
    private String pincode;

    public Address(String state, String city, String pincode) {
        this.state = state;
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
    }
}

@SuppressWarnings("serial")
class Employee implements Serializable {
    private int empId;
    private String empName;
    private int salary;
    private String email;
    private transient String password; // Using transient to avoid serialization
    private Address address;

    public Employee(int empId, String empName, int salary, String email, String password, Address address) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.email = email;
        this.setPassword(password);
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + 
               ", email=" + email + ", address=" + address + "]";
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

public class Q4 {
    public static void main(String[] args) {
    	
        String fileName = "employeedata.txt";

        // Step 1: Create a list of 5 Employee objects
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "John Doe", 50000, "john@example.com", "john123", new Address("NY", "NYC", "10001")));
        employeeList.add(new Employee(2, "Jane Smith", 60000, "jane@example.com", "jane123", new Address("CA", "LA", "90001")));
        employeeList.add(new Employee(3, "Alice Brown", 55000, "alice@example.com", "alice123", new Address("TX", "Houston", "77001")));
        employeeList.add(new Employee(4, "Bob White", 62000, "bob@example.com", "bob123", new Address("IL", "Chicago", "60601")));
        employeeList.add(new Employee(5, "Charlie Black", 70000, "charlie@example.com", "charlie123", new Address("WA", "Seattle", "98101")));

        // Step 2: Serialize the employee list to "employeedata.txt"
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(employeeList);
            System.out.println("Employee data has been serialized to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Step 3: Deserialize the employee list from "employeedata.txt"
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            @SuppressWarnings("unchecked")
			List<Employee> deserializedList = (List<Employee>) ois.readObject();
            System.out.println("Employee data has been deserialized:");
            for (Employee emp : deserializedList) {
                System.out.println(emp);
            }

            // Step 4: Add a new employee to the list
            Employee newEmployee = new Employee(6, "Sharfoddin", 75000, "sharfoddin@example.com", "sharfoddin123", 
                                                new Address("FL", "Anathapur", "33101"));
            deserializedList.add(newEmployee);
            System.out.println("\nAdded new employee: " + newEmployee);

            // Step 5: Serialize the updated list back to "employeedata.txt"
            try (FileOutputStream fos = new FileOutputStream(fileName);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(deserializedList);
                System.out.println("Updated employee data has been serialized to " + fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}