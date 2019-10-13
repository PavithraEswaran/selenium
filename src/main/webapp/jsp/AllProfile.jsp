<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
<h2>My Profile Details</h2>
<h3>Employee Id:  ${employee.employeeId}</h3>
<h3>Employee Name: ${employee.employeeName}</h3>
<h3>Employee Designation: ${employee.employeeDesignation}</h3>
<h3>Employee Location: ${employee.employeeLocation}</h3>
<h3>Employee UserName: ${employee.username}</h3>

<h2>All Employee Details</h2>
<table>
<tr>
<th>Employee Id </th> 
<th>Employee Name </th>
<th>Employee Designation</th> 
<th>Employee Location</th>
<th>Employee UserName</th> 
</tr>
<c:forEach var="emp" items="${allEmployees}">
<tr>

<td>${emp.employeeId}</td>

<td>${emp.employeeName}</td>

<td>${emp.employeeDesignation}</td>

<td> ${emp.employeeLocation}</td>

<td>${emp.username}</td>


</tr>
</c:forEach>
</table>
</body>
</html>