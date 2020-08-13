<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
	<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.5.1.js"/>"></script>
	<meta charset="UTF-8">
	<title>다짐</title>
	
	<script>
		$(document).ready(function(){
			$("#delPromise").click(function(){
				
			});
		});
	</script>
</head>
<body>
	<table border="1" style="text-align: center">
		<thead>
			<tr>
				<td style="width: 300px; height: 100px;" colspan=3>
					다짐
				</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td style="width: 100px; height: 100px;" colspan=3>
					<label for="seqno">번호</label>
					<input type="text" id="seqno" name="seqno" value="${read.seqno}">
				</td>
			</tr>
			<tr>
				<td style="width: 100px; height: 100px;" colspan=3>
					<label for="seqno">내용</label>
					<input type="text" id="promise" name="promise" value="${read.promise}">
				</td>
			</tr>
			<tr>
				<td style="width: 100px; height: 100px;" colspan=3>
					<label for="seqno">등록일</label> 
					<fmt:formatDate value="${read.ins_dt}" pattern="yyyy-MM-dd" /></td>
			</tr>
			<tr>
				<td style="width: 30px; height: 100px;">
					<a href="${contextPath}/board/list">목록</a>
				</td>
				<td style="width: 30px; height: 100px;">
					<a href="javascript:void(0);">수정</a>
				</td>
				<td style="width: 30px; height: 100px;">
					<input type="button" id="delPromise" name="delPromise" value="삭제">
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>