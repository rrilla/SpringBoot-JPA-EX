<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="layout/header.jsp" %>

<main>
	<h1>!!!!!!게시글 목록!!!!</h1>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>TITLE</td>
			<td>CONTENT</td>
			<td>READCOUNT</td>
			<td>CREATEDATE</td>
		</tr>
		<c:forEach var="board" items="${boards }">
		<tr>
			<td>${board.id }</td>
			<td><a href="/detail/${board.id }">${board.title }</a></td>
			<td>${board.content }</td>
			<td>${board.readCount }</td>
			<td>${board.createDate }</td>
		</tr>
		</c:forEach>
	</table>
</main>

<%@include file="layout/footer.jsp" %>

