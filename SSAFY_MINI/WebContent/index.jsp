<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 / 로그인</title>
</head>
<body>

	<h3>회원가입</h3>
	<hr>
	<form method="post" action="main">
		<input type="hidden" name="act" value="regist">
		아이디 : <input type="text" name="id"> <br>
		비밀번호 : <input type="password" name="password">
		<input type="submit">
	</form>
	<hr>
	<h3>로그인</h3>
	<hr>
	<form method="post" action="main">
		<input type="hidden" name="act" value="login">
		아이디 : <input type="text" name="id"> <br>
		비밀번호 : <input type="password" name="password">
		<input type="submit">
	</form>
	
	<h5>암호 : ${password}</h5>

</body>
</html>