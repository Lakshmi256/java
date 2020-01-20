package com.BridgeLabz.Controller;

import java.awt.Window;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bridgelabz.Implementation.LoginImplementation;
import com.Bridgelabz.service.Dao;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		Dao u=new LoginImplementation();
		
			String status=u.Checklogin(uname, password);
			if (status.equals("success"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
				rd.forward(request, response);
			}
			else
				response.sendRedirect("Invalid.jsp");
			
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}