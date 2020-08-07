<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다짐 추가</title>
</head>
<body>
	<form action = "/board/write" method ="post">
		<table border="1" style="text-align: center">
			<tr>
				<td style="width: 300px; height: 100px;">오늘의 다짐</td>
			</tr>
			<tr>
				<td style="width: 300px; height: 100px;">
				<input type="text" name="promise" value="promise"></td>
			</tr>
			<tr>
			</tr>
		</table>
    			<input type="submit">
	</form>
</body>
</html>