<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>멤버리스트</h2>
<table border='2'>
<tr>
	<td>이름</td><td>나이</td><td>아이디</td>
</tr>
<c:forEach items='${memberVoList.list }' var='vo' >
<!-- for(변수 vo:List) -->
<c:if test="${vo.state}">
<tr>
	<td>${vo.name}</td><td>${vo.age}</td><td>${vo.id}</td>
</tr>
</c:if>
</c:forEach>
</table>

</body>
</html>