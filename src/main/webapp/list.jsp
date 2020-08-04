<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>

</head>
<body>
	<a href="addApplicant.jsp">
		<input type="button" value="添加应聘人"> 
		
	</a>
	<table>
		<tr>
			<td>应聘人</td>
			<td>性别</td>
			<td>年龄</td>
			<td>毕业学校</td>
			<td>所学专业</td>
			<td>学历</td>
			<td>学位</td>
			<td>面试成绩</td>
			<td>平均分</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="a">
		<tr>
			<td>${a.aname }</td>
			<td>${a.gender }</td>
			<td>${a.birthday }</td>
			<td>${a.college }</td>
			<td>${a.major }</td>
			<td>${a.edu ==1?"专科":a.edu ==2?"本科":"研究生" }</td>
			<td>${a.degree == 1?"学士":a.degree == 2?"硕士":"博士 "}</td>
			<td>${a.score }</td>
			<td>${a.avgScore }</td>
			<td>
				<a href="addscore.jsp?aid=${a.aid }&aname=${a.aname}">
					<input type="button" value="录入成绩">
				</a>
				<a href="updateApplicantById?aid=${a.aid }">
					<input type="button" value="修改">
				</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>