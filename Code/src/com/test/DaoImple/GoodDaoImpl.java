package com.test.DaoImple;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;
import com.test.Dao.*;
import com.test.vo.Goods;
public class GoodDaoImpl implements GoodDao{
	public static final String url = "jdbc:mysql://rm-bp1n3zvt428005yvmeo.mysql.rds.aliyuncs.com/software_engineering?characterEncoding=UTF-8";
	public static final String username = "test_1";
	public static final String password = "Root123@";
	public static final String driver = "com.mysql.jdbc.Driver";
	
//	@Override
	/*插入商品，图品转换为二进制插�?*/
	public void insertGood(Goods good,String ImageUrl) throws Exception {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			String sql = "Insert into Good values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			File filename = new File(ImageUrl);
			InputStream in = new FileInputStream(filename);
			good.setLength(in.available());
			byte[] b = new byte[good.getLength()];
			in.read(b);
			good.setGoodImage(b);
			ps.setString(1, good.getGoodName());
			ps.setFloat(2, good.getGoodPrice());
			ps.setString(3, good.getGoodDescribe());
			ps.setBytes(4, good.getGoodImage());
			ps.executeUpdate();
			in.close();
			ps.close();
			conn.close();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void showGood(String GoodName) throws Exception {
		// TODO Auto-generated method stub
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		String sql = "Select name from good where GoodName=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, GoodName);
		ResultSet res = ps.executeQuery();
		while(res.next()) {
			Float GoodPrice = res.getFloat("GoodPrice");
			InputStream is = res.getBinaryStream("GoodImage");
			is.skip(0);
			showReportImage(is);
			String GoodDescribe = res.getString("GoodDescribe");
		}
		
	}
	
}
