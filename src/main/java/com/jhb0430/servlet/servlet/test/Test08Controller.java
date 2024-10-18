package com.jhb0430.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Servlet - 연습 문제
//Get Method 와 form 2

//검색하기
//검색어를 전달 받고, 아래 주어진 리스트에서 검색어가 포함된 문자열을 보여주는 페이지를 만드세요.
//추가 기능) 검색된 단어를 <b> 태그를 통해서 진하게 표시하세요.
//입력 예시
//
//맛집
//출력 예시
//
//test08
//
//검색어를 입력 받고 검색 결과 페이지로 전달하는 페이지를 만드세요.
//HTML 화면 예시
//
//test08



@WebServlet("/servlet/test08")
public class Test08Controller extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//			new ArrayList<>()는 ArrayList를 Arrays.asList()는 Arrays의 정적 클래스인 ArrayList를 리턴한다.
		
		List<String> list = new ArrayList<>(Arrays.asList( // 리스트 사이즈 5
				"강남역 최고 맛집 소개 합니다.", 
				"오늘 기분 좋은 일이 있었네요.", 
				"역시 맛집 데이트가 제일 좋네요.", 
				"집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
				"자축 저 오늘 생일 이에요."));
//		[강남역 최고 맛집 소개 합니다., 오늘 기분 좋은 일이 있었네요., 역시 맛집 데이트가 제일 좋네요., 집에 가는 길에 동네 맛집 가서 안주 사갑니다., 자축 저 오늘 생일 이에요.]
//		out.println(list); 

		String search = request.getParameter("search");
		
		
//		서치랑 일치하면 <b>
		
//		모르겠는데??? 
//		다 군만두고싶다...
		
//		
		
		
		out.println(""
				+"<html>"
				+"	<head><title>검색하기</title></head>"
				+"	<body>"
				);
		
		for (String text : list) {
			if(text.contains(search)) {
//				"강남역 최고 맛집 소개 합니다.", 
//				"강남역 최고 <b>맛집</b> 소개 합니다.",
				// 맛집 - > <b>맛집</b>
				String boldText = text.replace(search, "<b>"+search+"</b>"); 
				// 헐... 내 고민이 다 거짓말같다
			out.println("<div>" + boldText + "</div> <hr>");
			}
		}
		
		out.println(""
				
				+"	</body>"
				+"</html>"
				);
		
		
	/*	
		out.println(""
				+"<html>"
				+"	<head><title>검색하기</title></head>"
				+"	<body>"
				);
				
				for (int i = 0; i < list.size(); i++) {
					out.println(""
							+list.get(i)
							+"<hr>"
							);
					// substring해서 하는거 같은데 ㅠ.ㅠ.ㅠ.. ..으아아앙 
					
//			if(list.get(i).contains(search)) {
//				out.println( search + "가 포함되어 있습니다"
////				"<b>"+search+"</b>"
//						);
			}
				if(list.equals(search)) {
					out.println(""
							+"<b>"
							+search
							+"</b>"
							);
					
				}
				out.println(""
				
				+"	</body>"
				+"</html>"
				);
	 */			
				
				
				
				
				
				
				
	}

}
