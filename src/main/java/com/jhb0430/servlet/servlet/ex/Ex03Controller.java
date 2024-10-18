package com.jhb0430.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * URL
 * 
 * 										이 뒤에 오는 것들.. 이게 뭘까??? 		
 * http://marondal.com/lesson/quiz_list? ~~~~~~ 
 * ↓
 * ~~~ 얘네를 파라미터(parameter)라고 부른다
 * ? 로 시작+ 이름 = 값 & 이름 = 값 으로 적혀져있다.
 * 
 * 
 * Method
 * 메소드
 * ↓
 * int getCandyPrice(int count) {
 * 		int result = 250 * count;
 * 		return result;
 * }
 * 		getCandyPrice(3) => 3에 해당하는 값을 리턴해줌.
 * 
 * 
 *  즉, count ↓									= 	Request ↓
 * 			 getCandyPrice(int count)						Servlet
 * 						↓											↓
 * 							 result										Response
 * 
 * 
 * 
 * 
 * public class Test03Controller extends HttpServlet {
 * 			@Override
 * 			public void doGet(HttpServletRequest request, HttpServletResponse response)
 * 						String id = request.getParameter("user-id")
 * 						String name = request.getParameter("name")
 * 
 */

@WebServlet("/servlet/ex03")
public class Ex03Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		// 이름과 생년월일을 전달받고,
		// 이름과 나이를 정리한 html을 구성한다 
		
		// 클라이언트로부터 정보를 정달받기 위해서는 파라미터, 객체로 전달받아야한다!!! 
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday"); // 20240812
		
		String yearString =birthday.substring(0,4);
		
		// 문자열 안에 있는 걸 정수형태로 어덯게 바꾸징? 
		int year = Integer.parseInt(yearString);
		
		
		
		
		int age = 2024 - year + 1;
		
//		out.println(""
//					+"<html>\n"
//					+"		<head><title>정보</title><head>\n"
//					+"		<body>\n"
//					+"			<h3>이름 : " + name + "</h3>\n"	
//					+"			<h3>나이 : " + age + "</h3>\n"	
//					+"		</body>\n"
//					+"</html>"
//				);
		
		
		// because "birthday" is null. getParameter 에 입력된 정보가 없어서 뜨는겅임!... 값을 안줬으니까. 
		// 주소 뒤에 ? 를 적어주고 , 파라미터 이름을 먼저 적어주고 뒤에 = + 입력해줄 값을 적어줌.. 파라미터가 여러개면 &로 구문해서 입력함.
		//http://localhost:8080/servlet/ex03?name=%EA%B9%80%EC%9D%B8%EA%B7%9C&birthday=20030523 
		// 파라미터 입력된 주소의 형식은 ↑ 이렇게 된다.
		
		
		// 하지만 저대로 만들면 활용하기가 너무 힘드니까(사용자가 주소를 하나하나 입력할 수 없으니까, ), 사람들이 사용하기 쉬운 페이지를 추가해줘야함!!
		//src-main- webapp 밑에 servlet이라는 폴더를 추가해줄거임. ex- > new "html file" 생성!
		
		/*
		데이터를 표현하는 문자열 "규격" (json)
		
		이름, 나이 -> 
		
		값 자체로만 문자열로 만들어서 리스폰스에 담아보자 
		"김인규, 22" 이렇게 하면 안되나? 
		되긴 하는데... 나중에 어떤게 무슨 값인지 구분하기 어려워 질 수 있다.
		개발에서 중요한것!! 규격 정하기!!! 규격 만들어서 이용하기~!~! 
		
		json (java script object 어쩌구저쩌구)
				자바스크립트 형태를 본따왔다.
		배열 ["김인규","유재석","조세호"]
		여러개의 값은 어떻게 쓰지?? => 자바스크립트의 dictionary, 자바의 Map 형태처럼 표현할 수 잇다.
		{"name":"김인규","age":22}
		
		*/
		
		
		out.println("{\"name\":\"" + name + "\",\"age\":" + age + "}");
		
		
//		크롬 웹스토어에서 확장프로그램 설치해서 json 예쁘게 보깅 ^ㅁ^ 
//		https://chromewebstore.google.com/detail/jsonview/gmegofmjomhknnokphhckolhcffdaihd?utm_source=ext_app_menu
	}
	
	
}
