<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello Mr.${param["username"]}. Hope you fine.<br/>
Contact: ${param["contact"]}<br/>
Email: ${initParam["email"]}<br/>
List contains:<br/>
	${names[0]}<br/>
	${names[1]}<br/>
	${names[2]}
	
</body>
</html>