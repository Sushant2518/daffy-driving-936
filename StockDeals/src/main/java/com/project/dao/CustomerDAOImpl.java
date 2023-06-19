//package com.project.dao;
//
//import java.util.List;
//
//import com.project.entity.Customer;
//import com.project.exception.NoRecordFoundException;
//import com.project.exception.SomeThingWentWrongException;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.PersistenceException;
//import jakarta.persistence.Query;
//
//public class CustomerDAOImpl implements CustomerDAO{
//
//	@Override
//	public void addCustomer(Customer customer) throws SomeThingWentWrongException {
//		// TODO Auto-generated method stub
//		EntityManager em = null;
//		try {
//			em = EMUtils.getEntityManager();
//			
//			//check if company with same username exists
//			Query query = em.createQuery("SELECT count(c) FROM Customer c WHERE username = :username");
//			query.setParameter("username", customer.getUsername());
//			if((Long)query.getSingleResult() > 0) {
//				//you are here means company with given name exists so throw exceptions
//				throw new SomeThingWentWrongException("The username" + customer.getUsername() + " is already occupied");
//			}
//			
//			//you are here means no company with given name
//			EntityTransaction et = em.getTransaction();
//			et.begin();
//			em.persist(customer);
//			et.commit();
//		}catch(PersistenceException ex) {
//			throw new SomeThingWentWrongException("Unable to process request, try again later");
//		}finally{
//			em.close();
//		}
//	}
//
//	@Override
//	public void login(String username, String password) throws SomeThingWentWrongException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void changePassword(String oldPassword, String newPassword) throws SomeThingWentWrongException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deleteAccount() throws SomeThingWentWrongException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<Object[]> getCustomerList() throws SomeThingWentWrongException, NoRecordFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//	
//}
