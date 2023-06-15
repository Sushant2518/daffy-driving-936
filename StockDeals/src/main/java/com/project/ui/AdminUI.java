package com.project.ui;
import com.project.entity.*;
import java.util.Scanner;

public class AdminUI {
	static void addProduct(Scanner sc) {
		//code to take company details input
		System.out.print("Enter Product Name ");
		String name = sc.nextLine();
		System.out.print("Enter Category ");
		String category = sc.nextLine();
		System.out.print("Enter Brand ");
		String brand = sc.nextLine();
		System.out.print("Enter Price ");
		Double price = sc.nextDouble();
		System.out.print("Enter Quantity ");
		int quantity = sc.nextInt();
		
		//code to create Company Entity object
		Product product = new Product(name, category, brand, price, quantity);
		
		//Create an object of Service Layer here
		ProductService productService = new ProductServiceImpl();
		try {
			companyService.addCompany(company);
			System.out.println("Company added successfully");
		}catch(SomeThingWentWrongException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
