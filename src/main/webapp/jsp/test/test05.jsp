<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 연습 문제 - POST Method 2</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
<!-- 
	길이 변환
	cm 단위의 길이를 입력 받고, 인치, 야드, 피트 미터 단위로 변환하는 기능을 만드세요.
	길이를 입력 받는 input 과 원하는 단위를 선택할 수 있는 checkbox 들을 만드세요.
	Post Method를 통해서 submit 하세요.
	입력 화면
	
	전달 받은 길이를 선택된 단위 모두로 변환해서 출력하세요.
	 -->
	 <% 
 		int cm= Integer.parseInt(request.getParameter("cm"));
		 	// String type = request.getParameter("type");
		 	// String[] typeArray = request.getParameterValues("type");
	 	String[] units = request.getParameterValues("unit");
	 	
	 		// String type = "";
	 	
	 		//double result = 0;
		 	//인치, 야드, 피트 미터
		 	// 미터 = cm / 100 
		 	// 인치 = cm / 2.54
		 	// 야드 = cm / 91.44
		 	// 피트 = cm / 30.48			 선택되어서 계산된 항목만 출력.
		double inch = cm * 0.39;
		double yard = cm * 0.010936133;
		double feet = cm * 0.032808399;
		double meter = cm / 100.0; 
		
	
	 		// String cal="";
	 		
		String result = "";
	 	
	 	for(int i = 0; i < units.length; i++){
	 		String unit = units[i];
	 		
		 	if(unit.equals("meter")){
		 		result += meter + "m" + "<br>\n";
		 		// result += meter + "m<br>\n";
		 	}
		 	else if(unit.equals("inch")){
		 		result += inch + "in" + "<br>\n";
		 	}
		 	else if(unit.equals("yard")){
		 		result += yard + "yd" + "<br>\n";
		 	}
		 	else if(unit.equals("feet")){
		 		result += feet + "ft" + "<br>\n";
		 	}
	 		
	 	}
	 	
	 	
	 	/*
	 	for(int i = 0; i < typeArray.length; i++){
	 		
		 	if(type.equals("meter")){
		 		result = cm / 100;
		 		cal = "m";
		 		type = result + cal;
		 	}
		 	else if(type.equals("inch")){
		 		result = cm / 2.54;
		 		cal = "in";
		 	}
		 	else if(type.equals("yard")){
		 		result = cm / 91.44;
		 		cal = "yd";
		 	}
		 	else if(type.equals("feet")){
		 		result = cm / 30.48;
		 		cal = "ft";
		 	}
	 		
	 	}
	 	*/
	 
	 	// 이거 아님!!!!!!! 
	 	// 만약 미터를 선택함 -> 그럼 result + cal 로 배열에 저장시켜줘야함
	 	
	 %>		
	 
	 
	 <div class="container">
		 <h2>변환 결과</h2>
		 <div class= "display-4"><%= cm %>cm</div>
		 <hr>
		 <div class= "display-4">
		 <%= result %>  
		 </div>
	 </div>
	 
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>