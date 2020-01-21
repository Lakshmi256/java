package com.BridgeLabz.implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.BridgeLabz.service.LoginService;

public class LoginImplementation implements LoginService{
	ResultSet rs=null;
	Connection con=null;
	PreparedStatement st=null;
	String status="";

	public String Checklogin(String uname,String password) throws SQLException, ClassNotFoundException
	{
		String s="select * from Register";
		DataBaseConfigure DB=new DataBaseConfigure();
		st=DB.DataBaseConfigure().prepareStatement(s);;
	
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
	
		
		String s1="select * from Register";
		DataBaseConfigure DB=new DataBaseConfigure();
		st=DB.DataBaseConfigure().prepareStatement(s1);;
		  ResultSet rs1=st.executeQuery();
		  
		  while(rs1.next()) 
		  {
			  if (uname.equals(rs1.getString(9))) status="existed";
		  break;
		  
		  }
		
			if(!status.equals("existed"))
			{
			
			String insertQuery = "INSERT into Register values(?,?,?,?,?,?,?,?,?,?)";
			st=DB.DataBaseConfigure().prepareStatement(insertQuery);
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
				
				status= "success";
				
			}
		return status;
	}

	
}
