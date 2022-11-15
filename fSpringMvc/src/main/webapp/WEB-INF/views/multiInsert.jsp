<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl -->
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>multiInsert.jsp</title>
</head>
<body>

<h3>멤버 리스트</h3>
<table border='2'>
	<tr>
		<th>이름</th><th>아이디</th><th>나이</th>
	</tr>
	<!-- for(변수지정 : 집합변수) -->
	<c:forEach var='vo' items='${memberVOList.list}'>
	<c:if test="${vo.state}">
	<tr>
		<td>${vo.name}</td>
		<td>${vo.id}</td>
		<td>${vo.age}</td>
	</tr>
	</c:if>
	</c:forEach>
</table>

</body>
</html>