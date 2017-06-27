<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Student list page</h4>
	
	<s:if test="#request.students == null || #request.students.size() == 0">
		no info
	</s:if>
	<s:else>
		<table>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>BIRTH</th>
				<th>SCHOOL_NAME</th>
			</tr>
			<s:iterator value="#request.students">
			<tr>
				<td>${studentId }</td>
				<td>${name }</td>
				<td>${birth }</td	>
				<td>${school.schoolName }</td	>
			</tr>
			</s:iterator>
		</table>
	</s:else>
</body>
</html>