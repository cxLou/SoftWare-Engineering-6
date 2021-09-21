package com.test.DaoImple;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import com.test.Dao.EnterpriseDao;

public class EnterpriseDaoImple implements EnterpriseDao{
	 String URL = "jdbc:mysql://rm-bp1n3zvt428005yvmeo.mysql.rds.aliyuncs.com:3306/software_engineering?characterEncoding=UTF-8&useSSL=true";
	 String USER = "test_1";
	 String PWD = "Root123@";
//	@Override
	public boolean checkEnterprise(String username,String pwd) throws SQLException {
		java.sql.PreparedStatement ps =null;
		java.sql.Connection con = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,USER,PWD);
			String sql = "Select username,password from enterprise_login where username=? and password=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, pwd);
			rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(null != rs) {
				rs.close();
			}
			if(null != ps) {
				ps.close();
			}
			if(null != con) {
				con.close();
			}
		}
		return false;
	}

//	@Override
	public void insertEnterprise(String username, String pwd) throws SQLException {
		java.sql.PreparedStatement ps = null;
		java.sql.Connection con = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,USER,PWD);
			String sql = "insert into Enterprise(username,password) value(?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, pwd);
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

//	@Override
	public void changePwd(String username, String newpwd,String phone) throws SQLException {
		java.sql.PreparedStatement ps = null;
		java.sql.Connection con = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL,USER,PWD);
			String sql = "update enterprise_login set password=?,phone=? where username=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, newpwd);
			ps.setString(2, phone);
			ps.setString(3, username);
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
