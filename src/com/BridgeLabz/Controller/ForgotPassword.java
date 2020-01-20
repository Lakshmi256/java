package com.BridgeLabz.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bridgelabz.service.Dao;
import com.Bridgelabz.service.DaoImpl;

/**
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String uname=request.getParameter("uname");
	String  password=request.getParameter("password");
	String password1=request.getParameter("password1");
Dao u=new DaoImpl();

	String status=u.changePassword(uname, password, password1);

	if (status.equals("success"))
	{
		RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
		rd.forward(request, response);
	}
	else
		response.sendRedirect("ForgotPassword.jsp");
	

} 
		catch (ClassNotFoundException | SQLException e) {
			
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
	}
