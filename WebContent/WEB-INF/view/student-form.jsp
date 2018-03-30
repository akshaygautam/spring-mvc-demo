<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
	First Name:<form:input path="firstName"/><br>
	Last Name :<form:input path="lastName"/><br>
	Country	  :<form:select path="country">
	  <form:options items="${student.countryOptions}"></form:options>
	</form:select><br>
	Favorite Language:
	 JAVA		 :<form:radiobutton path="language" value="Java"/>
	 C# 		 :<form:radiobutton path="language" value="C#"/>
	 C			 :<form:radiobutton path="language" value="C"/>
	 Java Script:<form:radiobutton path="language" value="Java Script"/>
	 Python		 :<form:radiobutton path="language" value="Python"/><br>
	 <hr>
	<%--  Favorite OS:
	 Linux: <form:checkbox path="os" value="Linux"/>
	 Windows:<form:checkbox path="os" value="Windows"/>
	 Mac:<form:checkbox path="os" value="Mac"/>
	 Ubuntu:<form:checkbox path="os" value="Ubuntu"/><br> --%>
	<form:button type="submit" value="submit">submit</form:button>
	</form:form>
</body>
</html>