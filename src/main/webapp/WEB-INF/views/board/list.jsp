<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"   isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>메인 페이지</title>
</head>
<body>
    <table border = "1" style = "text-align : center">
   		<tr>
   			<td style ="width : 300px; height : 100px;" colspan = 4>동한이의 다짐 목록 </td>
   			<td style ="width : 200px; height : 100px;">
   			<a href="board/writeView"> 추가 </a>
   			</td>
   		</tr>
   		
   		<tr>
   			<td style ="width : 100px; height : 100px;"> 번호 </td>
   			<td style ="width : 400px; height : 100px;"> 목록 </td>
   			<td style ="width : 200px; height : 100px;"> 등록일</td>
   			<td style ="width : 200px; height : 100px;"> 수정일</td>
   		</tr>
   		<c:forEach items = "${list}" var = "list">
   			<tr>
   				<td style ="width : 100px; height : 100px;"><c:out value="${list.seqno}"/></td>
   				<td style ="width : 400px; height : 100px;"><c:out value="${list.promise}"/></td>
   				<td style ="width : 200px; height : 100px;"><c:out value="${list.ins_dt}"/></td>
   				<td style ="width : 200px; height : 100px;"><c:out value="${list.ups_dt}"/></td>
   			</tr>
		</c:forEach>
	</table>
</body>
</html>