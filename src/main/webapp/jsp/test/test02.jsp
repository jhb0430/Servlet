<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>JSP 연습 문제 - Get Method - form 태그</title>
<!-- Get Method - form 태그
 
BMI 수치
키와 몸무게를 입력 받아서 BMI 수치를 계산하고 비만도를 표시하는 기능을 만드세요.
키와 몸무게를 input으로 입력 받고 전달하는 form을 만들고 Get method 로 submit 하세요. -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>

	
	<%--
	public double bmiResult(double weight,double height){
		
	weight = 0;
	height = 0;
	return weight / ((height / 100.0) * (height / 100.0));
	}
	--%>
	<% 
	String weightString = request.getParameter("weight");
	String heightString = request.getParameter("height");
	double weight = Integer.parseInt(weightString);
	double height = Integer.parseInt(heightString);
	 
	double bmi= weight / ((height / 100.0) * (height / 100.0));
	
	String answer;
	
	if(bmi < 18.5){
		answer = "저체중";
	}
	else if(bmi < 25){
		answer = "정상";
	}
	else if(bmi < 30){
		answer = "과체중";
	}
	else{
		answer = "비만";
	}
	// 잠만... 
	
	%>
	
	<!--  계산 누르면  이 페이지로-->
	<div>
		<h1>BMI 측정 결과</h1>
			<div class="d-flex">
				<div>
				당신은 
				</div>
				<div class="text-info"><%= answer %></div>
				<div>
				입니다
				</div>
			</div>
			
		<h3>BMI 수치 : <%= bmi %></h3> 
	</div>
	
	<!-- 
	<h3><%= weight %></h3>
	<h3><%= height %></h3>
	 -->
	
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
	
</body>
</html>