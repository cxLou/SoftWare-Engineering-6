package com.se.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.se.vo.Good;
import com.se.vo.Customer;

public class CustomerDaoImpl implements CustomerDao{
	public ArrayList<Customer> Cangku2() throws SQLException{
		 String url = "jdbc:mysql://rm-bp1n3zvt428005yvmeo.mysql.rds.aliyuncs.com:3306/software_engineering?characterEncoding=UTF-8&useSSL=false";
		 String username = "test_1";
		 String password = "Root123@";
		 String driver = "com.mysql.jdbc.Driver";
		
		 	//鍔犺浇椹卞姩
			try {
				Class.forName(driver);
				//杩炴帴鏁版嵁搴�
				Connection con = DriverManager.getConnection(url,username,password);
				//SQL璇彞
				String sql="select id,name,email,address,phone,time from customer";
				//鎵цSQL璇彞
				PreparedStatement ps=con.prepareStatement(sql);
				//鑾峰彇缁撴灉
				ResultSet rs = ps.executeQuery();
				
				ArrayList<Customer> clist=new ArrayList<Customer>();
				Customer c=null;
				
				while(rs.next()){
					c=new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
					clist.add(c);
				}
				return clist;
				
				} catch (ClassNotFoundException e) {
				e.printStackTrace();
				}			
		return null;
	}
}
