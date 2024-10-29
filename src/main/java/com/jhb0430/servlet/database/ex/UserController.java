package com.jhb0430.servlet.database.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jhb0430.servlet.common.MysqlService;


@WebServlet("/db/user/create")
public class UserController extends HttpServlet {

		@Override
		
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
//			response.setContentType("text/plain");
//			
//			PrintWriter out = response.getWriter();
			
			
			// 요청한 쪽에서 전달받은 값으로 저장되면 좋을 것 같다 
			// 이름, 생년월일, 이메일 주소를 파라미터로 전달 받는다.
			
			String name = request.getParameter("name");
			String birthday = request.getParameter("birthday");
			String email = request.getParameter("email");
			
			MysqlService mysqlService = new MysqlService();
			
			mysqlService.connect();
/*
			String query = "INSERT INTO  `new_user`\r\n"
					+ "(`name`,`yyyymmdd`,`email`)\r\n"
					+ "VALUE \r\n"
					+ "('유재석','20010623','yu@gmail.com');";
			
			int count = mysqlService.update(query);
			out.println("삽입 결과 : " + count);
*/			
			
			String query = "INSERT INTO  `new_user`\r\n"
					+ "(`name`,`yyyymmdd`,`email`)\r\n"
					+ "VALUE \r\n"
					+ "('" + name + "','" + birthday + "','" + email + "');";
			
			int count = mysqlService.update(query);
//			out.println(query);
//			out.println("삽입 결과 : " + count);
			
// 실행이 다 된 이후(응답이 된 이후)에는 완성된 페이지를 보여주도록. list.jsp로 이동하도록
			
			// response - 클라이언트야 list.jsp에 새로운 요청을 하렴 
			// → redirect
//			response.sendRedirect("이동할 url path");
			response.sendRedirect("/db/user/list.jsp");
			
			
		}
	
	
}
