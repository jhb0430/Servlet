package com.jhb0430.servlet.database.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/db/ex/ex01")
public class Ex01Controller extends HttpServlet {

	@Override
	
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		
		// used_goods 테이블의 모든 행을 조회해서 결과를 response에 담기
		
		// database 접속
			try {
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());

				// 접속 주소, 포트, id,  password
				String url = "jdbc:mysql://localhost:3306/jhb0430";
							// mysql 프로토콜 규격을 기반으로 전송을 하겠다는 형식의 url.
				String id = "root";
				String password = "root";
				
				Connection connection =	DriverManager.getConnection(url,id,password);
				
				// 쿼리 수행
				
				Statement statement = connection.createStatement();
				
				ResultSet resultSet = statement.executeQuery("SELECT * FROM `used_goods`;");
						// 이터레이터와 비슷하다. 
//						조회 결과가 여러행이면 1행(가장 처음)을 가리켜서 값을 얻어옴 -> 그 다음 행을 가리켜서 거기서 값 얻어옴 ... 반복
				
				
				// 쿼리 수행 결과 다루기
				
				while(
						resultSet.next()
					) 
				{
				// 제목, 가격, 설명
				// 제목 : ~~ , 가격 : ~~~원, 설명 : ~~~~
				String title = resultSet.getString("title");
				int price = resultSet.getInt("price");
				String description = resultSet.getString("description");
				
				out.println("제목 : " + title + " 가격 : " + price + " 원 설명 : " + description);
				
				}
				
				statement.close();
				
				statement = connection.createStatement();
				
				// 새로고침 할 때 마다 추가되기 때문에 조심해야함...!!! 
/*
				String query = "INSERT INTO `used_goods`\r\n"
						+ "(`sellerId`,`title`,`price`,`description`)\r\n"
						+ "VALUE \r\n"
				+ "(3, '고양이 간식 팝니다' , 2000, '우리집 고양이가 안먹어서 팔아요');";
				
				// 실행된 행의 개수
				// (insert -> 몇행이 추가 됐는지 update 몇행이 없데이트 됏는지) 
				int count = statement.executeUpdate(query);
				
				out.println("삽입 결과 : " + count);
 */
				
				
			} catch (SQLException e) {
				
				
				
				e.printStackTrace();
			}
		
		
		// 쿼리 수행
		
		
	}
	
}
