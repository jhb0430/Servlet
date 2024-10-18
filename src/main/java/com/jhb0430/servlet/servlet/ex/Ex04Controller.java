package com.jhb0430.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  정해진 규격대로 링크 타고 가는 게 아니라 직접 입력한 값을 파라미터로 받아서 쓰고싶다~
 *  input태그에 입력된 값으로 결과를 보여주는 방법!
 *  
 *  FORM
 *  
 *  <input type="text">
 *  <button type="bytton></button>
 *  
 *  <form method="get" action="/hello">
 *  	<input type="text" name="keyword"> -- name이라는 속성에는 파라미터 이름.(name,number1... etc)
 *  	<input type="submit" value="검색">	-- 검색이라는 버튼을 누르면 input태그에 적힌 값을 주소에 매칭해준다
 *  </form>	
 *  
 *  
 */
@WebServlet("/servlet/ex04")
public class Ex04Controller extends HttpServlet{

	@Override
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일을 전달 받고,
		// 이름과 나이를 html로 구성
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		
		String yearString = birthday.substring(0,4);
		int year = Integer.parseInt(yearString); 
		
		int age = 2024 - year + 1;
	
		
		out.println(""
				+"<html>\n"
				+"	<head><title>정보</title><head>\n"
				+"	<body>\n"
				);
		out.println("	<h3>이름 : " + name + "</h3> <h3>나이 : " + age + "</h3>");
		out.println(""
				+"	</body>"
				+"</html>"
				);		
		
	}
}

