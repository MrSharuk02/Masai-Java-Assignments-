package com.Day14;

import java.util.*;
import java.util.Collections;

class Product implements Comparable<Product>{
	
	private int productID;
	private String name;
	private double price;
	private double rating;
	private int reviewCount;
	private String category;
	 
	public Product(int productID, String name, double price, double rating, int reviewCount, String category) {
		this.productID = productID;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.reviewCount = reviewCount;
		this.category = category;
	}
	
	public int getProductID() {
		return productID;
	}
 
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getRating() {
		return rating;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return this.price < o.price? -1: this.price == o.price?  this.rating > o.rating? -1: this.rating == o.rating? this.reviewCount > o.reviewCount? -1:1:1:1;
	}

	@Override
	public String toString() {
		String formattedString = String.format(
			    "Product [productID=%-5s | name=%-10s | price=%-6.2f | rating=%-5.1f | reviewCount=%-5d | category=%-15s]",
			    productID, name, price, rating, reviewCount, category
			);
		return formattedString; 
	}
	
}

class NameComparator{
	Comparator<Product> com = (o1,o2) -> {
		return o1.getName().compareTo(o2.getName());
	};
}

class CategoryComparator{
	Comparator<Product> com = (o1,o2) -> {
		return o1.getCategory().compareTo(o2.getCategory());
	};
}

class PriceWithinCategoryComparator{
	Comparator<Product> com = (o1,o2) -> {
		return o1.getCategory().compareTo(o2.getCategory()) != 0 
			       ? o1.getCategory().compareTo(o2.getCategory()) 
			    	       : Double.compare(o1.getPrice(), o2.getPrice());

	};
}

class AdvanceSorting{
	Comparator<Product> com = (o1,o2) -> {
		return o1.getCategory().compareTo(o2.getCategory()) !=0 ? o1.getCategory().compareTo(o2.getCategory()) : o1.getRating() > o2.getRating() ? -1: o1.getRating() == o2.getRating()? o1.getName().compareTo(o2.getName()):1;
	};
}

public class Q1 {

	public static void main(String[] args) {
		List<Product> pp = new ArrayList<>();
		NameComparator nc = new NameComparator();
		CategoryComparator cc = new CategoryComparator();
		PriceWithinCategoryComparator pcc = new PriceWithinCategoryComparator();
		AdvanceSorting as = new AdvanceSorting();
		
		pp.add(new Product(1, "Product A", 19.99, 4.3, 120, "Electronics"));
		pp.add(new Product(2, "Product B", 34.50, 4.2, 75, "Books"));
		pp.add(new Product(3, "Product C", 45.00, 4.9, 210, "Home & Kitchen"));
		pp.add(new Product(4, "Product D", 22.99, 4.5, 89, "Clothing"));
		pp.add(new Product(5, "Product E", 59.99, 4.0, 132, "Sports"));
		pp.add(new Product(6, "Product F", 15.75, 3.6, 43, "Toys"));
		pp.add(new Product(7, "Product G", 99.99, 4.8, 320, "Electronics"));
		pp.add(new Product(8, "Product H", 24.30, 4.2, 66, "Books"));
		pp.add(new Product(9, "Product I", 12.99, 4.9, 150, "Home & Kitchen"));
		pp.add(new Product(10, "Product J", 12.99, 4.1, 80, "Clothing"));
		pp.add(new Product(11, "Product K", 89.99, 4.7, 200, "Electronics"));
		pp.add(new Product(12, "Product L", 27.99, 3.9, 65, "Books"));
		pp.add(new Product(13, "Product M", 32.00, 4.5, 98, "Home & Kitchen"));
		pp.add(new Product(14, "Product N", 18.49, 4.3, 56, "Clothing"));
		pp.add(new Product(15, "Product O", 72.89, 4.0, 123, "Sports"));
		pp.add(new Product(16, "Product P", 16.99, 3.5, 37, "Toys"));
		pp.add(new Product(17, "Product Q", 105.00, 4.9, 400, "Electronics"));
		pp.add(new Product(18, "Product R", 20.45, 4.1, 78, "Books"));
		pp.add(new Product(19, "Product S", 29.95, 4.8, 165, "Home & Kitchen"));
		pp.add(new Product(20, "Product T", 13.99, 4.0, 45, "Clothing"));
		pp.add(new Product(21, "Product U", 99.99, 4.3, 89, "Sports"));
		pp.add(new Product(22, "Product V", 14.75, 3.4, 52, "Toys"));
		pp.add(new Product(23, "Product W", 199.99, 4.8, 500, "Electronics"));
		pp.add(new Product(24, "Product X", 30.00, 4.0, 85, "Books"));
		pp.add(new Product(25, "Product Y", 49.50, 4.7, 150, "Home & Kitchen"));
		

		
		System.out.printf("\r%70s","Sorting by Price\r\r");
		Collections.sort(pp);
		pp.forEach(System.out::println);
		System.out.println();
		System.out.printf("%70s","Sorting by Name\r\r");
		Collections.sort(pp, nc.com);
		pp.forEach(System.out::println);
		System.out.println();
		System.out.printf("%70s","Sorting by Category\r\r");
		Collections.sort(pp, cc.com);
		pp.forEach(System.out::println);
		System.out.println();
		System.out.printf("%70s","Sorting by Price With Category\r\r");
		Collections.sort(pp, pcc.com);
		pp.forEach(System.out::println);
		System.out.println();
		System.out.printf("%70s","Advance Sorting\r\r");
		Collections.sort(pp, as.com);
		pp.forEach(System.out::println);
		
	}

}
