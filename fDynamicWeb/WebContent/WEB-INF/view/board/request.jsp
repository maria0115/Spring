<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request.jsp</title>
</head>
<body>


회원가입 정보
<hr>
아이디 ${param.id}
이름 ${param.name}
나이 ${param.age}

<hr>
아이디 ${memberVo.id}
이름 ${memberVo.name}
나이 ${memberVo.age}

</body>
</html>