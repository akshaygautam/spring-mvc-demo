<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Form</title>
<style>
	.error{color:red;}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		First Name:<form:input path="firstName"/>
		<br>Last Name(*):<form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br>Salary: <form:input path="salary"/>
		<form:errors path="salary" cssClass="error"/>
		<br>Postal:<form:input path="postal"/>
		<form:errors path="postal" cssClass="error"/>
		<br>Course code:<form:input path="courseCode"/>
		<form:errors path="courseCode" cssClass="error"/>
		
		
		<br><input type="submit" value="submit"/>
		
	</form:form>
</body>
</html>