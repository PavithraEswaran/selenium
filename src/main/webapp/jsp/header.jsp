<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

      .topnav {
  overflow: hidden;
  background-color:#616A6B;
}
.top {
  overflow: hidden;
  background-color:#616A6B;
}
/* Style the links inside the navigation bar */
.topnav a {
  float: right;
  display: block;
  color:white;
  text-align: center;
  padding: 3px 15px;
  text-decoration: none;
  font-size: 21px;
}

.topnav h2 {
  float: left;
  display: block;
  color:white;
  text-align: center;
  padding: 3px 15px;
  text-decoration: none;
  font-size: 28px;
}

/* Change the color of links on hover */
.topnav a:hover {
  background-color:pink;
  color:black;
}

/* Style the "active" element to highlight the current page */
.topnav a.active {
  background-color: #2196F3;
  color: white;
}

a.active {
  background-color: #2196F3;
  color: white;
}
</style>
</head>

<body>

	<div class="topnav">
	
	<h2>Virtusa Vforum</h2>
	<a href="logout">Logout</a>
	<a href="viewAnswer">My Answers</a>
	<a href="viewQuestion">My Questions</a>
	<a href="viewProfile">View Profile</a>
	<a href="homePage">Home</a>
		
	</div>

</body>
</html>