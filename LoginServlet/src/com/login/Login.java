package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String u = request.getParameter("user");
		String p = request.getParameter("pass");
		if("ranjeet".equals(u)&& "maskar".equals(p)) {
			request.setAttribute("data", u);
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");		//File name here
			rd.forward(request, response);
			//System.out.println("Correct");
		}else {
			request.setAttribute("u", u);
			RequestDispatcher rd = request.getRequestDispatcher("Failuare.jsp");
			rd.forward(request, response);
			//System.out.println("Incorrect");
		}
	}

}
