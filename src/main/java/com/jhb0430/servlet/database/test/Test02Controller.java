package com.jhb0430.servlet.database.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jhb0430.servlet.common.MysqlService;

public class Test02Controller extends HttpServlet{
	@Override
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
//- Databse 연동 - 연습 문제
//JSP 와 Database 연동
	
//즐겨찾기 목록
//즐겨 찾기 목록이 아래와 같은 형태로 주어져있다.
//이름 (name)	주소 (url)
//마론달	http://marondal.com
//구글	https://google.com
//네이버	https://naver.com
//다음	https://daum.net
//1. 테이블 생성
//위 데이터를 기반으로 테이블을 설계하고 생성하세요.
//자동으로 증가하는 id를 만드세요.
//생성시간과, 업데이트 시간을 관리하는 컬럼을 포함하세요.
//2. 데이터 저장
//생성된 테이블에 위 데이터를 모두 insert 하세요.
	
	/*
CREATE TABLE `url` (
		`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	    `name` VARCHAR(32) NOT NULL,
	    `url` VARCHAR(128),
	    `createdAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	    `updatedAt` TIMESTAMP DEFAULT CURRENT_TIMESTAMP

	)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
	
	
	INSERT INTO `url`
	(`name`,`url`)
	VALUES
	('마론달','http://marondal.com'),
	('구글','https://google.com'),
	('네이버','https://naver.com'),
	('다음','https://daum.net');
	
	 */
	
//3. 목록 출력하기
//jsp를 이용해서 즐겨찾기 table 태그로 출력하세요.
//id 를 기준으로 내림차순으로 출력하세요.
	
	
//출력 컬럼은 name, url 입니다.
//url 내용을 a 태그를 이용해서 연결이 되도록 하세요.
//SELECT `name , `url` FROM `url` ORDER BY `id` DESC;
		String url = request.getParameter("url");
		String name = request.getParameter("name");

		MysqlService mysqlService = new MysqlService();
		
		mysqlService.connect();
	
		String query = "INSERT INTO  `url`\r\n"
				+ "(`name`,`url`)\r\n"
				+ "VALUE \r\n"
				+ "('" + name + "','"  + url + "');";
	
		
		response.sendRedirect("/db/test/test02.jsp");
	
//4. 입력하기
//새로운 jsp에서 input 태그로 데이터를 입력 받고, form 태그와 servlet을 이용해서 insert 하세요.
//insert 후 위에서 만든 목록 출력 페이지로 리다이렉트 하세요.
//화면 예시
//
//test02
//
//5. 삭제 하기
//출력하기 페이지에서 각 행에 삭제 링크를 추가하세요.
//삭제 링크 선택시 해당 행을 삭제하고, 출력 페이지로 리다이렉트 하세요.

	}
}
