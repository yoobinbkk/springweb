<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empDept</title>
</head>
<body>

<h2>목록보기</h2>


<table border="2">
	<tr>
		<td>사원번호</td>
		<td>사원이름</td>
		<td>부서</td>
	</tr>
	<c:forEach var="HashMap" items="${result}">
	<tr>
		<td>${HashMap.EMPNO}</td>
		<td>${HashMap.ENAME}</td>
		<td>${HashMap.DNAME}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>