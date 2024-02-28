<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World</h1>
<%!
	int a=3;
	int b=5;
	String s="ankita";
	
	public int sum(){
		return a+b;
	}
	
	public String reverse(){
		StringBuffer sb=new StringBuffer(s);
		return sb.reverse().toString();
	}
%>

<%
	out.println(a);
	out.println(b);
	out.println("Sum is :"+sum());
	out.println(reverse());

%>

<h1>The sum is :<%= sum() %></h1>


</body>
</html>