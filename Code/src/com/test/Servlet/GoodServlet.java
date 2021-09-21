package com.test.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.Dao.GoodDao;
import com.test.DaoImple.GoodDaoImpl;
import com.test.vo.Goods;

/**
 * Servlet implementation class GoodServlet
 */
public class GoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			insertGood(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/*≤Â»Î…Ã∆∑*/
	protected void insertGood(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Goods good = new Goods();
		good.setGoodName(request.getParameter("GoodName")); 
		good.setGoodPrice(Float.parseFloat(request.getParameter("GoodPrice")));
		String ImageUrl = request.getParameter("ImageUrl");
		good.setGoodDescribe(request.getParameter("GoodDescribe"));
		GoodDao gDao = new GoodDaoImpl();
		gDao.insertGood(good, ImageUrl);
		session.setAttribute("good", good);
	}
}
