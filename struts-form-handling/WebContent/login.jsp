<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<body>
	
	<h2>Login Page</h2>
	
	<s:form action="login">
		<s:textfield name="username" label="Username"/>
		<s:textfield name="password" label="Password"/>
		<s:submit/>
	</s:form>
	
</body>
</html>