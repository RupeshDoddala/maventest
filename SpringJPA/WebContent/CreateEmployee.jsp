<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
	
		<h3 align="center">Add Employee</h3>
		
		<spring:form action="create.htm" method="post" modelAttribute="createCommand">
			<table align="center">
				<tr>
					<td>First Name</td>
					<td><spring:input path="firstname"/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><spring:input path="lastname"/></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td> <spring:radiobuttons path="gender" items="${gMap}"/> </td>
				</tr>
				<tr>
					<td>Salary</td>
					<td><spring:input path="salary"/></td>
				</tr>
				<tr>
					<td>Organization</td>
					<td><spring:input path="organization"/></td>
				</tr>
				<tr>
					<td>User Name</td>
					<td><spring:input path="username"/></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><spring:password path="password"/></td>
				</tr>			
				<tr>
					<td colspan="2" align="right"><input type="reset" value="Clear"/>
						<input type="submit" value="Create"/>
					</td>
				</tr>			
			</table>
		</spring:form>
	
	</body>
</html>