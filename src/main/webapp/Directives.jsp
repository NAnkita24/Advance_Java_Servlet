<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Random Number:</h1>
<%
Random r=new Random();
int a=r.nextInt(10);
//out.println(a);
%>

<%= a%>
<%@include file="NewFile.jsp" %>
</body>
</html>