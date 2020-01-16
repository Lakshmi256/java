package com.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoImpl implements Dao{
	ResultSet rs=null;
	Connection con=null;
	Statement st=null;
	String status="";
	public DaoImpl()
	{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/login_data","lp","Lp@268742");
		Statement st=con.createStatement();
	}
	catch (Exception e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	public String Checklogin(String uname,String password) throws SQLException
	{
		String s="'select * from userlog where uname='"+uname+"'and password='"+password+"'";
		rs=st.executeQuery(s);
		if(rs.next())
			status="success";
		else
			status="failure";
		return status;
		
	}
	public String register(String Fname,String Lname,String email,String phone,String city,String state,String country,
			String pin,String uname,String password)
	{
		
		System.out.println(status+"aaa");
		try {
			String s1="select * from userlog";
			ResultSet rs1=st.executeQuery(s1);
			System.out.println(status+"aaa");
			while(rs1.next())
			{
				if (uname.equals(rs1.getString(6)))
					status="existed";
				break;
				
			}
			if(!status.equals("existed"))
			{
				String s2="insert into userlog(Fname,Lname,email,city,state,country,pin,uname,password) values('"
			+Fname+"','"+Lname+"','"+email+"','"+city+"','"+state+"','"+country+"','"+uname+"','"+password+"',)'";
			
				int n=st.executeUpdate(s2);
				System.out.println("record added:"+n);
				status= "success";
				
			}
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println("Exception");
			e.printStackTrace();
			status="failure";
		}
		return status;
	}}
