package com.jhb0430.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet - 연습 문제
//Post Method 1
//입사 지원
//이름과 자기소개서 내용을 전달 받고, 입사 지원 결과를 보여주는 페이지를 만드세요.
//파라미터에 맞춰서 method를 선택하세요.

//출력 예시

//입사지원 내용을 입력 받고, 입사 결과 페이지로 전달하는 페이지를 만드세요.
//HTML 화면 예시

@WebServlet("/servlet/test09")
public class Test09Controller extends HttpServlet{
	@Override
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
//		request.setCharacterEncoding();
//		response.setCharacterEncoding();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name"); //이름
		String introduce = request.getParameter("introduce");
		
		
		
		out.println(""
				+"<html>\n"
				+"	<head><title>입사 지원서</title><head>\n"
				+"	<body>\n"
				+"		<h3>" 
				+ name + "님 지원이 완료 되었습니다."
				+"		</h3>\n"
				+"		<hr>\n"
				+"		<div>\n"
				+"			<b>지원 내용</b>\n"
				+"		</div>\n"
				+"		<div>\n"
				+ 			introduce
				+"		</div>\n"
				
				
				+"	</body>\n"
				+"</html>\n"
				);
		
				
		
	}
	
	
	
	
}
