<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import ="java.util.List" %>
 <%@ page import ="java.util.Map" %>
 <%@ page import ="java.util.ArrayList" %>
 <%@ page import ="java.util.HashMap" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 종합문제 1</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<link rel = "stylesheet" href="test09-style.css">
</head>
<body>
	<% 
	 List<Map<String, String>> list = new ArrayList<>();
	 Map<String, String> map = new HashMap<String, String>() {{ put("ch", "5"); put("name", "SBS"); put("category", "지상파"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "7"); put("name", "KBS2"); put("category", "지상파"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "9"); put("name", "KBS1"); put("category", "지상파"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "11"); put("name", "MBC"); put("category", "지상파"); } };
	 list.add(map);
	
	 map = new HashMap<String, String>() {{ put("ch", "54"); put("name", "OCN"); put("category", "영화"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "56"); put("name", "Screen"); put("category", "영화"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "57"); put("name", "Mplex"); put("category", "영화"); } };
	 list.add(map);
	
	 map = new HashMap<String, String>() {{ put("ch", "30"); put("name", "KBS 드라마"); put("category", "드라마"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "32"); put("name", "MBC 드라마"); put("category", "드라마"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "34"); put("name", "Olive"); put("category", "드라마"); } };
	 list.add(map);
	
	 map = new HashMap<String, String>() {{ put("ch", "3"); put("name", "tvN"); put("category", "예능"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "28"); put("name", "MBC Every1"); put("category", "예능"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "48"); put("name", "JTBC2"); put("category", "예능"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "49"); put("name", "E채널"); put("category", "예능"); } };
	 list.add(map);
	
	 map = new HashMap<String, String>() {{ put("ch", "120"); put("name", "SPOTV"); put("category", "스포츠"); } };
	 list.add(map);
	 map = new HashMap<String, String>() {{ put("ch", "121"); put("name", "KBSN 스포츠"); put("category", "스포츠"); } };
	 list.add(map);
	 
	 String channelC = request.getParameter("channelC");
	 
	%>
 
 	<div id="layout">
 		<header class="text-center justify-content-center align-items-center text-danger mt-3">
 			<h1>SK broadband IPTV</h1>
 		</header>
 		 <form method="post" action="jsp/test/test09.jsp">
 		<nav id="menu" class="bg-danger">
 			<ul class="nav nav-fill">
 				<li class="nav-item"><a class="nav-link text-white" href="/jsp/test/test09.jsp">전체</a></li>
 				<li class="nav-item"><a class="nav-link text-white" href="/jsp/test/test09.jsp?channelC=지상파">지상파</a></li>
 				<li class="nav-item"><a class="nav-link text-white" href="/jsp/test/test09.jsp?channelC=드라마">드라마</a></li>
 				<li class="nav-item"><a class="nav-link text-white" href="/jsp/test/test09.jsp?channelC=예능">예능</a></li>
 				<li class="nav-item"><a class="nav-link text-white" href="/jsp/test/test09.jsp?channelC=영화">영화</a></li>
 				<li class="nav-item"><a class="nav-link text-white" href="/jsp/test/test09.jsp?channelC=스포츠">스포츠</a></li>
 			</ul>
 		</nav>
 		<section class="mt-2">
 			<table class="table text-center">
 				<thead>
 					<tr>
 						<th>채널</th>
 						<th>채널명</th>
 						<th>카테고리</th>
 					</tr>
 				</thead>
 				<tbody>
 		<%--
 			for(Map<String, String> channel : list ){
 			//카테고리 값이 null이면
 			// 카테고리 값이 있으면 부합하는 채널 정보 보여주기
 			
 			if(category != null && category.get("category)  || category == null){
 			
 											↓
 			
 			if(category == null || category.equals(chaneel.get("category) ){
 			
 			if(channel.get("category").equals("category || category) ){ 도 되긴 하지만 ↑ 가 best
 		
 		 --%>		
 				
 				
 				
		<% 
			
			for(Map<String, String> channel : list ){
				
					if(channelC != null && channelC.equals(channel.get("category"))|| channelC == null){
					// 1.파라미터가 카테고리랑 일치하면  ↑
					// 		2. 파라미터에 아무것도 안적혀 있으면  
					// channelC == null  이면 -> 비어있어도 for 돌려달라... 
		%>
		<!--   -->
 					<tr>
 						<td><%= channel.get("ch") %></td>
 						<td><%= channel.get("name") %></td>
 						<td><%= channel.get("category") %></td>
 					</tr>
				
		<%			}	
					// else if(channelC.equals("전체")){ 	// 파라미터가 비어있는 상황에서 (.jsp 뒤에 없으면)  %>
					
			<% } %>
					
	
		<% 		
		%>
 				</tbody>
 			</table>
 		</section>
	</form>
 		<footer class="text-center mt-3">
 			<div>Copyright 2021. marondal All Rights Reserved.</div>
 		</footer>
 	
 	</div>
 	
 	
 	
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>