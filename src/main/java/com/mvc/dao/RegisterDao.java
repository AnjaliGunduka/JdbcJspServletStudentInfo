package com.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mvc.bean.RegisterBean;

public class RegisterDao {

	public String authorizeRegister(RegisterBean registerBean) {
		// TODO Auto-generated method stub
		int LibId = registerBean.getLibId();
		int yearofadmin = registerBean.getYearofadmin();
		String name = registerBean.getName();
		String branch = registerBean.getBranch();
		String semester=registerBean.getSemester();
		String section = registerBean.getSection();

		String url="jdbc:mysql://localhost:3306/librarysystem";
		String uname="root";
		String pass="Tiger";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pass);
			
			PreparedStatement pstmt=null;
			pstmt=con.prepareStatement("insert into student_libaray_account(LibId, yearofadmin,name,branch,section)"
					+ "values(?,?,?,?,?)");
			
			pstmt.setInt(1,LibId);
			pstmt.setString(2, name);
			pstmt.setString(3,branch);
			pstmt.setString(4,section);
			pstmt.setString(5,semester);
			pstmt.setInt(6,yearofadmin);
			pstmt.executeUpdate();
			pstmt.close();
			con.close();
			
		return"Success Register";	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return "Fail Register";
	}

}