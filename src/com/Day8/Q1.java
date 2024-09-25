package com.Day8;

import java.util.*;

class Product{
	int productId;
	String productName;
	double productPrice;
	
	public Product(int productId, String productName, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many product objects you want: ");
		int ob = sc.nextInt();
		Product[] p = new Product[ob];
		for(int i = 0; i < ob; i++) {
			System.out.println("Enter the Prduct Id: ");
			int pId = sc.nextInt();
			System.out.println("Enter the Prduct Name: ");
			String pName = sc.next();
			System.out.println("Enter the Prduct Price: ");
			double pP = sc.nextDouble();
			p[i] = new Product(pId, pName, pP);
		}
		
		System.out.println("Enter you choice from below options: ");
		System.out.println("1 for sorting the product according to the productId:  ");
		System.out.println("2 for sorting the product according the the product Name: ");
		System.out.println("3 for sorting the product according the the product Price: ");
		int i = sc.nextInt();
		
		switch(i) {
		case 1: 
			Arrays.sort(p,Comparator.comparing(Product::getProductId));
			System.out.println("Based on Id Sorting");
			System.out.println(Arrays.toString(p));
			break;
		
		case 2:
			
			Arrays.sort(p,Comparator.comparing(Product::getProductName));
			System.out.println("Based on Name Sorting");
			System.out.println(Arrays.toString(p));
			break;
			
		case 3: 
			Arrays.sort(p,Comparator.comparing(Product::getPrice).reversed());
			System.out.println("Based on Price Sorting");
			System.out.println(Arrays.toString(p));
			break;
		
		default:
			System.out.println("Invalid Input");
		}
		sc.close();


			
			}
		}
			
		
		
		
	


