<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request</title>
</head>
<body>

request.do 결과 <br/>
ID : ${param.id} <br/>
name : ${param.name} <br/>
age : ${param.age} <br/>

<hr/>

ID : ${memberVO.id} <br/>
name : ${memberVO.name} <br/>
age : ${memberVO.age} <br/>

<hr/>

ID : ${vo.id} <br/>
name : ${vo.name} <br/>
age : ${vo.age} <br/>

<hr/>


</body>
</html>