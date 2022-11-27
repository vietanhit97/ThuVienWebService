<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>LIST BOOKS</h1>
	<h3 style="color: green">${success}</h3>
	<table border="1">
		<tr>
			<th>stuId</th>
			<th>fullName</th>
			<th>gender</th>
			<th>birthday</th>
			<th>address</th>
			<th>classId</th>
			<th></th>
		</tr>
		<c:forEach items="${list }" var="s">
			<tr>
				<td>${s.stuId }</td>
				<td>${s.fullName }</td>
				<td>${s.gender ? "Male" : "Famale" }</td>
				<td><fmt:formatDate value="${s.birthday }" pattern="dd-MM-yyyy"/></td>
				<td>${s.address }</td>
				<td>${s.classId }</td>
				<td><a href="deleteStudent?id=${s.stuId }">Delete</a>
				<a href="preUpdateStudent?id=${s.stuId }">Update</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="initClass">Add New Book</a>
</body>
</html>