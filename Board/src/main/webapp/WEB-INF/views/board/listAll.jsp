<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<%@include file="../include/header.jsp" %>
	
	<h1> 게시물 목록 </h1>
	<c:forEach items="${list}" var="boardVO" >
		<tr>
			<td>${boardVO.bno}</td>
			<td>
				<a href='/board/read?bno=${bonVO.bno}'> ${boardVO.title} </a>
			</td>
			<td>${boardVO.content}</td>
			<td>${boardVO.writer}</td>
			<td>
				<fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.regdate}"/>
			</td>
			<td>${boardVO.viewcnt}</td>
		</tr>
	</c:forEach>
	
	<%@include file="../include/footer.jsp" %>
</body>
</html>
