package com.bridgelabz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.implementation.LoginImplementation;
import com.bridgelabz.model.LoginModel;
import com.bridgelabz.service.LoginService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			LoginModel user = new LoginModel();
			user.setUname(request.getParameter("uname"));
			user.setPassword(request.getParameter("password"));
			LoginService u = new LoginImplementation();

			String status = u.checkLogin(user);
			if (status.equals("success")) {

				PrintWriter out = response.getWriter();
				HttpSession session = request.getSession();
				String n = (String) session.getAttribute("uname");
				out.print(n + " Login succefull");
				out.close();
			} else {

				response.sendRedirect("Login.jsp");
			}
		}

		catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
	}
}