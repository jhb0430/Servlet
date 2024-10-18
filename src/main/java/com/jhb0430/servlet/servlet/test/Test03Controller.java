package com.jhb0430.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet 연습 문제
//URL mapping (annontation) 1
//뉴스 기사 출력
//기사 문구를 브라우저에 출력하세요.
//WebServlet 어노테이션을 이용해서 URL을 Mapping 하세요.
//출력 예시
//[단독] 고양이가 야옹해
//기사 입력시간 : date
//-
//끝

@WebServlet("/servlet/test03")
public class Test03Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateTimeString = formatter.format(now);
		
		
		out.println(""
					+"<html>\n"
					+"<head><title> 뉴스 기사 출력 </title></head>\n"
					+"<body>\n"
						+"<h2>[단독] 지현 html 다 까먹어</h2>\n"
//						+"기사 입력 시간 : " + dateTimeString + "<br>"
						+"<div>기사 입력 시간 : " + dateTimeString + "</div>"
						+"<hr>\n"
						+"<h5>진짜 큰일났네...</h5>"
					+"</body>\n"
					+"</html>"
					
				
				);
		
	}
}
