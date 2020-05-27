<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_param.jsp</title>
</head>
<body>

<h1>파라메터 실습</h1>
<a href="param.do?id=maria&age=22">요청 파라메터 2개</a>
<a href="param.do">요청 파라메터 0개</a>

<hr>
<h2>로그인</h2>
<form action="paramForm.do">
	ID: <input type="text" name="id"/><br>
	Pass: <input type="password" name="pass"/><br>
	<input type='submit' value ='로그인' />
</form>

</body>
</html>