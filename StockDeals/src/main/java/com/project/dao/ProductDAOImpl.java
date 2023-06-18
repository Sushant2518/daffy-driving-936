package com.project.dao;

import java.util.List;

import com.project.entity.Product;
import com.project.exception.NoRecordFoundException;
import com.project.exception.SomeThingWentWrongException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceException;
import jakarta.persistence.Query;
import com.project.entity.Product;
public class ProductDAOImpl implements ProductDAO{

	@Override
	public void addProduct(Product product) throws SomeThingWentWrongException {
		// TODO Auto-generated method stub
		EntityManager em = null;
		try {
			em = EMUtils.getEntityManager();
			
			//check if company with same name exists
			Query query = em.createQuery("SELECT count(c) FROM Product c WHERE name = :name");
			query.setParameter("name", product.getName());
			if((Long)query.getSingleResult() > 0) {
				//you are here means company with given name exists so throw exceptions
				throw new SomeThingWentWrongException("Company already exists with name " + product.getName());
			}
			
			//you are here means no company with given name
			EntityTransaction et = em.getTransaction();
			et.begin();
			em.persist(product);
			et.commit();
		}catch(PersistenceException ex) {
			throw new SomeThingWentWrongException("Unable to process request, try again later");
		}finally{
			em.close();
		}
	}

	@Override
	public List<Product> getProductList() throws SomeThingWentWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		EntityManager em = null;
		List<Product> productList = null;
		try {
			em = EMUtils.getEntityManager();
			Query query = em.createQuery("FROM Product p");
			productList = (List<Product>)query.getResultList();
			if(productList.size() ==0) {
				throw new NoRecordFoundException("No Product Found");
			}
		}catch(IllegalArgumentException ex) {
			throw new SomeThingWentWrongException("Unable to process request, try again later");
		}finally{
			em.close();
		}
		return productList;
	}

	@Override
	public void updateProduct(Product product) throws SomeThingWentWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		EntityManager em = null;
		try {
			em = EMUtils.getEntityManager();
			
			Product productFromDB = em.find(Product.class, product.getProductId());
			if(productFromDB == null)
				throw new NoRecordFoundException("No Product found with the given id " + product.getProductId());

				if(!productFromDB.getName().equals(product.getName())) {
				Query query = em.createQuery("SELECT count(c) FROM Product c WHERE name = :name");
				query.setParameter("name", product.getName());
				if((Long)query.getSingleResult() > 0) {
					
					throw new SomeThingWentWrongException("Product already exists with name " + product.getName());
				}
			}
			
			//proceed for update operation
			
			EntityTransaction et = em.getTransaction();
			et.begin();
			productFromDB.setName(product.getName());
			productFromDB.setBrand(product.getBrand());
			productFromDB.setCategory(product.getCategory());
			productFromDB.setPrice(product.getPrice());
			productFromDB.setQuantity(product.getQuantity());
			et.commit();
		}catch(PersistenceException ex) {
			throw new SomeThingWentWrongException("Unable to process request, try again later");
		}finally{
			em.close();
		}
	}


	@Override
	public void deleteProduct(int productId) throws SomeThingWentWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProductId(productId);
		//Life-Cycle phase: detached
		
		EntityManager em = null;
		EntityTransaction et = null;
		try {
			em = EMUtils.getEntityManager();
			et = em.getTransaction();
			et.begin();
			
			//merged method returns an entity which is in the managed state
			product = em.merge(product);	//Life-Cycle phase: managed
			em.remove(product);	//Life-Cycle phase: removed
			et.commit();
		}catch(PersistenceException ex) {
			et.rollback();
			ex.printStackTrace();
			throw new SomeThingWentWrongException("Unable to delete Product, try again later");
		}finally {
			em.close();
		}
	}



}
