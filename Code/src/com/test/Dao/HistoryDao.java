package com.frli.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.frli.vo.History;

public interface HistoryDao {
	public void insertHistory(History his)throws SQLException;
	public ArrayList<History> searchHistory()throws SQLException;
	public void updateHistory(String goodName,String orderNum) throws SQLException;
	public ArrayList<History> searchSuccess()throws SQLException;
}
