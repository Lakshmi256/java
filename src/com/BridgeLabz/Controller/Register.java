package com.BridgeLabz.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.BridgeLabz.Implementation.LoginImplementation;
import com.BridgeLabz.service.Dao;

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
		String Fname=request.getParameter("Fname");
		String Lname=request.getParameter("Lname");
		String email=request.getParameter("email");
		String phoneno=request.getParameter("phoneno");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String country=request.getParameter("country");
		String pin=request.getParameter("pin");
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		Dao u=new LoginImplementation();
		System.out.println(pin);
		String status=u.register(Fname,Lname,email,phoneno,city,state,country,
				pin,uname, password);
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
