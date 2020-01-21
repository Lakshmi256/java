package com.BridgeLabz.implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.BridgeLabz.model.LoginModel;
import com.BridgeLabz.service.LoginService;

public class LoginImplementation implements LoginService{
	ResultSet rs=null;
	Connection con=null;
	PreparedStatement st=null;
	String status="";

	public String Checklogin(LoginModel User) throws SQLException, ClassNotFoundException
	{
		String s="select * from Register";
		DataBaseConfigure DB=new DataBaseConfigure();
		st=DB.DataBaseConfigure().prepareStatement(s);;
	
		rs=st.executeQuery();
		while(rs.next())
		{
			if ((User.getUname().equals(rs.getString(9)))&&(User.getPassword().equals(rs.getString(10))))
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
	public String register(LoginModel Register) throws SQLException, ClassNotFoundException
	{
	
		
		String s1="select * from Register";
		DataBaseConfigure DB=new DataBaseConfigure();
		st=DB.DataBaseConfigure().prepareStatement(s1);;
		  ResultSet rs1=st.executeQuery();
		  
		  while(rs1.next()) 
		  {
			  if (Register.getUname().equals(rs1.getString(9))) status="existed";
		  break;
		  
		  }
		
			if(!status.equals("existed"))
			{
			
			String insertQuery = "INSERT into Register values(?,?,?,?,?,?,?,?,?,?)";
			st=DB.DataBaseConfigure().prepareStatement(insertQuery);
			st.setString(1, Register.getFname());
			st.setString(2, Register.getLname());
			st.setString(3, Register.getEmail());
			st.setString(4, Register.getPhoneno());
			st.setString(5, Register.getCity());
			st.setString(6, Register.getState());
			st.setString(7, Register.getCountry());
			st.setString(8, Register.getPin());
			st.setString(9, Register.getUname());
			st.setString(10, Register.getPassword());
			
				int n=st.executeUpdate();
				
				status= "success";
				
			}
		return status;
	}

	
}
