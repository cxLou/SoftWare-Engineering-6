package com.se.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.se.dao.CustomerDao;
import com.se.dao.CustomerDaoImpl;
import com.se.dao.GoodDao;
import com.se.dao.GoodDaoImpl;
import com.se.vo.Good;
import com.se.vo.Repository;
import com.se.vo.Customer;


public class GoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoodServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String method=request.getParameter("method");

		if(method.equals("check")){
			Check(request, response);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void Check(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
			
		try {
			//建仓库
			Repository repo=new Repository();
			
			GoodDao gd=new GoodDaoImpl();
			CustomerDao cd=new CustomerDaoImpl();
			
			List<Good> goodlist=gd.Cangku1();
			List<Customer> customerlist=cd.Cangku2();

			repo.setRepo1(goodlist);
			repo.setRepo2(customerlist);
			
			session.setAttribute("repo", repo);
			
			request.getRequestDispatcher("InfoShow.jsp").forward(request, response);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
