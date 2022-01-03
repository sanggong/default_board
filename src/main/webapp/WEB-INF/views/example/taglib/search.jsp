<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tag" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Example Search</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
</head>
<body>
	<script src="https://code.jquery.com/jquery-1.11.3.js"></script>
	<div class="container">
		<h2>게시물 목록</h2>
		<form action="" method="get">
			<div class="mb-3 row">
				<label for="exampleFormControlInput1" class="col-sm-2 col-form-label">종류</label>
				<div class="col-sm-10">
					<tag:bootstrap-checkbox items="${boardTypes}" values="${parameter.boardTypes}" />
				</div>
			</div>
			<div class="mb-3 text-center">
				<button type="submit" class="btn btn-primary">검색하기</button>
			</div>
		</form>
		<table class="table">
		</table>
	</div>

</body>
</html>