package com.project.services;

import java.util.List;

import com.project.entity.Product;
import com.project.exception.NoRecordFoundException;
import com.project.exception.SomeThingWentWrongException;
import com.project.dao.*;

public class ProductServiceImpl implements ProductService{

	@Override
	public void addProduct(Product product) throws SomeThingWentWrongException {
		// TODO Auto-generated method stub
		ProductDAO productDAO = new ProductDAOImpl();
		productDAO.addProduct(product);
	}

	@Override
	public List<Product> getProductList() throws SomeThingWentWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		ProductDAO productDAO = new ProductDAOImpl();
		return productDAO.getProductList();
	}



	@Override
	public Product getProductObjectByName(String productName)
			throws SomeThingWentWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Product product) throws SomeThingWentWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		
	}


}
