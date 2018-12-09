package com.add;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Customer;
import com.persistence.CustomerSpringDataDaoImpl;

public class AddServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		res.getWriter().println("The result is " + k + "!!!11elf");
		
		try {
			Customer cust = new Customer();
			CustomerSpringDataDaoImpl daoservice = new CustomerSpringDataDaoImpl();
			cust = daoservice.getCustomerById(3L);
			res.getWriter().println(cust.getFirstName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
