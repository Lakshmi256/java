package com.BridgeLabz.Implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.BridgeLabz.service.Dao;

public class LoginImplementation implements Dao{
	ResultSet rs=null;
	Connection con=null;
	PreparedStatement st=null;
	String status="";
	public Connection DaoImpl() throws SQLException, ClassNotFoundException
	{
	
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/lp","lp","Lp@268742");
			//con.createStatement();
		return con;
	}
	
	

	public String Checklogin(String uname,String password) throws SQLException, ClassNotFoundException
	{
		String s="select * from Register";
		st =DaoImpl().prepareStatement(s);
		rs=st.executeQuery();
		while(rs.next())
		{
			if ((uname.equals(rs.getString(9)))&&(password.equals(rs.getString(10))))
					{
				status="success";
					}
			else
			{
				status="failure";
			}
		}
			
		
			
		return status;
		
	}
	public String register(String Fname,String Lname,String email,String phoneno,String city,String state,String country,
			String pin,String uname,String password) throws SQLException, ClassNotFoundException
	{
		System.out.println("Connection is established :"+DaoImpl());
		System.out.println(status+"fhfjh");
		String s1="select * from Register";
		
		st =DaoImpl().prepareStatement(s1);
		  ResultSet rs1=st.executeQuery();
		  System.out.println(status+"n fhtfdydt");
		  while(rs1.next()) 
		  {
			  if (uname.equals(rs1.getString(9))) status="existed";
		  break;
		  
		  }
		
			if(!status.equals("existed"))
			{
//				String s2="INSERT INTO Register(Fname,Lname,email,phoneno,city,state,country,pin,uname,password)" +"VALUES('"
//			+Fname+"','"+Lname+"','"+email+"','"+phoneno+"','"+city+"','"+state+"','"+country+"','"+uname+"','"+password+"',)'";
			
			String insertQuery = "INSERT into Register values(?,?,?,?,?,?,?,?,?,?)";
			st =DaoImpl().prepareStatement(insertQuery);
			st.setString(1, Fname);
			st.setString(2, Lname);
			st.setString(3, email);
			st.setString(4, phoneno);
			st.setString(5, city);
			st.setString(6, state);
			st.setString(7, country);
			st.setString(8, pin);
			st.setString(9, uname);
			st.setString(10, password);
			
				int n=st.executeUpdate();
				System.out.println("record added:"+n);
				status= "success";
				
			}
		return status;
	}
	public String changePassword(String uname,String Password, String Password1) throws ClassNotFoundException, SQLException
	{
		String s="select * from Register";
		st =DaoImpl().prepareStatement(s);
		rs=st.executeQuery();
		
		while(rs.next())
		{
			if ((uname.equals(rs.getString(9)))&&(Password==Password1))
					{
		//		String insertQuery="UPDATE Register  WHERE uname="+uname+"SET password="+Password;
			//	st =DaoImpl().prepareStatement(insertQuery);
			
				status="success";
					}
		}
		return status;
		
	}
	
}
