package com.jhb0430.servlet.database.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jhb0430.servlet.common.MysqlService;

/*
 * Databse 연동 및 쿼리 실행
 
- Databse 연동
연습 문제
Databse 연동 및 쿼리 실행
1. 매물 리스트
부동산 매물 테이블(real_estate)을 통해서 아래 문제를 풀어보세요.
servlet에서 DB 연동을 통해 아래 항목을 insert 하고 전체 매물 리스트를 text/plain Type으로 출력하세요.
출력 예시


 * */
@WebServlet("/db/test/test01")
public class Test01Controller extends HttpServlet {

	@Override
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
/*
		try {
			// 데이터 베이스 접속
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
			String url = "jdbc:mysql://localhost:3306/jhb0430";
			String id = "root";
			String password ="root";
		
			Connection connection = DriverManager.getConnection(url,id,password);
			
			// 데이터 저장
			/*
			String query = "INSERT INTO `real_estate`\r\n"
					+ "(`realtorId`,  `address`,`area`,`type`,`price`)\r\n"
					+ "VALUE\r\n"
					+ "(3,	'헤라펠리스 101동 5305호', 350,	'매매',1500000);";
			
			Statement statement = connection.createStatement();
			
			int count = statement.executeUpdate(query);
			out.println("삽입 결과 : " + count);
			statement.close();
			 * */
/*			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM `real_estate` \r\n"
					+ "ORDER BY `id` DESC LIMIT 10;");
//			ResultSet resultSet = statement.executeQuery("SELECT `realtorId`, `address`, `area`, `type`, `price`, `rentPrice` FROM `real_estate` \r\n"
//					+ "ORDER BY `id` DESC LIMIT 10;");
//			SELECT `realtorId`, `address`, `area`, `type`, `price`, `rentPrice` FROM `real_estate` 
//			ORDER BY `id` DESC LIMIT 10;
			
			
//			출력 컬럼은 매물 주소, 면적, 타입 입니다.
//			id 기준 내림차순으로 10개만 출력하세요.
			
		while (resultSet.next()) {
		/* 괄호 위치 잘 보기!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
			
/*			
			String address = resultSet.getString("address");
			int area = resultSet.getInt("area");
			String type = resultSet.getString("type");
			
			out.println("매물 주소 : " + address + " , 면적 : " + area + " , 타입 : " + type);
			
		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
 */
		
		MysqlService mysqlService = new MysqlService();
		
		mysqlService.connect();
/*		
		String query="INSERT INTO `real_estate`\r\n"
				+ "(`realtorId`,  `address`,`area`,`type`,`price`)\r\n"
				+ "VALUE\r\n"
				+ "(3,	'헤라펠리스 101동 5305호', 350,	'매매',1500000);";
		int count = mysqlService.update(query);
		
		out.println("실행 결과 : " + count);
*/
		
//																select(테이블 불러오기)
		List<Map<String,Object>> realEstateList = mysqlService.select("SELECT * FROM `real_estate`;");
	
		for(Map<String,Object> realEstate : realEstateList) {
			String address = (String)realEstate.get("address");
			int area = (int)realEstate.get("area");
			
			out.println("매물 주소 : " + address + ", 면적 : " + area);
			
		}
		
	
		mysqlService.disconnect();
	
	} 
	
	
}
