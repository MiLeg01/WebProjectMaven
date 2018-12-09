package com.userhandler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateUserServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req ,HttpServletResponse res) throws IOException {
		
		PrintWriter out = res.getWriter();
		
		//out.println(req.getParameter("firstname"));
		
	}

}
