package com.project.entity;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int productId;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "brand")
    private String brand;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;
//    
//    @ManyToMany(mappedBy = "orderProductSet")
//	private Set<Customer> customer;
//	@OneToMany(cascade =  CascadeType.ALL, mappedBy = "product")
//	Set<Product> productSet;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String category, String brand, double price, int quantity) {
		super();
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
//		this.customer = customer;
//		this.productSet = productSet;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
//	public Set<Product> getProductSet() {
//		return productSet;
//	}
//	public void setProductSet(Set<Product> productSet) {
//		this.productSet = productSet;
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(brand, category, name, price, productId, productSet, quantity);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Product other = (Product) obj;
//		return Objects.equals(brand, other.brand) && Objects.equals(category, other.category)
//				&& Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
//				&& productId == other.productId && Objects.equals(productSet, other.productSet)
//				&& quantity == other.quantity;
//	}
	
	

}
