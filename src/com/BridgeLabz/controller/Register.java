package com.BridgeLabz.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.BridgeLabz.implementation.LoginImplementation;
import com.BridgeLabz.model.LoginModel;
import com.BridgeLabz.service.LoginService;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			LoginModel Register=new LoginModel();
		Register.setFname(request.getParameter("Fname"));
		Register.setLname(request.getParameter("Lname"));
		Register.setEmail(request.getParameter("email"));
		Register.setPhoneno(request.getParameter("phoneno"));
		Register.setCity(request.getParameter("city"));
		Register.setState(request.getParameter("state"));
		Register.setCountry(request.getParameter("country"));
		Register.setPin(request.getParameter("pin"));
		Register.setUname(request.getParameter("uname"));
		Register.setPassword(request.getParameter("password"));
		LoginService u=new LoginImplementation();

		String status=u.register(Register);
		if(status.equals("success"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request,response);
			
		}
		else
			if(status.equals("existed"))
			{
				response.sendRedirect("Register.jsp");
			}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
