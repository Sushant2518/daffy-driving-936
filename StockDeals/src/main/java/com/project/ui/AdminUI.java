package com.project.ui;
import com.project.entity.*;
import com.project.exception.NoRecordFoundException;
import com.project.exception.SomeThingWentWrongException;

import java.util.List;
import java.util.Scanner;
import com.project.services.*;
public class AdminUI {
	static void addProduct(Scanner sc) {
		//code to take company details input
		System.out.print("Enter Product Name ");
		String name = sc.next();
		System.out.print("Enter Category ");
		String category = sc.next();
		System.out.print("Enter Brand ");
		String brand = sc.next();
		System.out.print("Enter Price ");
		Double price = sc.nextDouble();
		System.out.print("Enter Quantity ");
		int quantity = sc.nextInt();
		
		//code to create Company Entity object
		Product product = new Product(name, category, brand, price, quantity);
		
		//Create an object of Service Layer here
		ProductService productService = new ProductServiceImpl();
		try {
			productService.addProduct(product);
			System.out.println("Product added successfully");
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	static void viewProduct() {
		//Create an object of Service Layer here
		ProductService productService = new ProductServiceImpl();
		try {
			List<Product> productList = productService.getProductList();
			productList.forEach(product -> System.out.println("Id : " + product.getProductId() +
					" Product Name : " + product.getName() + " Product Brand : " 
					+ product.getBrand() + " Product Category : " + product.getCategory()+
					" Product Price : "+product.getPrice()+" Product Quantity : "+product.getQuantity()));
		}catch(SomeThingWentWrongException | NoRecordFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
