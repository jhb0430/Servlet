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


같은 jsp 파일로 연결 -> 이건  먼소리지
parameter를 통해서 구분 하도록 구성
연결된 jsp 페이지에서 현재 시간 또는 현재 날짜를 출력하세요.
-->
</head>
<body>
	 <%
	 	Date date = new Date();
	 	SimpleDateFormat dateFormatter = new SimpleDateFormat("오늘 날짜 yyyy년 MM월 dd일");
	 	SimpleDateFormat timeFormatter = new SimpleDateFormat("현재 시간은HH시 mm분 ss초");
	 	
	 	String dateString = dateFormatter.format(date);
	 	String timeString = timeFormatter.format(date);
	 
	 	// 사용자가 뭘 보고싶은지를 전달 받아야함! 
	 	// 어떤 정보를 보여줄지! 파라미터를 통해 전달 받는다 
	 	// 이미 주어진 정보 이외에, 어떤 정보를 보여줄지를 전달 받아야한다 
	 	// (시간을 보여줄지, 날짜를 보여줄지)
	 	// 니가 시간 보여달라하면 시간보여주고 날짜 보여달라하면 날짜 보여줄게 ㅇㅇ
	 	// what: time - 시간, date - 날짜
	 	
	 	String what = request.getParameter("what");
	 	
	 	String result = null;
	 	String Howtype = null;
	 	if(what.equals("time")){
	 		result = timeString;
	 		Howtype = "시간";
	 	} else if(what.equals("date")){
	 		result = dateString;
	 		Howtype = "날짜";
	 		
	 	}
	 	//ㅁㅊ... 해설 들으니까 왤케 간단해.... ㅠ.ㅠ.ㅠ.. .
	 %>
 
 
	<div class="m-2">
		<ul>
			<li>현재 <%= Howtype %></li>
		</ul>
		<div class="container">
			<div class="container display-3"><%= result %></div>
		</div>
	</div>
	
 
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>