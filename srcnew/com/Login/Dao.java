package com.Login;
import java.sql.SQLException;

public interface Dao {

	public String Checklogin(String uname,String password) throws SQLException;
	public String register(String Fname,String Lname,String email,String phoneno,String city,String state,String country,
			String pin,String uname,String password);
}
