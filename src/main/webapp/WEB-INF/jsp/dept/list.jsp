<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
<c:if test="${true}">
	<link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.css">
	<link rel="stylesheet" href="/webjars/animate.css/3.5.2/animate.css">
</c:if>
<!-- Coding 할 때 사용하기 위한 코드 ▼ -->
<c:if test="${false}">
	<link rel="stylesheet" href="../css/bootstrap.css" >
	<link rel="stylesheet" href="../css/animate.css">
</c:if>
</head>
<body>
<h1>Dept List!!</h1>
	<table class="table table-hover table-bordered table-striped animated bounce">
	<thead>
		<tr>
			<th>deptno</th>
			<th>dname</th>
			<th>loc</th>
		</tr>
	</thead>
	<tfoot>
	</tfoot>
	<tbody>
	<c:forEach var="d" items="${depts}">
	<tr>
	<td>${d.deptno}</td>
	<td>${d.dname}</td>
	<td>${d.loc}</td>
	</tr>
	</c:forEach>
	</tbody>
	</table>
</body>
</html>