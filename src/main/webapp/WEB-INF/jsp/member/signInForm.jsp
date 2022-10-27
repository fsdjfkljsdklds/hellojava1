<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인화면(signInForm.jsp)</title>
</head>
<body>
 <h3>로그인화면</h3>
	<form action="./signIn.do" method="post">
	ID:<input type="text" name="id"><br>
	PW:<input type="password" name="passwd"><br>
	<input type="submit" value="로그인"> 	<input type= "button" value="메인화면" onClick="location.href='http://localhost/H20221025/'">
	
	</form>
	
</body>
</html>