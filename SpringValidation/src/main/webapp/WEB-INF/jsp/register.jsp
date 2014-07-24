<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>

	<form:form method="post" commandName="acc" action="register.html">
		<ul>
			<form:errors path="*" cssClass="errorblock" element="div" />
		</ul>
		<br>
		<table border="0">
			<tr>
				<td>Username</td>
				<td><form:input path="username" /></td>
				<td><form:errors path="username" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" /></td>
				<td><form:errors path="password" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Enail</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><form:input path="age" /></td>
				<td><form:errors path="age" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>