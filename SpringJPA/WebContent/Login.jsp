<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	
		<h3 align="center">Login</h3>
		
		<h6 align="center" style="color: red;"><core:out value="${message}"/></h6>
		
		<spring:form action="check.htm" method="post" modelAttribute="loginCommnad">
			<table align="center">
				<tr>
					<td>UserName</td>
					<td><spring:input path="username"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><spring:password path="password"/></td>
				</tr>			
				<tr>
					<td colspan="2" align="right"><input type="reset" value="Clear"/>
						<input type="submit" value="Login"/>
					</td>
				</tr>			
				<tr>
					<td colspan="2" align="right"><a href="getCreatePage.htm">New Employee</a></td>
				</tr>			
				
			</table>
		</spring:form>
	
	</body>
</html>