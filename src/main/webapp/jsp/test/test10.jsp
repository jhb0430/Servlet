<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.List" %>    
<%@ page import ="java.util.ArrayList" %>    
<%@ page import ="java.util.Map" %>    
<%@ page import ="java.util.HashMap" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP - 종합문제 2</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<link rel="stylesheet" href="test10-style.css">
</head>

<body>
<!-- 
멜롱 사이트
아래와 같이 아이유 노래 목록을 보여주는 페이지를 만드세요.
아래 주어진 데이터를 활용해서 화면에 표시하세요.
리스트에서 노래제목을 클릭하면 해당 노래 세부사항을 표시하는 화면으로 이동하세요.
검색어를 입력하면 해당하는 노래 제목이 있을 경우 해당하는 노래 세부사항 페이지로 이동하세요.
 -->
 <%
// 아티스트 정보 

    Map<String, Object> artistInfo = new HashMap<>();
    artistInfo.put("name", "아이유");
    artistInfo.put("debute", 2008);
    artistInfo.put("agency", "EDAM엔터테인먼트");
    artistInfo.put("photo", "https://musicmeta-phinf.pstatic.net/artist/000/112/112579.jpg?type=ff300_300");


// 아이유 노래 리스트 
    List<Map<String, Object>> musicList = new ArrayList<>();

    Map<String, Object> musicInfo = new HashMap<>();
    musicInfo.put("id", 1);
    musicInfo.put("title", "팔레트");
    musicInfo.put("album", "Palette");
    musicInfo.put("singer", "아이유");
    musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/002/000/2000240.jpg?type=r360Fll");
    musicInfo.put("time", 217);
    musicInfo.put("composer", "아이유");
    musicInfo.put("lyricist", "아이유");
    musicList.add(musicInfo);

    musicInfo = new HashMap<>();
    musicInfo.put("id", 2);
    musicInfo.put("title", "좋은날");
    musicInfo.put("album", "Real");
    musicInfo.put("singer", "아이유");
    musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/000/184/184117.jpg?type=r360Fll");
    musicInfo.put("time", 233);
    musicInfo.put("composer", "이민수");
    musicInfo.put("lyricist", "김이나");
    musicList.add(musicInfo);

    musicInfo = new HashMap<>();
    musicInfo.put("id", 3);
    musicInfo.put("title", "밤편지");
    musicInfo.put("album", "palette");
    musicInfo.put("singer", "아이유");
    musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/002/000/2000240.jpg?type=r360Fll");
    musicInfo.put("time", 253);
    musicInfo.put("composer", "제휘,김희원");
    musicInfo.put("lyricist", "아이유");
    musicList.add(musicInfo);

    musicInfo = new HashMap<>();
    musicInfo.put("id", 4);
    musicInfo.put("title", "삐삐");
    musicInfo.put("album", "삐삐");
    musicInfo.put("singer", "아이유");
    musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/002/559/2559408.jpg?type=r360Fll");
    musicInfo.put("time", 194);
    musicInfo.put("composer", "이종훈");
    musicInfo.put("lyricist", "아이유");
    musicList.add(musicInfo);

    musicInfo = new HashMap<>();
    musicInfo.put("id", 5);
    musicInfo.put("title", "스물셋");
    musicInfo.put("album", "CHAT-SHIRE");
    musicInfo.put("singer", "아이유");
    musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/000/592/592471.jpg?type=r360Fll");
    musicInfo.put("time", 194);
    musicInfo.put("composer", "아이유,이종훈,이채규");
    musicInfo.put("lyricist", "아이유");
    musicList.add(musicInfo);

    musicInfo = new HashMap<>();
    musicInfo.put("id", 6);
    musicInfo.put("title", "Blueming");
    musicInfo.put("album", "Love poem");
    musicInfo.put("singer", "아이유");
    musicInfo.put("thumbnail", "https://musicmeta-phinf.pstatic.net/album/003/399/3399860.jpg?type=r360Fll");
    musicInfo.put("time", 217);
    musicInfo.put("composer", "아이유,이종훈,이채규");
    musicInfo.put("lyricist", "아이유");
    musicList.add(musicInfo);
    
    
    
    
    // String title = request.getParameter("title");
    
    String title =  request.getParameter("title");
    
    
    // id가 null이 아닌 경우에만 받아올 수 있도록 미리 설정 
    String idString = request.getParameter("id");
    int id = 0;
    if(idString != null) {
    	id = Integer.parseInt(idString);
    //int id = Integer.parseInt(request.getParameter("id"));
    }
    
