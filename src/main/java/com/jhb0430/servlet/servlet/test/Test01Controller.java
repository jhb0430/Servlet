package com.jhb0430.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	Servlet 연습 문제
//	URL mapping (web.xml) 1


public class Test01Controller extends HttpServlet {
//	오늘 날짜 출력
//	오늘 날짜를 아래와 같이 출력하세요.
//	web.xml URL Mapping 후 servlet을 이용해서 출력하세요.
//	Content Type은 text/plain으로 설정하세요.
//	출력 예시
//
//	오늘의 날짜는 2021년 5월 20일
	
	// Response Header
	// character encoding
	// character set
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");	
		
		// 데이터 타입 MIME 
		response.setContentType("text/plain");
		
		// Response Body
		PrintWriter out = response.getWriter();
					// 변수의 이름은 out으로 써주는게 좋다~ 
		
		out.println("Servlet Test01- URL mapping"); // 출력 확인 겸 제목으로 계속 써주깅
		
		Date now = new Date();
		
		// ? 
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		// 문자열로 만들어서 리턴해준다 
		String dateTimeString = formatter.format(now);
				// 변수 이름은 바꿔도 머... 
		out.println("오늘의 날짜는 " + dateTimeString);
		
		
	}
}
