package com.add;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.User;

public class AddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		if(i == 1)
			res.getWriter().println("<h1 style=\"background-color:DodgerBlue;\">The result is</h1> " + k + " and i is 1");
		else
			res.getWriter().println("The result is " +  k + " and i is not 1");
		
	}

}
