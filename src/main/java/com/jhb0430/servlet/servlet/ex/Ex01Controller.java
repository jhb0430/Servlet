package com.jhb0430.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet {
		
		@Override
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
			// 결과물에 대한 정보 설정
			// Response Header
			// caracter set : utf-8
			response.setCharacterEncoding("utf-8");
			// 데이터 타입
			// MIME(규격 - ) MIME (Multipurpose Internet Mail Extensions)은 다양한 유형의 정보를 식별하기 위한 표준입니다. 
						//	MIME은 이메일의 확장자로 시작했지만 HTTP에서 서버가 전달 중인 컨텐츠를 정의하는 데도 사용됩니다
			
			// text/plain : 그냥 문자열 
			response.setContentType("text/plain");
			
			// 결과물
			// Response Body
			PrintWriter out = response.getWriter();
			
			out.println("URL Mapping 예제");
			
			// 현재 날짜 시간 정보 얻어오기 
			Date now = new Date();
			out.println(now);
			
			// 원하는 형태의 문자열로 날짜 시간 표현하기
			// ex-2024년 07월 15일 17시 44분 13초
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
			String dateTimeString = formatter.format(now);
			
			out.println(dateTimeString);
			
			// 내용만 고쳤을때는 브라우저 새로고침만 해도 된다. 
			
			
			// ★★ String타입은 "" 로적기때문에 오타가 나도 실수 찾기가 어렵다...! 
			// 틀려버리면 브라우저에서 처리할 수 없는 형태의 MIME는 브라우저가 ㅇ다운로드 형식으로 바꿔버린다. 
			
			
			
		}
}
