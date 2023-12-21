package com.demo.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Factorial")
public class FactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static int f=1;
	public static int fact(int n) {
		for(int i=1;i<n;i++) {
			f =f*i;
		}
		return f;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int sum= Integer.parseInt(  (String) request.getAttribute("sum"));  //error
//		int factval= fact(sum);
		
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("servlet 2");
	}

}
