package com.demo.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calci")
public class CalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		int num1= Integer.parseInt( request.getParameter("num1"));
		int num2= Integer.parseInt( request.getParameter("num2"));
		
		Integer sum=(num1+num2);
		
		out.println("<h3>Addition of "+num1+"+"+num2+"="+sum+ "</h3>");
		
		request.setAttribute("sum", sum);
		RequestDispatcher rd= request.getRequestDispatcher("Factorial");
		rd.include(request, response);  //include,forward
		
	}

}
