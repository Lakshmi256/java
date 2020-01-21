package com.BridgeLabz.controller;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginFilter
 */
@WebServlet("/LoginFilter")
public class LoginFilter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException, ServletException
{
	HttpServletRequest req=(HttpServletRequest)request;
	HttpServletResponse res=(HttpServletResponse)response;
	String uname=req.getParameter("uname");
	String Password=req.getParameter("password");
	HttpSession s2=req.getSession();
	RequestDispatcher rd=null;
	if (uname==null||Password==null)
	{
		res.sendRedirect("Login.jsp");
	}
	else
		chain.doFilter(request, response);
}
}
