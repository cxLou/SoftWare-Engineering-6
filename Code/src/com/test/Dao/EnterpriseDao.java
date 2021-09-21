package com.test.Dao;

import java.sql.SQLException;

public interface EnterpriseDao {
	public boolean checkEnterprise(String username,String pwd) throws SQLException;
	public void insertEnterprise(String username,String pwd) throws SQLException;
	public void changePwd(String username,String newpwd, String phone)throws SQLException;
}
