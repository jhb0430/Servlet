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
<title>JSP 연습 문제 : 자바 제어문 사용하기 3</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>

<body>

<!-- 
책 목록
List에 Map 형태로 책 정보들이 들어있습니다. -->

	<% 
	    List<Map<String, Object>> list = new ArrayList<>();
	    Map<String, Object> map = new HashMap<String, Object>() {
	        { 
	            put("id", 1000);
	            put("title", "아몬드"); 
	            put("author", "손원평"); 
	            put("publisher", "창비");
	            put("image", "http://image.kyobobook.co.kr/images/book/xlarge/267/x9788936434267.jpg");
	        } 
	    };
	    list.add(map);
	
	    map = new HashMap<String, Object>() {
	        { 
	            put("id", 1001);
	            put("title", "사피엔스"); 
	            put("author", "유발 하라리"); 
	            put("publisher", "김영사");
	            put("image", "http://image.kyobobook.co.kr/images/book/xlarge/464/x9788934972464.jpg");
	        } 
	    };
	    list.add(map);
	
	    map = new HashMap<String, Object>() {
	        { 
	            put("id", 1002);
	            put("title", "코스모스"); 
	            put("author", "칼 세이건"); 
	            put("publisher", "사이언스북");
	            put("image", "http://image.kyobobook.co.kr/images/book/xlarge/892/x9788983711892.jpg");
	        } 
	    };
	    list.add(map);
	
	    map = new HashMap<String, Object>() {
	        { 
	            put("id", 1003);
	            put("title", "나미야 잡화점의 기적"); 
	            put("author", "히가시노 게이고"); 
	            put("publisher", "현대문학");
	            put("image", "http://image.kyobobook.co.kr/images/book/xlarge/194/x9788972756194.jpg");
	        } 
	    };
	    list.add(map);
	    
	    
	%>	
   
   
   
 <!--   
위와 같은 형태로 책목록 데이터가 있을떄 이를 이용해서 아래와 같은 책목록 페이지를 만드세요.

위 책목록에서 책제목을 선택했을때, -> 제목이 이동 버튼 <a>
아래와 같이 책의 자세한 정보를 표시하는 페이지로 이동하도록 만드세요.
책 세부 페이지에도 위에 있는 데이터를 포함해서 사용하세요.

상세 페이지를 여기서 만들어야함 .. . 클릭하면 넘어오는 곳 
 -->
	
	   
		
	   
 	<% 
 	 for(Map<String, Object> bookInfo : list){
	   String title =  request.getParameter("title");
	   if(title.equals(bookInfo.get("title"))){ %>
	   
	 	<div class="m-2">
	 		<div class="d-flex mt-1 ">
			 	 	<div id="jpg">
			 	 	<img src="<%= bookInfo.get("image")%>"> 
			 	 	</div>
		 	 	<div class="">
			 	 	<div class="display-1 text-primary" id="bookname"> <%= bookInfo.get("title") %></div>
			 	 	<div class="display-2 text-success" id="author"> <%= bookInfo.get("author") %></div>
			 	 	<div class="display-3 text-secondary" id="company"> <%= bookInfo.get("publisher") %></div>
		 	 	</div>
	 		</div>
	 	</div>
	 	<% 
	   }
	   }%>
 
 
 <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>