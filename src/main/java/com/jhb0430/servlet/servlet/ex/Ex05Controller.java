package com.jhb0430.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 *  Post Method
 *  데이터가 사용자에게 노출 되지 않고 많은 양의 데이터 전송 가능.
 *  
 */

@WebServlet("/servlet/ex05")
public class Ex05Controller extends HttpServlet{
	
// 	Get Method의 처리를 위한 명령어였음.
//public void doGet(HttpServletRequest request, HttpServletResponse) {} 

//Post Method 처리를 위해서는 doPost!!!
//보안적으로 위험한 데이터를 파라미터로 전달 받을 때 
//url 로 표현하기 힘든 큰 데이터나 파일을 파라미터로 전달 받을 때 

@Override
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
	// 한글 출력시 오류 -> 파라미터의 인코딩에 문제가 있다 
//	request.setCharacterEncoding("utf-8"); // 출력 인코딩도 설정해줘야.
	// 왜 get에서는 인코딩 문제가 없었을까? -> url을 통해 전달받은 데이터이기 때문에.(url이 변환 해주는거임)
	// 애초에 url은 16진수 url encoding이라는게 따로 존재하기 때문
	// request로 부터 전달받은 코드는 utf라서 따로 설정해줘야함! (맞겠지)
//	response.setCharacterEncoding("utf-8");
	response.setContentType("text/html");
	// setCharacterEncoding는 변함없이 계속 사용되니까, 중복되는 코드들은 최대한 합쳐서 써주는게 좋음
	// 요청 → servlet 도달하는 과정에서 요청 → "filter" → servlet 를 끼워서 처리할 수 있다.
	// 이 "filter" 를 활용해보자.
	// 기본패키기 하단에 com.jhb0430.servlet.common 생성. EncodingFilter 클래스 생성 
	// request.setCharacterEncoding / response.setCharacterEncoding 주석처리 후 서버 Restart 해보면 기능처리 잘 된것 확인 가능. 
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
