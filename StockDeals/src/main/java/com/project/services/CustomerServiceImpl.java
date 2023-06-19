//package com.project.services;
//
//import com.project.entity.Customer;
//import com.project.exception.NoRecordFoundException;
//import com.project.exception.SomeThingWentWrongException;
//
//import java.util.List;
//
//import com.project.dao.CustomerDAO;
//import com.project.dao.CustomerDAOImpl;
//
//public class CustomerServiceImpl implements CustomerService{
//
//	@Override
//	public void addCustomer(Customer customer) throws SomeThingWentWrongException {
//		// TODO Auto-generated method stub
//		CustomerDAO customerDAO = new CustomerDAOImpl();
//		customerDAO.addCustomer(customer);
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
