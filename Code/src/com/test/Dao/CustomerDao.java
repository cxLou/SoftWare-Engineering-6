package com.test.Dao;

import java.sql.SQLException;

import com.test.vo.Customer;

public interface CustomerDao {
	public void insertCustomer(Customer c)throws SQLException;
}
