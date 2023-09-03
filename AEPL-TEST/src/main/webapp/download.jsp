<%@page import="aepltest.dto.UserDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="">
<tr>
<th>name</th>
<th>dob</th>
<th>email</th>
<th>file</th>
<th>location</th>
<th>mobile number</th>
</tr>
<%List<UserDto> list=(List<UserDto>)request.getAttribute("objects");%>
<%for(UserDto uv:list){%>
<tr>
<td><%=uv.getName()%></td>
<td><%=uv.getDate()%></td>
<td><%=uv.getEmail()%></td>
<td><%=uv.getFile()%></td>
<td><%=uv.getLocation()%></td>
<td><%=uv.getMobileNum()%></td>
</tr>
<%}%>
</table>
</body>
</html>