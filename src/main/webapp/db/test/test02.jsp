<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="com.jhb0430.servlet.common.MysqlService" %>  
 <%@ page import ="java.util.*" %>  
 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>즐겨찾기 목록</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>


	<% 
		MysqlService mysqlService = new MysqlService();
		
		mysqlService.connect();
		
		List<Map<String,Object>> urlList = mysqlService.select("SELECT * FROM `bookmark` ORDER BY `id` DESC;");
	
		mysqlService.disconnect();	
	
	
	%>

	<table class="table text-center">
		<thead class="font-weight-bold">
			<tr>
				<th>사이트</th>
				<th>사이트 주소</th>
			</tr>
		</thead>
		<tbody>
<% for(Map<String,Object> bookmark : urlList){%>
			<tr>
				<td><%= bookmark.get("name") %></td>
				<td><a href="<%= bookmark.get("url") %>" target="_blank"><%=bookmark.get("url") %></a></td>
				<td><a href="/db/test/test02_Del?id=<%=bookmark.get("id") %>" target="_blank" class="text-light btn btn-secondary">삭제하기</a></td>
			</tr>
<%} %>
		</tbody>
	
	</table>

	<%--
	DELETE FROM `bookmark` WHERE `url`= url.get("url");
	
	--%>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>