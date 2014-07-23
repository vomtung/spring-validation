<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<body>
	<p>Languages</p>
	<a href="?language=en">English</a>|
	<a href="?language=fr">France</a>|
	<a href="?language=vi">Vietnamese</a>
	<h2> <spring:message code="index.hello" /></h2>
	<a href="<%=request.getContextPath()%>/account/register.html"><spring:message code="signin" /></a>
</body>
</html>
