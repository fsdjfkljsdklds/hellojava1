<%@page import="co.edu.dao.BoardDAO"%>
<%@page import="co.edu.board.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language(EL) JSP Standard Tag Library(JSTL)</title>
</head>
<body>
	<%
	String info = (String) application.getAttribute("info");
	System.out.println(info);

	BoardDAO dao = new BoardDAO();
	List<BoardVO> list = (List<BoardVO>) dao.pageList(1);

	request.setAttribute("bList", list);
	%>
	<!-- 달러는 그냥 변수에 들어잇는 값보여주는거 간단한 연산 및 eq로 비교가능  -->
	<p>${info }</p>
	<p>${55+22 }</p>
	<p>${info }</p>
	<p>${param.page }</p>
	<p>app: ${sessionScope.hiSession eq null }</p>

	<!-- c:set은 변수언하는거 -->
	<c:set var="myName" value="홍길동"></c:set>
	<p>${myName }</p>
	<c:out value="${myName }"></c:out>

	<!-- c:if는 if랑 같음 -->
	<c:if test="${info eq 'hong' }">
		<p>같습니다</p>
	</c:if>
	<c:if test="${!info2 }">
		<p>값이 없습니다</p>
	</c:if>

	<c:set var="score" value="75"></c:set>
	<!-- choose는 if else 하는거 otherwise는 else{ -->
	<c:choose>
		<c:when test="${score > 90 }">
			<p>A학점</p>
		</c:when>
		<c:when test="${score > 80 }">
			<p>B학점</p>
		</c:when>
		<c:when test="${score > 70 }">
			<p>C학점</p>
		</c:when>
		<c:otherwise>
			<p>불합격</p>
		</c:otherwise>
	</c:choose>


	<!-- forEach는 반복문 변수 i선언하고 1에서 10까지 1씩올림 -->
	<c:forEach var="i" begin="1" end="10" step="1">
		<p>${i }</p>
	</c:forEach>

	<c:forEach var="board" items="${bList }">
	<p>글번호:${board.boardNo }, 제목:${board.title }, 작성자:${board.writer }</p>
	</c:forEach>



</body>
</html>