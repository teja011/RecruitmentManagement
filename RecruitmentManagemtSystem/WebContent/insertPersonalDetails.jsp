<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Insert Candidate Details:</h1>
<table>
<sf:form action="insertcandidate.obj" modelAttribute="CandidateBean">
<tr><td>Candidate Id:</td> <td><sf:input path ="canid"></sf:input> </td></tr>
<tr><td>Candidate Name:</td><td> <sf:input path ="canname"></sf:input></td></tr>
<tr><td>Address: </td><td><sf:input path ="canaddress"></sf:input> </td></tr>
<tr><td>Date of Birth:</td><td> <sf:input path ="candob"></sf:input> </td></tr>
<tr><td>Email Id:</td><td> <sf:input path ="canmail"></sf:input> </td></tr>
<tr><td>Contact No.: </td><td><sf:input path ="cancontact"></sf:input> </td></tr>
<tr><td>Marital Status: </td><td><sf:radiobutton path="marstat" value="Single" ></sf:radiobutton>Single
<tr><sf:radiobutton  path="marstat" value="Married"></sf:radiobutton>Married </td></tr>
<tr><td>Gender:</td><td> <sf:radiobutton path="gender" value="Male" ></sf:radiobutton>Male
<sf:radiobutton  path="gender" value="Female"></sf:radiobutton>Female</td></tr>
<tr><td>Passport No.:</td><td> <sf:input path ="canpass"></sf:input></td></tr>
<tr><td><input type="submit" value ="submit">
 <td><input type="reset" value ="reset"></td></tr>
</table>
</sf:form>

</body>
</html>