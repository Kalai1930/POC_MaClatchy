<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.MemCache.Pojo.Student" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>StudentProfile</title>
</head>
<body>
<div>
<form >
<h3 align="center">Student Profile</h3>
<% Student stu =(Student) request.getAttribute("student"); %>
<table>

<tr>
<td><label>First Name</label></td><td><input type="text" name="firstName" value="<%=stu.getFirstName()%>" disabled="true"/></td>
</tr>
<tr>
<td><label>Last Name</label></td><td><input type="text" name="lastName" value="<%=stu.getLastName() %>" disabled="true"/></td>
</tr>
<%-- <tr>
<td><label>Date of Birth</label></td><td><input type="text" name="dob" title="dd-mm-yyy" value=<%=stu.getDob()%>/></td>
</tr> --%>
<tr>
<td><label>Gender</label></td><td>
<select name="gender" value="<%=stu.getGender() %>" disabled="true">
<option value="F">Female</option>
<option value="M">Male</option>
<option value="O">Others</option>
</select>
</td>
</tr>
<!-- <tr>
<td><label>First Name</label></td><td><input type="text" name="firstName"></td>
</tr>
<tr>
<td><label>First Name</label></td><td><input type="text" name="firstName"></td>
</tr>
<tr>
<td><label>First Name</label></td><td><input type="text" name="firstName"></td>
</tr>
<tr>
<td><label>First Name</label></td><td><input type="text" name="firstName"></td>
</tr><tr>
<td><label>First Name</label></td><td><input type="text" name="firstName"></td>
</tr>
<tr>
<td><label>First Name</label></td><td><input type="text" name="firstName"></td>
</tr> -->

</table>
</form>
</div>
</body>
</html>