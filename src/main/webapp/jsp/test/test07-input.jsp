<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 제어문 사용하기 2</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<!-- 
배탈의 민족 검색
가맹점 리스트를 기반으로, 메뉴 명을 입력 받고 해당하는 가게 리스트를 보여주는 기능을 만드세요.
input 을 통해서 검색할 메뉴를 입력 받고, 별점 4점이하인 곳을 제외할지 여부를 선택할 수 있는 checkbox 를 만드세요.
 -->
 	<div class="container">
 		<h1>메뉴검색</h1>
 		<form method="post" action="/jsp/test/test07.jsp">
 		<div class="d-flex">
	 		<input type="text" class="form-control col-3" name = "menu">
	 		<div class="col-2">
	 			<label><input type="checkbox" name="pointFilter"> 4점 이하 제외</label>
	 		</div>
 		</div>
 		<button type="submit" class="btn btn-success mt-2">검색</button>
 		</form>
 	</div>
 
 
 
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>