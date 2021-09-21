package com.test.Dao;
import java.sql.SQLException;

import com.test.vo.*;

public interface GoodDao {
	public void insertGood(Goods good,String ImageUrl) throws Exception;
	
}
