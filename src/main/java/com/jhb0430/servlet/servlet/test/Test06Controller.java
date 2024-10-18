package com.jhb0430.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//	제이슨 형태가 그대로 들어가면 됨.
//	쌍따옴표 빠져있는데 들어가야함~!!! 
//	하나의 페이지에서 전달받은 값에 따라 결과 다르게 나오면 됨 
//	파라미터 직접 입력하라 할 수 없으니 링크 만들어주면 된다~~~ 


//	- Servlet - 연습 문제
//	Get Method 와 json
//	연산 결과 JSON
//	두 개의 숫자를 파라미터로 전달 받고, 사칙연산 결과를 예시대로 표현하는 dictionary 데이터를 json으로 만드세요.
//	입력 URL 예시
//	/servlet/test06?number1=1500&number2=70

//	출력 예시
//	addition : 135,
//	subtraction : 105,
//	multiplication:1800,
//	division : 8

//test06
//
//두 개의 숫자를 parameter로 넘기는 링크를 가진 html 문서를 만드세요.
//html 화면 예시
//연산 링크
//120, 15
//1500,70
//96,54

@WebServlet("/servlet/test06")
public class Test06Controller extends HttpServlet{

	@Override
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		String numberString1 = request.getParameter("number1");
		String numberString2 = request.getParameter("number2");
		
		int number1 = Integer.parseInt(numberString1);
		int number2 = Integer.parseInt(numberString2);
		
	int addition = number1 + number2;
	int subtraction = number1 - number2;
	int multiplication = number1 * number2;
	int division = number1 / number2;
	
	out.println("{\"addition\":" + addition 
				+ ",\"subtraction\":" + subtraction 
				+ ",\"multiplication\":" + multiplication 
				+ ",\"division\":" + division
				+"}");
	
//	out.println("{
//				\" addition \" : 여기서 끝나고 뒤에있는 \"는 문자열용이니까 정수에는 필요없군
//				");			:도 아직 "" 안에 있는거군 
	
	

	}
}
