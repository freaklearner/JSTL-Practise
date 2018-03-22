package org.com.shub.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String name=req.getParameter("username");
		req.setAttribute("msg", "Welcome "+name);
		RequestDispatcher view = req.getRequestDispatcher("success.jsp");
		view.forward(req, res);
	}

}
