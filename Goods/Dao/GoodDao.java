package Dao;
import java.sql.SQLException;

import vo.*;

public interface GoodDao {
	public void insertGood(Goods good,String ImageUrl) throws Exception;
	
}
