package com.jhb0430.servlet.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jhb0430.servlet.common.MysqlService;

@WebServlet("/db/test/test02_Del")
public class BookmarkDeleteController extends HttpServlet{

	@Override
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		

		
		MysqlService mysqlService = MysqlService.getInstance();
		
		mysqlService.connect();
		
		String id = request.getParameter("id");
		
		String query = " DELETE FROM `bookmark` WHERE `id`= " + id + ";";
		
		int count = mysqlService.update(query);
		
		response.sendRedirect("/db/test/test02.jsp");
	}
	
	
}
