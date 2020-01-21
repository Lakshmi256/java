package com.BridgeLabz.service;
import java.sql.SQLException;

public interface LoginService {

	public String Checklogin(String uname,String password) throws SQLException, ClassNotFoundException;
	public String register(String Fname,String Lname,String email,String phoneno,String city,String state,String country,
			String pin,String uname,String password) throws SQLException, ClassNotFoundException;
}
