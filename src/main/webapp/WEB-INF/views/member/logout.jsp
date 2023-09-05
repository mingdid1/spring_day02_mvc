<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	logout.jsp
	
	<h1>로그아웃 페이지</h1>
	${ test } >> 값 입니다 <br>
	<%= request.getParameter("test") %> >> null <br>
	<%= request.getAttribute("test") %> >> 값 입니다<br>
	
	<a href="index">기본 페이지</a>
	<a href="login">로그인 페이지</a>
</body>
</html>