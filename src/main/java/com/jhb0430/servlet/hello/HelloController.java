package com.jhb0430.servlet.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet {
	
	@Override 	// 상속받은 이유 : 특정 메소드를 Override하기 위해
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
					// 변수의 이름은 큰 이유가 없다면 out으로 적어두는 게 좋다 .
		PrintWriter out = response.getWriter();								//		↑ 버리면 throws 추가됨
		// Unhandled exception type IOException Exception 이 발생할 수도 있다 -> (오류났을때 해결법 정해라~ )조건 추가해주거나 버리거나(넘기거나) 하라.
	
		out.println("Hello World!!!"); // System.out.println();과 사용법 똑같다...정말 감사한 일이쥐 
										// response라는 공간에 "" 가 담기도록 하는 역할.
					// 얘가 나오기 위한 주소! 가 필요하다
//			servelt-> src-> main-> webapp -> web-inf ->lib에 있는 wml 더블클릭 -> 하단에서 source 클릭
		
		
		//	http://localhost:8080/hello  --<<   <url-pattern>/hello 에 적어준 슬래시+ 문자를 적어주는거임!!! 
		
		
/*
 * 
 * Localhost
 * 
		자신의 컴퓨터의 서버에 접속할 때 쓰이는 주소 
		-127.0.0.1
		-localhost
		
		port
							서버 고유의 번호 
		http://localhost:8080
		
									서버 (WAS) 톰캣
	 요청: Request	→		┌Request 해석 HttpServletRequest request 			public class HelloController extends HttpServlet ~~
브라우저					네트워크 													↑ 이게 Servlet		
	 응답: Response	←		└Response 만들기  HttpServletResponse response
					
		
 * 
 * Apache tomcat
 * 
 *
 * 	Java 기반의 웹서버
 * 클라이언트와 네트워크 통신 
 * 리퀘스트 문자열을 해석 ~
 * 
 *  
 *  개발자의 역할
 *  Servlet을 만든다
 *  Request 객체 정보를 통해서 필요한 컨텐츠를 생성한다
 *  필요에 따라서 DB를 조회하여 데이터를 얻는다
 *  Response 객체에 필요한 컨텐츠를 채운다 
 * 
 */
		
		
	} 
}
