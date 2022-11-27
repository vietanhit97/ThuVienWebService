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
	<h1>INSERT NEW BOOK</h1>
	<h3 style="color: red">${error}</h3>
	<form action="insertStudent" method="post">
		<table>

			<tr>
				<td>fullName:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>birthday:</td>
				<td><input type="date" name="birthday" /></td>
			</tr>
			<tr>
				<td>address:</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>classId:</td>
				<td><select name="classId">
						<option value="">---chon---</option>
						<c:forEach items="${data}" var="c">
							<option value="${c.classId}">${c.className }</option>
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>Male <input type="radio" name="gender" checked="checked"
					value="true" /></td>
				<td><br>Famale <input type="radio" name="gender"
					value="false" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Insert" /> <input type="reset"
					value="Clear" /></td>
			</tr>
		</table>
	</form>

</body>
</html>