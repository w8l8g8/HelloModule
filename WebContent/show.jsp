<%@page import="com.xajiusuo.test.Dog"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShowJSP</title>
</head>
<body>
	welcome.<br>
	<%=((Dog)request.getAttribute("kehu")).getBreed() %><br>
	<%=request.getAttribute("dogBreed") %>
	<%=request.getParameter("developer") %><br>
	<%=request.getAttributeNames().nextElement() %><br>
	<%=request.getParameterNames().hasMoreElements() %>
</body>
</html>