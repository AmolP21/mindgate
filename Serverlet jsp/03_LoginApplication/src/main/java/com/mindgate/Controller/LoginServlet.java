package com.mindgate.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String userid,password;
userid=request.getParameter("loginid");
password =request.getParameter("Password");
if(userid.equals("admin")&& password.equals("bhahubali")) {
response.sendRedirect("home.html");
}else
{
	response.sendRedirect("invalied.html");
}
	
	}


}
