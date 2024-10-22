<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>    
<%@ page import="java.text.SimpleDateFormat" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 연습 문제 -Get Method - 링크</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<!--  
날짜 시간 출력
현재 시간이나 현재 날짜를 확인 할 수있는 기능을 만드세요.


같은 jsp 파일로 연결 이건  먼소리지
parameter를 통해서 구분 하도록 구성
연결된 jsp 페이지에서 현재 시간 또는 현재 날짜를 출력하세요.
-->
</head>
<body>
 <%
 	Date now = new Date();
 SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
 String todayDate = formatter.format(now);
 /*
 SimpleDateFormat formatter2 = new SimpleDateFormat("HH시 mm분 ss초");
 String howTime = formatter2.format(now);
 */
 
 //String today = request.getParameter("today");
 //String time = request.getParameter("time");
 
 %>
 
 <%-- 현재 날짜 확인을 누르면 얘 ... 얘로 링크되게 하란거잖아..? 아닌감 
	<ul>
 		<li>현재 시간</li>
 	</ul>
 <div>현재 시간<%=howTime %></div>
 --%>
 
 
 <%-- 현재 시간 확인을 누르면 얘 --%>
 <div class="m-2">
	 <ul>
	 <li>현재 날짜</li>
	 </ul>
	 <div class="container display-3">
		 오늘 날짜 
		 <%=todayDate %>
	 </div>
 </div>
 
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>