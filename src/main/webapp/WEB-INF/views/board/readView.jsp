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
			var formObj = $("form[name='readForm']");
			
			$("#delPromise").click(function(){
				formObj.attr("action", "/board/delete");
				formObj.attr("method", "post");
				formObj.submit();
			});
			
			$("#uptPromise").click(function(){
				var text = $('#uptPromise').html();
				if (text == '수정'){
					$('#delPromise').hide();
					$('#promise').attr('readOnly',false);
					$('#uptPromise').html('확인');
				}else if(text == '확인'){					
					formObj.attr("action", "/board/update");
					formObj.attr("method", "get");
					formObj.submit();
				}
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
					<form name="readForm" role="form" method="post">
						<input type="text" id="seqno" name="seqno" value="${read.seqno}" readOnly/>
					</form>
				</td>
			</tr>
			<tr>
				<td style="width: 100px; height: 100px;" colspan=3>
					<label for="seqno">내용</label>
					<input type="text" id="promise" name="promise" value="${read.promise}" readOnly/>
				</td>
			</tr>
			<tr>
				<td style="width: 100px; height: 100px;" colspan=3>
					<label for="seqno">등록일</label> 
					<fmt:formatDate value="${read.ins_dt}" pattern="yyyy-MM-dd" /></td>
			</tr>
		</tbody>
	</table>
	<div>
		<button type="submit" id="list" class="list">목록</button>	
		<button type="submit" id="uptPromise" class="update">수정</button>
		<button type="submit" id="delPromise" class="delete">삭제</button>
	</div>		
</body>
</html>