%>
 
 <%-- if(search.equals(list.get("title"))){
 	세부사항 보여주기 
 } --%>
 
 
	<div id="wrap">
		<header class="d-flex align-items-center justify-content-start p-2">
				<h1 class="text-success font-weight-bold ">Melong</h1>
				<input type="text" class="form-control col-4 ml-3">
				<div class="input-group-append">
				<button type="submit" class="btn btn-info">검색</button>
			</div>
		</header>
		<nav>
			<ul class="nav nav-fill col-5 mt-3">
				<li class="nav-item"><a class="nav-link text-dark font-weight-bold" href="#">멜롱챠트</a></li>
				<li class="nav-item"><a class="nav-link text-dark font-weight-bold" href="#">최신음악</a></li>
				<li class="nav-item"><a class="nav-link text-dark font-weight-bold" href="#">장르음악</a></li>
				<li class="nav-item"><a class="nav-link text-dark font-weight-bold" href="#">멜롱DJ</a></li>
				<li class="nav-item"><a class="nav-link text-dark font-weight-bold" href="#">뮤직어워드</a></li>
			</ul>
		</nav>
		<!--  -->
		<section class="mt-4 ml-2">
				<h3>곡 정보</h3>
				<% 
					for(Map<String, Object> list : musicList){
					int min = (int)list.get("time") / 60;
					int sec = (int)list.get("time") % 60;
					
					// int id = Integer.parseInt(request.getParameter("id"));
					
					//if(title.equals(list.get("title")) || search.equals(list.get("title"))){
					 // if(title.equals(list.get("title"))){
				// 타이틀이 있는 경우면 타이틀로 비교하고 아이디가 있으면 아이디로 비교해라
				
				 if(title != null && title.equals(list.get("title"))
				 	|| id != 0 && id == (Integer)list.get("id")){	
						// id가 같고, id가 0이 아니고 
							// 검색했을때 이름이 같으면 
				%>
				
			<div class="d-flex border border-success p-3 col-11 ml-2">
				<div> 
					<img width="200" src= "<%= list.get("thumbnail")%>">
				</div>
				<div class="ml-4">
					<div>
							<div class="display-4"><%= list.get("title")%></div>
							<h5 class="text-success font-weight-bold"><%= list.get("singer")%></div>
						
						<div class="small">
								<table>
									<tr>
										<td>앨범</td>
										<td><%= list.get("album") %></td>
									</tr>
									<tr>
										<td>재생시간</td>
										<td> <%= min %> : <%= sec %> </td>
									</tr>
									<tr>
										<td>작곡가</td>
										<td><%= list.get("composer") %> </td>
									</tr>
									<tr>
										<td>작사가</td>
										<td><%= list.get("lyricist") %> </td>
									</tr>
									
								</table>
							</div>
					</div>
				</div>
			<% 		}  %>
			<% 	} %>
			</div>
			<div class="mt-4 ml-2">
				<h3 class="">가사</h3>
			</div>	
			<hr>
			<div>
				가사 정보 없음
			</div>
		</section>
		<footer>
		<hr>
			<div class="m-3">Copyright 2021. melong All Rights Reserved.</div>
		</footer>
	
	
	
 	</div>
 
 
 
 
 
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
</body>
</html>