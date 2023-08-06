package com.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletDemo() {
        System.out.println("Servlet Constructor");
    }

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method");
	}

	
	public void destroy() {
		System.out.println("Destroye method");
	}

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Service methods");
	}

}
