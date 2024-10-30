package com.jhb0430.servlet.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MysqlService {

	
//	클래스를 설계하는 입장에서
//	해당 클래스에 대한 객체 생성을 직접 관리하고,
//	하나의 객체를 고융해서 사용하도록 구성한다.
	// Singleton pattern (Design pattern)
	
	private static MysqlService mysqlService = null;
	
	
//		mySql jdbc를 간편하게 사용하기 위함

		// 멤버 변수
		private Connection connection;
	
		
		
	// 객체 생성을 이 안에서 직접 한다!
	// 자신의 클래스에 대한 객체를 돌려주는 메소드
		
		// 접근제어자 뒤에 static 이라는 키워드를 붙인다
		// static -> 객체 생성 없이 사용하도록 하는 메소드 or 멤버 변수애 사용
		// static 이 붙어있으면 객체 생성 없이 사용할 수 있다 !! 
		// -> 이 안에서 사용되는 애들은 객체생성 없이 사용할 수 있는 애들이어야함.
		//(객체를 생성해야 쓸 수 있는 애들은 못쓴다는 뜻 )
		public static MysqlService getInstance() {
			
			
			if(mysqlService == null) { // 한번도 객체 생성이 되지 않은 경우에만
				
			mysqlService = new MysqlService(); 	// 새로운 객체 생성
			}
			
			return mysqlService;
		}
		
	// 접속 기능
	
	public void connect() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			String url = "jdbc:mysql://localhost:3306/jhb0430";
			String id = "root";
			String password ="root";
			
			// 멤버 변수로 Connection connection 을 만들었으니까 여기서는 그냥 connection 으로 적어줘야함
			connection = DriverManager.getConnection(url,id,password);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	//접속 해제 기능
	public void disconnect() {
		
		try {
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	// 조회 쿼리 수행 기능
	
	public List<Map<String,Object>> select(String query) {
		
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			
			// 조회된 결과의 컬럼 목록 얻어오기 
			
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnCount = rsmd.getColumnCount();
			
			// 컬럼 이름 리스트
			List<String> columnList = new ArrayList<>(); 
			for(int i = 1; i <= columnCount; i++) {
				columnList.add(rsmd.getColumnName(i));
			}
			
			List<Map<String,Object>> resultList = new ArrayList<>();
			
			while(resultSet.next()) {
				/*
			int id = resultSet.getInt("id");
			String address = resultSet.getString("address");
			
			// 20 1 휴먼시아 드림빌 208동 604호 111 전세 60000
			
			// {"id":20,"realtorId":1, "address":"휴먼시아 드림빌 208동 604호","area":111,"type":"전세","price":60000}
			
			Map<String,Object> resultMap = new HashMap<>();
			resultMap.put("id", id);
			resultMap.put("address", address);
			resultList.add(resultMap);
		}
				 */
				Map<String,Object> resultMap = new HashMap<>();
				
				// 컬럼 이름을 통해 resultSet 이 가리키는 행으로 부터 Object 형태의 값을 얻어오고
				// 해당 컬럼 이름을 키로 얻어온 값을 맵에 저장한다.
				for(String column : columnList) {
					
					Object value = resultSet.getObject(column);
					resultMap.put(column, value);
					
				}
				
				resultList.add(resultMap);
			}
			statement.close();
			return resultList;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	// 삽입, 수정 ,삭제 쿼리 수행 기능
	
	public int update(String query) {
		
		Statement statement;
		try {
			statement = connection.createStatement();
			int count = statement.executeUpdate(query);
			statement.close();
			return count;
			
		} catch (SQLException e) {
			
			e.printStackTrace();

			return -1;
		}
		
	
		
		
	}
	
	
	
	
}
