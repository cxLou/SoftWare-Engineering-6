package com.test.DaoImple;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.test.Dao.CustomerDao;
import com.test.vo.Customer;

public class CustomerDaoImple implements CustomerDao{
	 String URL = "jdbc:mysql://rm-bp1n3zvt428005yvmeo.mysql.rds.aliyuncs.com:3306/software_engineering?characterEncoding=UTF-8&useSSL=true";
	 String USER = "test_1";
	 String PWD = "Root123@";
//	@Override
	public void insertCustomer(Customer c) throws SQLException {
		java.sql.PreparedStatement ps = null;
		java.sql.Connection con = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(URL,USER,PWD);
			String sql = "insert into customer(name,email,address,phone,time) value(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, c.getName());
			ps.setString(2, c.getEmail());
			ps.setString(2, c.getAddress());
			ps.setString(2, c.getPhone());
			ps.setString(2, c.getTime());
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
		}
	}

}
