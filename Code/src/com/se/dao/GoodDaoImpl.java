package com.se.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.se.vo.Good;

public class GoodDaoImpl implements GoodDao {

	public ArrayList<Good> Cangku1() throws SQLException{
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
				String sql="select GoodName,GoodPrice,GoodDescribe from good";
				//鎵цSQL璇彞
				PreparedStatement ps=con.prepareStatement(sql);
				//鑾峰彇缁撴灉
				ResultSet rs = ps.executeQuery();
				
				ArrayList<Good> glist=new ArrayList<Good>();
				Good g=null;
				
				while(rs.next()){
					g=new Good(rs.getString(1),rs.getFloat(2),rs.getString(3));
					glist.add(g);
				}
				return glist;
				
				} catch (ClassNotFoundException e) {
				e.printStackTrace();
				}			
		return null;
	}
}
