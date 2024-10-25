<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List" %>    
<%@ page import = "java.util.ArrayList" %>    
<%@ page import = "java.util.HashMap" %>    
<%@ page import = "java.util.Map" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 연습 문제 - 자바 제어문 사용하기 2</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
 <!-- 
	 데이터 형태
	
	[
	    {name="버거킹", "menu"="햄버거", "point":4.3},
	    {name="도미노피자", "menu"="피자", "point":4.5},
	    ...
	]
	
	코드 복사하기
  -->
<% 
		List<Map<String, Object>> list = new ArrayList<>();

	    Map<String, Object> map = new HashMap<String, Object>() {{ put("name", "버거킹"); put("menu", "햄버거"); put("point", 4.3); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "BBQ"); put("menu", "치킨"); put("point", 3.8); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "교촌치킨"); put("menu", "치킨"); put("point", 4.1); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "도미노피자"); put("menu", "피자"); put("point", 4.5); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "맥도날드"); put("menu", "햄버거"); put("point", 3.8); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "BHC"); put("menu", "치킨"); put("point", 4.2); } };
	    list.add(map);
	    map = new HashMap<String, Object>() {{ put("name", "반올림피자"); put("menu", "피자"); put("point", 4.3); } };
	    list.add(map);
	    // 이름 메뉴 포인트
	%>
	
  <% 
  String menu = request.getParameter("menu");
  String pointFilter = request.getParameter("pointFilter");
	// String search = request.getParameter("search");
	 //String check = request.getParameter("check");
	 
	 // 걍 받는게 아니란 소리겠쥐... 
	 
		 
  %>
  <!--  
	 if(check.equals("check")){ // 
  <h1>체크</h1>
  
  
	<h2>확인용</h2>
  -->
		
	<!-- 
	<table>
	<%
		for(Map<String,Object> review : list){ %>
		<tr>
		 			<td><%= review.get("name") %></td>
		 			<td><%= review.get("menu") %></td>
		 			<td><%= review.get("point") %></td>
		 		</tr>
	<% }%>
	</table>
	 -->
	
	<!--  
	검색창에 메뉴명 받으면 메뉴리스트 
	별점4점 이하면 4점 이상만 보여주기.... 
	
	 -->
	
	<div class="container">
		<h2 class="text-center">검색 결과</h2>
		 <table class="table text-center">
		 	<thead>
		 	<tr>
		 		<th>메뉴</th>
		 		<th>상호</th>
		 		<th>별점</th>
		 	</tr>
		 	</thead>
		 	<tbody>
 		<%
			for(Map<String,Object> info : list){ 
				
			
				//if(menu.equals(info.get("menu")) && pointFilter == null ){
				if(menu.equals(info.get("menu")) ){
				%>
				<!-- 
			 		<tr>
			 			<td><%= info.get("name") %></td>
			 			<td><%= info.get("menu") %></td>
			 			<td><%= info.get("point") %></td>
			 		</tr>
			 		}
				 -->
				 
 				<%
						// pointFilter가 null이면
						// pointFilter가 null이 아니면, poin가 4 초과인 결과만
 				 if(pointFilter == null || (pointFilter != null && (double)info.get("point") > 4.0)){ // 체크박스 체크되면 
 				 // if(pointFilter != null && (double)info.get("point") > 4.0){ // 체크박스 체크되면 
 				
 				// ↑처럼 해되 되지만 업캐스팅된걸 다운캐스팅 해서 쓰는게 좋다
 				// Double point = (Double)info.get("info");
 					 %>
 				 	
 				 		
		 		<tr>
			 			<td><%= info.get("name") %></td>
			 			<td><%= info.get("menu") %></td>
			 			<td><%= info.get("point") %></td>
			 		</tr>
		 		<% } %>	
		 <% }%>
		 
		 <% }%>	
		 
		 	</tbody>
		 </table>
	</div>
	
	
	
 <!-- 
전달 받은 메뉴명에 맞는 가맹점의 리스트를 아래와 같이 보여주세요

4점이하 제외 checkbox가 설정된경우 별점 4점이하의 가맹점은 제외하고 보여주세요.
  -->   
	
	

</body>
</html>