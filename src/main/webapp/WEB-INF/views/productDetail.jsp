<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>
	Product Detail
</h1>
${productVO.name }
${productVO.price }

<%
	int i = 1;
	int j = 2;
	int sum = i + j;
	out.print(sum);
%>

</body>
</html>