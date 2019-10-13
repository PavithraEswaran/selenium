<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
body, html {
  height: 100%;
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-image {
  /* The image used */
  background-image: url("https://previews.123rf.com/images/amasterpics123/amasterpics1231306/amasterpics123130600010/20197217-question-mark-on-white-background.jpg");
  
   filter: blur(5px);
  -webkit-filter: blur(5px);
  /* Full height */
  height: 100%; 
  
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
.bg-text {
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
  color: white;
  font-weight: bold;
  border: 3px solid #f1f1f1;
  position: absolute;
  
  top: 35%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
  width: 30%;
  padding: 20px;
  text-align: center;
}

#register-box {
    width: 500px;
    padding: 20px;
    margin: 100px auto;
    -webkit-border-radius: 2px;
    -moz-border-radius: 2px;
    border: 1px solid #000;
}
.error{
  color:red;
}
</style>
</head>
<body>
 <div class="bg-image"></div>

<div align="center" id="register-box" class="bg-text">
    
        <h1>Registration Form</h1>
         
        <h3>${message}</h3> 
         
        <form:form action="saveEmployee" method="post" modelAttribute="employee">
        <table>
            
            <tr>
                <td>EmployeeId:</td>
                <td><form:input path="employeeId" /></td>
                <td align="right"><form:errors path="employeeName" cssClass="error"/>  </td>
            </tr>
            <tr>
                <td>EmployeeName:</td>
                <td><form:input path="employeeName" /></td>
                <td align="right"><form:errors path="employeeName" cssClass="error"/>  </td>
            </tr>
            <tr>
                <td>EmployeeDesignation:</td>
                <td><form:input path="employeeDesignation" /></td>
                <td align="right"><form:errors path="employeeDesignation" cssClass="error"/>  </td>
            </tr>
            <tr>
                <td>EmployeeLocation:</td>
                <td><form:input path="employeeLocation" /></td>
                <td align="right"><form:errors path="employeeLocation" cssClass="error"/>  </td>
            </tr>
            <tr>
                <td>Username:</td>
                <td><form:input path="username" /></td>
                <td align="right"><form:errors path="username" cssClass="error"/>  </td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><form:input type="password" path="password" /></td>
                <td align="right"><form:errors path="password" cssClass="error"/>  </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Submit"></td>
            </tr>
        </table>
        </form:form>
    </div>
</body>
</html>