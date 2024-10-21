package com.jhb0430.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class Test10Controller extends HttpServlet{
	
//	전달 받은 id와 password가 아래에 주어진 사용자 정보와 일치 하는지 확인하세요.
	// doPost 메소드 바깥쪽에 위치
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
//		response.setCharacterEncoding(getServletInfo());
//		request.setCharacterEncoding(getServletInfo());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		//???? 이거 아닌거같은데... 기억이 ㅋㅋ...안난다 
		
//		out.println(userMap.get(name)); -> 이것도 null이네
//		out.println(userMap.get("name")); -> ㅋㅋ...아 뭐야... ㅠㅠ "" 안에 넣어주기.....
		
			out.println(""
					+"<html>\n"
					+"	<head><title></title></head>\n"
					+"	<body>\n");
				
//		id가 일치하지 않는 경우 id가 일치하지 않습니다. 를 보여주세요.
		if(!id.equals(userMap.get("id"))){
			out.println("	<h3> id가 일치하지 않습니다. </h3>");
		}
//		password가 일치하지 않는 경우 password가 일치하지 않습니다. 를 보여주세요
		else if (!password.equals(userMap.get("password"))) {
			out.println("	<h3> password가 일치하지 않습니다. </h3>");
			
		}
//		일치하는 경우 아래와 같이 결과 화면을 만드세요. (HTML 화면)
		else {
			out.println("	<h2>"+userMap.get("name")+"님 환영합니다</h2>");
		}
	
		
			out.println(""
					+"	</body>\n"
					+"</html>\n"
				
				);
	}
	

}
