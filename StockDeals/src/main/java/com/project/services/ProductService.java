package com.project.services;

import java.util.List;

import com.project.entity.Product;
import com.project.exception.NoRecordFoundException;
import com.project.exception.SomeThingWentWrongException;

public interface ProductService {
	void addProduct(Product product) throws SomeThingWentWrongException;
	List<Product> getProductList() throws SomeThingWentWrongException, NoRecordFoundException;
	void updateProduct(Product product) throws SomeThingWentWrongException, NoRecordFoundException;
	Product getProductObjectByName(String productName) throws SomeThingWentWrongException, NoRecordFoundException;
}
