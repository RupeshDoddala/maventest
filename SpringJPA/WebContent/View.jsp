<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/core" prefix = "core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> All Employees</title>
</head>
<body>
<h4 align="center">List of Employees</h4>
<table border="1" align="center">
<tr>
<th>Employee Number</th>
<th>First Name</th>
<th>Last Name</th>
<th>Gender</th>
<th>Salary</th>
<th>Organization</th>
<th>User name</th>
</tr>
<core:forEach var="employee" items= "${allEmployees}">
<tr>
<td><core:out value="${employee.getEno()}"></core:out> </td>
<td><core:out value="${employee.getFirstname()}"></core:out> </td>
<td><core:out value="${employee.getLastname()}"></core:out> </td>
<td><core:out value="${employee.getGender()}"></core:out> </td>
<td><core:out value="${employee.getSalary()}"></core:out> </td>
<td><core:out value="${employee.getOrganization()}"></core:out> </td>
<td><core:out value="${employee.getUsername()}"></core:out> </td>
<td><a href="deleteEmployee.htm?eno=${employee.eno}"><img src="delete.png" width="20" height="20"></a></td>
</tr>
</core:forEach>
</table>
</body>
</html>