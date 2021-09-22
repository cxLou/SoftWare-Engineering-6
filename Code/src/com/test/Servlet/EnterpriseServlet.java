package com.test.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.test.Dao.EnterpriseDao;
import com.test.DaoImple.EnterpriseDaoImple;
import com.test.vo.Enterprise;

public class EnterpriseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public EnterpriseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flag = request.getParameter("flag");
		if(flag.equals("checkuser")) {
			try {
				checkEnterprise(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(flag.equals("insertuser")) {
			try {
				insertEnterprise(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(flag.equals("changePwd")) {
			try {
				changePwd(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void changePwd(HttpServletRequest request, HttpServletResponse response)throws SQLException, IOException {
		HttpSession session = request.getSession();
		Enterprise e = (Enterprise) session.getAttribute("enterprise");
		String username = e.getUsername();
//		String phone1 = e.getPhone();
//		String username = request.getParameter("username");
		String pwd1 = request.getParameter("pwd1");
		String pwd2 = request.getParameter("pwd2");
		String phone = request.getParameter("phone");
		if(pwd1.equals(pwd2)){
			EnterpriseDao ed = new EnterpriseDaoImple();
			ed.changePwd(username, pwd1,phone);
			response.sendRedirect("seller_edit_succeed.jsp");
		}else {
			response.sendRedirect("seller_edit_fail.jsp");
		}
		
	}

	private void insertEnterprise(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		HttpSession session = request.getSession();
		String username = request.getParameter("newuser");
		String pwd = request.getParameter("newpwd");
		Enterprise e = new Enterprise(username,pwd); 
		EnterpriseDao ed = new EnterpriseDaoImple();
		ed.insertEnterprise(username, pwd);
		session.setAttribute("enterprise", e);
		response.sendRedirect("login.jsp");
	}

	private void checkEnterprise(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		Enterprise e = new Enterprise(username,pwd);
		EnterpriseDao ed = new EnterpriseDaoImple();
		if(ed.checkEnterprise(username, pwd)) {
			session.setAttribute("enterprise", e);
			System.out.println(ed.checkEnterprise(username, pwd));
			response.sendRedirect("seller_index.jsp");
		}else {
			request.setAttribute("enterprise01", e);
			response.sendRedirect("seller_logon_fail.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

