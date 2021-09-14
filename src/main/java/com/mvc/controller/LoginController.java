package com.mvc.controller;

import java.io.IOException;

import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

	{
if(request.getParameter("btn_login")!=null)
{
	String username = request.getParameter("uname");
	String password = request.getParameter("upassword");
	
	LoginBean loginBean=new LoginBean();
	loginBean.setUsername(username);
	loginBean.setPassword(password);
	
	LoginDao loginDao=new LoginDao();
	String authorize=loginDao.authorizeLogin(loginBean);
	if(authorize.equals("Success Login"))
	{
		HttpSession session=request.getSession();
		session.setAttribute("login",loginBean.getUsername());
		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
		
	}
	
	else
	{
		request.setAttribute("wrongLoginMsg", authorize);
//		RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
//		rd.include(request, response);
	}
	
	
	
}
		
		
		
	}
}