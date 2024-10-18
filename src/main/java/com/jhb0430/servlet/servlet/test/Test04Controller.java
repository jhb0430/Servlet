package com.jhb0430.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//URL mapping (annotation) 2
//
//- Servlet
//연습 문제
//URL mapping (annotation) 2
//리스트 출력
//반복문을 이용해서 30개의 리스트를 아래와 같이 출력하세요.
//WebServlet 어노테이션을 이용해서 URL을 Mapping 하세요.
//HTML 페이지로 만드세요.
// ●번째 리스트... 반복문 



@WebServlet("/servlet/test04") // 빼먹지 말기...
public class Test04Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		// println은 꼭 한번만 써야하는건 아니다 !!! 여러번 써도 됨!!!!! 
		out.println(""
					+"<html>\n"	
					+"<head><title>리스트 출력</title><head>\n"	
					+"<body>\n"	
						+"<ul>\n");
		
					for (int i = 1; i <= 30; i++) {
						out.println("<li>"+ i +"번째 리스트 </li>");
					}
					
		out.println(""			
					+"</ul>\n"
					+"</body>\n"	
					+"<html>"	
			);
		
		// 심심하도다 
		
	}

}
