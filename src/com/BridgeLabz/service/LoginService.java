package com.BridgeLabz.service;
import java.sql.SQLException;

import com.BridgeLabz.model.LoginModel;

public interface LoginService {

	public String Checklogin(LoginModel User) throws SQLException, ClassNotFoundException;
	public String register(LoginModel Register) throws SQLException, ClassNotFoundException;
	
}
