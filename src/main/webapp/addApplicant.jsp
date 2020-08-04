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

<script type="text/javascript">
	function addApplicant() {
		$.post("addApplicant",$("form").serialize(),function(data){
			if (data) {
				alert("添加成功!");
				location.href="list";
			}else {
				alert("添加失败!");
			}
		})
	}
</script>
</head>
<body>
	<form action="#">
		应聘人:<input type="text" name="aname"><br><br>
		性别:<input type="radio" value="男" name="gender">男
			<input type="radio" value="女" name="gender">女<br><br>
		出生日期:<input type="date" name="birthday"><br>
		毕业大学:<input type="text" name="college"><br>
		所学专业:<input type="text" name="major"><br>
		学历:<select name="edu">
				<option value="">请选择</option>
				<option value="1">专科</option>
				<option value="2">本科</option>
				<option value="3">研究生</option>
		</select><br><br>
		学位:<select name="degree">
				<option value="">请选择</option>
				<option value="1">学士</option>
				<option value="2">硕士</option>
				<option value="3">博士</option>
		</select><br><br>
		<input type="button" value="保存" onclick="addApplicant()">

	</form>
</body>
</html>