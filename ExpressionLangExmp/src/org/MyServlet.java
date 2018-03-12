package org;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		String[] str = {"Shubham","Abhi","Rajat"};
		req.setAttribute("names", str);
		
		RequestDispatcher view = req.getRequestDispatcher("success.jsp");
		view.forward(req, res);
		
	}
}
