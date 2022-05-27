<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<%@include file="include/header.jsp" %>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<%@include file="include/footer.jsp" %>
</body>
</html>

<!--
# DB DATA INSERT
insert into tbl_board(title, content, writer)
select title, content, writer from tbl_board;

# DB DATA COUNT
select count(*) from tbl_board;

# DB limit keyword
select * from tbl_board where bno > 0 order by bno desc limit 0, 5;
-->