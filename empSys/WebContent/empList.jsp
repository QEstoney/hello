<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1" width="700" cellspacing="0">
		
		<thead>
			<tr>
				<th>id</th>
				<th>姓名</th>
				<th>密码</th>
				<th>性别</th>
				<th>年龄</th>
				<th>入职日期</th>
				<th>电话</th>
				<th>邮箱</th>
				<th colspan="2">操作</th>
			</tr>
		</thead>
	
		<c:forEach items="${requestScope.list }" var="e">
			<tr>
				<td>${e.id }</td>
				<td>${e.name }</td>
				<td>${e.password }</td>
				<td>${e.gender }</td>
				<td>${e.age }</td>
				<td>${e.hiredate }</td>
				<td>${e.phone }</td>
				<td>${e.email }</td>
				<td><a  href="${pageContext.request.contextPath }/ModifyServlet">修改</a></td>
				<td><a href="">删除</a></td>
			</tr>
		</c:forEach>
	<tr>  <td><a href="/empList.jsp">返回列表</a> </td></tr>
	</table>

</body>
</html>