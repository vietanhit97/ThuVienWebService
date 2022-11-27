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
	<h1>UPDATE BOOK</h1>
	<h3 style="color: red">${error}</h3>
	<form action="updateStudent" method="post">
		<table>
			<tr>
				<td>Id:</td>
				<td><input type="text" name=id value="${s.stuId}"
					readonly="readonly" /></td>
			</tr>
			<tr>
				<td>Full Name:</td>
				<td><input type="text" name="name" value="${s.fullName}" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><input type="text" name="address" value="${s.address}" /></td>
			</tr>
			<tr>
				<td>Birthday:</td>
				<td><input type="date" name="birthday"
					value="<fmt:formatDate pattern="yyyy-MM-dd" value="${s.birthday}"/>" /></td>
			</tr>
			<tr>
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
				<td><input type="submit" value="Update" /> <input type="reset"
					value="Clear" /></td>
			</tr>
		</table>
	</form>

</body>
</html>
