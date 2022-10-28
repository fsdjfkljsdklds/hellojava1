<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록(memberList.jsp)</title>
<style>
table {
	border-collapse: collapse;
	width: 80%;
}

th, td {
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #f2f2f2
}

th {
	background-color: #04AA6D;
	color: white;
}
</style>


</head>
<body>
	<h3>회원목록</h3>
	<table border='1'>
		<tr>
			<th>회원아이디</th>
			<th>이름</th>
			<th>이메일</th>
		</tr>
		<c:forEach var="member" items="${list }">
			<tr>
				<td>${member.id }</td>
				<td>${member.name }</td>
				<td>${member.email }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>