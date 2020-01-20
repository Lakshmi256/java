package com.Bridgelabz.service;
import java.sql.SQLException;

public interface Dao {

	public String Checklogin(String uname,String password) throws SQLException, ClassNotFoundException;
	public String register(String Fname,String Lname,String email,String phoneno,String city,String state,String country,
			String pin,String uname,String password) throws SQLException, ClassNotFoundException;
	public String changePassword(String uname,String Password, String Password1) throws ClassNotFoundException, SQLException;
}
