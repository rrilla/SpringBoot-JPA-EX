<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<th>제목</th>
		<th>내용</th>
		<th>작성자</th>
		<tr>
			<td>${post.title }</td>
			<td>${post.content }</td>
			<td>${post.user.username }</td>
		</tr>
	</table>
	<h2>댓글</h2>
	<table border="1">
	<th>작성자</th>
	<th>내용</th>
		<c:forEach var="comm" items="${post.comments }">
		<tr>
			<td>${comm.user.username }</td>
			<td>${comm.content }</td>
		</tr>
		</c:forEach>
	</table>
	<a href="/"><button>리스트로</button></a>
</body>
</html>