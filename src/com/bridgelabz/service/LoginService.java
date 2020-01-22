package com.bridgelabz.service;

import java.sql.SQLException;

import com.bridgelabz.model.LoginModel;

public interface LoginService {

	public String checkLogin(LoginModel user) throws SQLException, ClassNotFoundException;

	public String register(LoginModel register) throws SQLException, ClassNotFoundException;

}
