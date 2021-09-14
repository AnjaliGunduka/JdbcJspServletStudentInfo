package com.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mvc.bean.LoginBean;

public class LoginDao {

	public String authorizeLogin (LoginBean loginBean)
	{
		String username = loginBean.getUsername();
		String password = loginBean.getPassword();
		String dbusername="";
		String dbpassword="";
		String url="jdbc:mysql://localhost:3306/librarysystem";
		String urname="root";
		String pass="";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,urname,pass);
			PreparedStatement psmt=null;
			psmt=con.prepareStatement("select *from student_library_login where username=? and password=?");
			psmt.setString(1, username);
			psmt.setString(2, password);
			ResultSet rs=psmt.executeQuery();
			while(rs.next()) {
				dbusername=rs.getString("username");
				dbpassword=rs.getString("password");
				if(username.equals(dbusername)&&password.equals(dbpassword))
				{
					return "Successs Login";
				}
				
			}
			psmt.close();
			
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "Wrong Username And Password";
		
	}
	
	
}
