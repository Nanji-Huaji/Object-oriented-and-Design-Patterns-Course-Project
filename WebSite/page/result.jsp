<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<br>用户：
<%
	String username = (String)request.getAttribute("name");
	out.println(username);
%>
你好
</body>
</html>