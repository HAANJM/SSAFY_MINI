<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY MINI</title>
</head>
<body>

	<h3>회원가입</h3>
	<hr>
	<form method="post" action="main">
		<input type="hidden" name="act" value="regist"> 
		아이디 : <input type="text" name="id"> <br> 
		비밀번호 : <input type="password" name="password"> <br>
		이름 : <input type="text" name="name"> <br> 
		닉네임 : <input type="text" name="nickName"> <br> 
		전화번호 : <input type="text" name="phone"> <br> 
		이메일 : <input type="text" name="email"> <br> 
		<input type="submit">
	</form>

</body>
</html>