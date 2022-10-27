<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- bulletin/bulletin.tiles -->
<!-- tiles로 확장자가 끝나야함. -->
<h3>게시판 페이지</h3>
<table border='1'>
	<tr>
		<th>글번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일자</th>
	</tr>
	<c:forEach var="vo" items="${bList }">
		<tr>
			<td><a href="searchBoard.do?bno=${vo.boardNo }">${vo.boardNo }</a></td>
			<td>${vo.title }</td>
			<td>${vo.writer }</td>
			<td>${vo.writeDate }</td>
		</tr>
	</c:forEach>
</table>
<p />
<div class='pagination'>
	<c:if test="${page.prev }">
		<a href="bulletin.do?page=${page.startPage-1}">&lt;&lt;</a>
	</c:if>

	<c:forEach var="i" begin="${page.startPage }" end="${page.endPage }" step="1">
		<c:choose>
			<c:when test="${page.pageNum == i }">
				<a class='active' href="bulletin.do?page=${i }">${i }</a>
			</c:when>
			<c:otherwise>
				<a href="bulletin.do?page=${i }">${i }</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>

	<c:if test="${page.next }">
		<a href="bulletin.do?page=${page.endPage+1}">&lt;&lt;</a>
	</c:if>

</div>