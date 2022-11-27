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
		<tr>
			<th>id</th>
			<th>author</th>
			<th>bookName</th>
			<th>pages</th>
			<th>price</th>
			<th>publisher</th>
			<th>yearPubish</th>
		</tr>

		<c:forEach items="${list }" var="p">
			<td>${p.isbn}</td>
			<td>${p.author}</td>
			<td>${p.bookName}</td>
			<td>${p.pages}</td>
			<td>${p.price}</td>
			<td>${p.publisher}</td>
			<td>${p.yearPubish}</td>
		</c:forEach>
	</table>
</body>
</html>