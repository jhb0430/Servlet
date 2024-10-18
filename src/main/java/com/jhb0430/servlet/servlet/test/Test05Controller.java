package com.jhb0430.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//	Servlet - 연습 문제
//	Get Method 와 HTML

//	구구단 링크
//	파라미터를 통해서 원하는 단수의 구구단을 보여주는 페이지를 만드세요.

//리스트 통해서 반복문으로 출력하면 됨 . 정해진 단수가 응답으로 오는 게 아니라 파라미터로 전달한 단수가 출력되도록! 

//	link URL 예시
//	/servlet/test05?number=5
//	링크 클릭 후 화면

//	특정 단수의 구구단 페이지로 이동하는 링크를 포함하는 html 페이지를 만드세요.
//	HTML 화면 예시
//5,7,9단의 링크 만들어서 누르면 5,7,9... 하나의 파라미터로 전달하도록... 듀? ???


@WebServlet("/servlet/test05")
public class Test05Controller extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
//		out.println("테스트");
		
		String multinum = request.getParameter("number"); // 파라미터는 정수도 String으로 받고 인티저해줘야하나보넹..
		int number = Integer.parseInt(multinum);
		
//		<구구단 반복문>
		int multiple = 0;
//		int number = 0;
//		for (int i = 1; i <= 9; i++) {
//			multiple = number * i;
//			out.println("<li>"+ number + " X " + i  +" = " + multiple + "</li>");
//		}													 (number * i)
		
		
		out.println(""
				+"<html>\n"
				+"		<head><title>Get Method 와 HTML - 구구단</title><head>\n"
				+"		<body>\n"
				+"			<ul>");
		
				for (int i = 1; i <= 9; i++) {
					multiple = number * i;
					out.println("<li>"+ number + " X " + i  +" = " + multiple + "</li>");
				}
				
				out.println(""
				+"			</ul>"			
				+"		</body>\n"
				+"<html>\n"
				);
		
		
		
	}
	 
	
}
