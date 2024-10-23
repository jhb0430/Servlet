<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 연습 문제 -자바 제어문 사용하기 1</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<!-- 
장보기 목록
아래에 주어진 리스트 객체를 통해서 아래 결과 화면과 같은 장보기 목록 테이블을 만드세요.
 -->
	 <% 
		List<String> goodsList = Arrays.asList(new String[]{ 
		    "저지방 우유", "요플레 4개", "딸기 1팩", "삼겹살 300g", "생수 6개", "주방 세제"
		});
	 
	 %>
	 
	 <div class="container">
		<h1 class="text-center">장 목록</h1>
		<table class="table table-sm text-center mt-3">
			<thead class="font-weight-bold">
				<tr>
					<th>번호</th>
					<th>품목</th>
				</tr>
			</thead>
			<tbody>
			<% int number = 0; 
			for(String goods : goodsList){ 
				number++;
			%>
				<tr>
					<td><%= number %></td>
					<td><%= goods %></td>
				</tr>
			<%  } %>
			</tbody>
		</table>
	 </div>
	
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>	
</body>
</html>