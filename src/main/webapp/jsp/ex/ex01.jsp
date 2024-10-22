<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
	<%@ page import="java.util.ArrayList" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 시작</title>
</head>
<body>
	
	<h2>1. 기본 문법</h2>
	<!-- html 주석 -->
	<%-- jsp 주석--%>
	<%-- jsp 문법은 브라우저가 인식할 수 있는 html 코드가 아님. 처리하고 다 사라지는 코드. 그래서 jsp 주석은 html과 달리 페이지 소스 보기에 뜨지 않는다! --%>
	
	<%-- 1부터 10까지의 합을 h3 태그로 구성 --%>
	<%
		int sum = 0;
		for(int i = 1; i <=10; i++){
			sum+= i;
		}
		
	%>
	
	<h3> 합계 : <%= sum %> </h3>
	
	<input type= "text" value = "<%= sum %>">
	
	<div><%= sum * 2 %></div> <%-- 변수만 넣을 수 있는 게 아니라 식도 넣을 수 있다. --%>
	
	<h2>2. 리스트 다루기</h2>

	<%
		// 동물 이름 리스트
		List<String> animalList = new ArrayList<>();
		// 컨+쉽+o 안먹힘. 위에서 직접 적어줘야함!! 
		animalList.add("cat");
		animalList.add("dog");
	%>


	<ul>
	<li><%= animalList.get(0) %></li>
	<li><%= animalList.get(1) %></li>
	</ul>
		
	<h2> 3. 메소드 만들기 </h2>
	
	<%!
		// Hello world 문자열을 리턴하는 메소드
		public String getHelloWorld(){
			return "Hello World!!";
		}
	%>
	
	
	<h3> <%= getHelloWorld() %></h3>
	

</body>
</html>