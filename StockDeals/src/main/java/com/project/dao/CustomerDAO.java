//package com.project.dao;
//
//import java.util.List;
//
//import com.project.entity.Customer;
//import com.project.exception.NoRecordFoundException;
//import com.project.exception.SomeThingWentWrongException;
//
//public interface CustomerDAO {
//	void addCustomer(Customer customer) throws SomeThingWentWrongException;
//	void login(String username, String password) throws SomeThingWentWrongException;
//	void changePassword(String oldPassword, String newPassword) throws SomeThingWentWrongException;
//	void deleteAccount() throws SomeThingWentWrongException;
//	List<Object[]> getCustomerList() throws SomeThingWentWrongException, NoRecordFoundException;
//}
