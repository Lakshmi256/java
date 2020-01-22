package com.bridgelabz.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.implementation.LoginImplementation;
import com.bridgelabz.model.LoginModel;
import com.bridgelabz.service.LoginService;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			LoginModel register = new LoginModel();
			register.setfName(request.getParameter("Fname"));
			register.setfName(request.getParameter("Lname"));
			register.setEmail(request.getParameter("email"));
			register.setPhoneno(request.getParameter("phoneno"));
			register.setCity(request.getParameter("city"));
			register.setState(request.getParameter("state"));
			register.setCountry(request.getParameter("country"));
			register.setPin(request.getParameter("pin"));
			register.setUname(request.getParameter("uname"));
			register.setPassword(request.getParameter("password"));
			LoginService u = new LoginImplementation();

			String status = u.register(register);
			if (status.equals("success")) {
				RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);

			} else if (status.equals("existed")) {
				response.sendRedirect("Register.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
