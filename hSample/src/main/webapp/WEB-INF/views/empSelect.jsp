<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empSelect</title>
</head>
<body>

<h2>사원정보 목록보기</h2>


<table border="2">
	<tr>
		<td>사원번호</td>
		<td>사원이름</td>
		<td>직책</td>
		<td>상사번호</td>
		<td>입사날짜</td>
		<td>급여</td>
		<td>보너스</td>
		<td>부서번호</td>
	</tr>
	<c:forEach items="${result}" var="empVO">
	<tr>
		<td>${empVO.empno}</td>
		<td>${empVO.ename}</td>
		<td>${empVO.job}</td>
		<td>${empVO.mgr}</td>
		<td>${empVO.hiredate}</td>
		<td>${empVO.sal}</td>
		<td>${empVO.comm}</td>
		<td>${empVO.deptno}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>