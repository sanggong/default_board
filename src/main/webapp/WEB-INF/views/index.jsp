<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/file/save" method="post" enctype="multipart/form-data">
		<input type="file" name="uploadFile" />
		<button type="submit">파일업로드</button>
	</form>
</body>
</html>