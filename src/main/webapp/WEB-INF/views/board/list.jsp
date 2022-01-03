<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
</head>

<body>
	<div class="container">
		<form id="form" method="get" action="/${menuType}">
			<div class="row mb-3">
				<label for="title" class="col-sm-2 col-form-label"><spring:message
						code="search.keyword" /></label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="keyword"
						value="${parameter.keyword}" id="keyword"
						placeholder="<spring:message code="placeholder.keyword"/>" />
				</div>
			</div>
			<button type="submit" class="btn btn-primary">
				<spring:message code="button.search" />
			</button>
		</form>



		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col"><spring:message code="board.title" /></th>
					<th scope="col"><spring:message code="board.viewCount" /></th>
					<th scope="col"><spring:message code="board.regDate" /></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="board" items="${boardList}" varStatus="status">
					<tr>
						<th scope="row">${status.count}</th>
						<td><a href="/${menuType}/${board.boardSeq}">${board.title}</a></td>
						<td>${board.viewCount}</td>
						<td><fmt:formatDate value="${board.regDate}"
								pattern="yyyy.MM.dd HH:mm" /></td>
					</tr>
				</c:forEach>
				<c:if test="${fn:length(boardList) == 0 }">
					<tr>
						<td colspan="4"><spring:message code="msg.board.empty" /></td>
					</tr>
				</c:if>
			</tbody>
		</table>

		<div class="d-grid gap-2 d-md-flex justify-content-md-end mt-3">
			<a href="/${menuType}/form" class="btn btn-primary" type="button"><spring:message
					code="button.form" /></a>
		</div>
	</div>
</body>
</html>