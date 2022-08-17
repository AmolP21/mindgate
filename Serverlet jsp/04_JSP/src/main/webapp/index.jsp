<%@page import="org.apache.jasper.compiler.NewlineReductionServletWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP file</title>
</head>
<body>
<%! String message =" java is best...!"; %>
<%! %> 
<%for(int i=0; i<10; i++) {%>
<%=message.toUpperCase() %>
<h3>JSP is simple..!</h3>
<%} %>
</body>
</html>