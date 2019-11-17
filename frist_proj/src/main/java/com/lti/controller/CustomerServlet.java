package com.lti.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.app.App;


public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CustomerServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			App ad =new App(request.getParameter("txtName"),request.getParameter("txtCity"));
				
		
		
		
	}

}
