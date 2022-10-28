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
	<a href="passwdReConfirmForm.do">비밀번호 재전송</a>
	<!-- passwdReConfirmForm.jsp : 아이디 입력하고 재전송 : 메일주소로 변경된 비밀번호
	passwdReConfirm.do : 아이디 받아서 이메일정보로 메일발송
	
	 -->
	
</body>
</html>