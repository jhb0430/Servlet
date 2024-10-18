package com.jhb0430.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet - 연습 문제
//Get Method 와 form 1

//주문하기
//주소, 결제카드, 가격 정보를 전달 받고, 결과 화면을 보여주는 페이지를 만드세요.

//아래 조건에 해당 할 경우 제시된 안내 문구를 표시하세요.
//전달받은 주소에 서울시 가 포함되어 있지 않으면, 배달 불가 지역입니다 를 출력하세요.
//전달 받은 결제 카드가 신한카드인 경우 결제 불가 카드 입니다. 를 출력하세요.
//정상 출력 예시
// 서울시 중구 명동로 배달준비중
//	결제금액 23000원

//input 을 통해서 주문 결과 페이지로 입력 값을 전달하는 페이지를 만드세요.
//HTML 화면 예시


@WebServlet("/servlet/test07")
public class Test07Controller extends HttpServlet{

	@Override
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// 주소, 결제카드, 가격 정보
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String priceString = request.getParameter("price");
		int price = Integer.parseInt(priceString);
		
		

			
		out.println(""
				+"<html>"
				+"	<head><title>주문 상황</title><head>"
				+"	<body>"
				);
		// 주소에 서울시가 포함되어있지 않으면
//		address의 1-2글자가 서울이 아니면 
//		html로 적기
		
		String notDelivery = address.substring(0,2);
		
//		out.println(notDelivery);
		// if(!address.contains("서울시"))
		if(!notDelivery.equals("서울")) { 
			out.println("	<h3>배달 불가 지역입니다 </h3>");
			return;
		}
//		card ==신한카드
		else if(card.equals("신한카드")) { 
			out.println("	<h3>결제 불가 카드 입니다.</h3>");
			return;
		}
		
		else {
			
		out.println("	<h3>"
				+ address 
				+ " 배달 준비중</h3>"
				+"	<hr>"
				+"	<h5>결제 금액 : "+ price + "원</h5>"
				);
		}
		
		out.println(""
				+"	</body>"
				+"<html>"
				);
		
	}
}
