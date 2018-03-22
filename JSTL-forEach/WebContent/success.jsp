<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="st" items="${data}">
			<tr>
				<td>${st.id}</td>
				<td>${st.name}</td>
				<td>${st.email}</td>
				<td>${st.adrs}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>