package com.mindgate.Add;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addition
 */
@WebServlet("/Addition")
public class Addition extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String choice= request.getParameter("oprtn");
		int number1=Integer.parseInt(request.getParameter("usernumber1"));
		int number2=Integer.parseInt(request.getParameter("usernumber2"));
		switch(choice) {
		case "ADD" :
			int add=number1 +number2;
			PrintWriter out =response.getWriter();
			out.print("ADDITION OF NUMBER IS:" +add);
		break;
		case "SUB":
			int sub=number1 -number2;
			PrintWriter out1 =response.getWriter();
			out1.print("SUBSTRACTION OF NUUMBER IS:"+sub);
			break;
			
		}
		
	}

}
