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
	<c:forEach var="post" items="${posts }">
		<tr>
			<td><a href="/detail/${post.id }">${post.title }</a></td>
			<td>${post.content }</td>
			<td>${post.user.username }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>