<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 추가</title>
</head>
<body>

<form method="get" action="/db/user/create">
	<label>이름 : </label><input type="text" name="name"><br>
	<label>생년월일 : </label><input type="text" name="birthday"><br>
	<label>이메일 : </label><input type="text" name="email"><br>
	<button type="submit">입력</button>
</form>
</body>
</html>


<!-- list.jsp 
UserController			 별개임 다 이어져있다고 생각하지말기
 input.jsp는 
 
 각각 
	request
	response 따로 받고 있는 거임. 
	
	사용자의 편의성을 위해서 form으로 받아서 처리해줄 뿐 
 



	

 -->