<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post 입력</title>
</head>
<body>
	<form method="post" action="/jsp/ex/ex03.jsp">
		<label>닉네임 : </label><input type="text" name="nickname">
		<!--  여러형태의 input 태그를 파라미터로 전달받는 방법 -->
		<!--  라디오버튼 -->
		<h3>좋아하는 동물 하나를 고르세요!</h3>
		<label>강아지 <input type="radio" name="animal" value="dog" checked></label>
		<label>고양이 <input type="radio"name="animal" value="cat"></label>
		<label>사자 <input type="radio" name="animal" value="lion"></label>
		
		<h3>좋아하는 과일을 고르세요</h3>
		<!--  셀렉트 박스 -->
		<select name="fruit">
			<option value="banana">바나나</option>
			<option value="strawberry" selected>딸기</option>
			<option value="peach">복숭아</option>
		</select>
		
		<!-- checkbox -->
		<h3>좋아하는 음식을 모두 고르세요</h3>
		<label>민트초코<input type="checkbox" name="food" value="민트초코"></label>
		<label>하와이안 피자<input type="checkbox" name="food" value="하와이안 피자"></label>
		<label>번데기<input type="checkbox" name="food" value="번데기"></label>
		
		<button type="submit">입력</button>
	</form>

</body>
</html>