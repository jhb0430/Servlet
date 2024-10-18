package com.jhb0430.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex02") // 오타 확인 잘하기....!!!! 
public class Ex02Controller extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
	
		PrintWriter out = response.getWriter();
		
		// 1~ 10 까지의 합을 구하고 이를 html을 통해서 결과를 표현한다 
		int sum = 0;
		for (int i = 1; i <11; i++) {
			sum+= i;
		}
								// 자동완성 아니라 문자열이기때문에 잘 적어줘야한다.
		out.println(""
					+"<html>\n"
					+"<head><title>합계</title><head>\n"
					+"<body>\n"
						+ "<h2>" + sum + "</h2>\n"
					+"</body>\n"	
					+"</html>"
				
				
				);
		
	}
}
