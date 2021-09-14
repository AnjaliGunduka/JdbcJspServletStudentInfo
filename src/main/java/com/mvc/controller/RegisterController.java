package com.mvc.controller;

import java.io.IOException;

import com.mvc.bean.RegisterBean;
import com.mvc.dao.RegisterDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("RegisterController")
public class RegisterController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException

	{

		if (request.getParameter("btn_register")!= null) {

			int LibId = Integer.parseInt(request.getParameter("lib"));
			String Name = request.getParameter("fname");
			String Branch = request.getParameter("branch");
			String Section = request.getParameter("section");
			String Semester = request.getParameter("semester");
			int YearOfAdm = Integer.parseInt(request.getParameter("yearofadmin"));
			
			 RegisterBean registerBean=new  RegisterBean();
			 registerBean.setLibId(LibId);
			 registerBean.setName(Name);
			 registerBean.setBranch(Branch);
			 registerBean.setSection(Section);
			 registerBean.setSemester(Semester);
			 registerBean.setYearofadmin(YearOfAdm);
			
			
			
			RegisterDao registerDao=new RegisterDao();
			String registerValidate=registerDao.authorizeRegister(registerBean);
			if(registerValidate.equals("success Rgister"))
			{
//				HttpSession session=request.getSession();
				request.setAttribute("Register",registerValidate);
			
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);
			}
			else
			{
				request.setAttribute("Register",registerValidate);
				RequestDispatcher rd=request.getRequestDispatcher("Register.jsp");
				rd.include(request, response);
			}
			
			
			
			
			
			
		}
	}
}
