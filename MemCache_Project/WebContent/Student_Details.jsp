<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FetchStudentDetails</title>
</head>
<body>
<div>
<form action="getStuDetails" method="get">
<h3 align="center">Enter Student details</h3>
<table>
<tr>
<td><label>First Name</label></td><td><input type="text" name="firstName"/></td>
</tr>
<tr>
<td><label>Last Name</label></td><td><input type="text" name="lastName"/></td>
</tr>
<tr>
<td><label>Date of Birth</label></td><td><input type="text" name="dob" title="dd-mm-yyy"/></td>
</tr>
<tr>
<td><label>Gender</label></td><td>
<select name="gender" >
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
<tr>
<td><input type="submit" value="Add"/></td></tr>
</table>
</form>
</div>
<div>
<form action="disStuDetails" method="get">
<h3 align="center">Student Profile</h3>
<table>
<tr>
<td><label>First Name</label></td><td><input type="text" name="firstName" /></td>
</tr>
<tr>
<td><input type="submit" value="Show"/></td></tr>
</table>
</form>
</div>
</body>
</html>