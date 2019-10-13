<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="editQuestionProcess" method="get" modelAttribute="question">
<table>
<form:hidden path="questionId"/>
<h2>${question.questionDescription}</h2>

			<tr>
                <td>Edit Question here:</td>
                <td><form:input type="text" path="questionDescription" /></td>
            </tr>
            <tr>
                <td><form:hidden path="date" /></td>
                <td><form:hidden path="employee.employeeId" /></td>
                <td><form:hidden path="category.categoryId" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Edit Question"></td>
            </tr>
 
</table>
       </form:form>
</body>
</html>