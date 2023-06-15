package com.project.services;

import com.project.entity.*;
import com.project.entity.Product;
import com.project.exception.SomeThingWentWrongException;

public class ProductServiceImpl {
	
	public void addProduct(Product product) throws SomeThingWentWrongException {
		//Create an object of DAO class here
		ProductDAO productDAO = new ProductDAOImpl();
		productDAO.addProduct(product);
	}
	
	@Override
	public List<Product> getProductList() throws SomeThingWentWrongException, NoRecordFoundException{
		//Create an object of DAO class here
		ProductDAO productDAO = new ProductDAOImpl();
		return productDAO.getProductList();
	}
	
	@Override
	public void updateProduct(Product product) throws SomeThingWentWrongException, NoRecordFoundException{
		//Create an object of DAO class here
		ProductDAO productDAO = new ProductDAOImpl();
		productDAO.updateProduct(product);
	}
	
	@Override
	public Product getProductObjectByName(String name) throws SomeThingWentWrongException, NoRecordFoundException{
		//Create an object of DAO class here
		ProductDAO productDAO = new ProductDAOImpl();
		return productDAO.getProductObjectByName(name);
	}

}
