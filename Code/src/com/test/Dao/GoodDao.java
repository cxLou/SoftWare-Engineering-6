package com.test.Dao;
import com.test.vo.*;

public interface GoodDao {
	public void insertGood(Goods good,String ImageUrl) throws Exception;
	public void showGood(String GoodName) throws Exception;
}
