<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/body.css"/> 

<script type="text/javascript">
		function changeImg(){
			// 获取到img的空间对象
			var val = document.getElementById("validate");
			// 每次重新访问地址
			val.src="${pageContext.request.contextPath }/ValidateServlet?date=" + new Date();
		}
	</script>


</head>
<body>
<div class="container">
	<section id="content">


	<form action="${pageContext.request.contextPath }/loginservlet" method="get">
           <h1>登录</h1>
			<div>
				姓名<input type="text" placeholder="姓名"   id="name"  name="name" value="  " />
			</div>
			<div>
				密码<input type="password" placeholder="密码"   id="password" name="password" value="  "  />
			</div>
			 <div class="">
				<span class="help-block u-errormessage" id="js-server-helpinfo">&nbsp;</span>			</div> 
			<div>
			<input type="text" name="validate" value="请输入验证码">
			<img alt="验证码" id="validate" src="${pageContext.request.contextPath }/ValidateServlet"
				 style="cursor: pointer;" onclick="changeImg()"/>	
			<font color="red">${val_msg }</font>
			
				${requestScope.error_msg }
				<!-- <input type="submit" value="Log in" /> -->
				<input type="submit" value="登录" class="btn btn-primary" id="js-btn-login"/>
				
				<a href="#">忘记密码?</a><a href="register.jsp">注册新账号</a>
				<!-- <a href="#">Register</a> -->
			</div>
		</form><!-- form -->
		 <div class="button">
			
		</div> <!-- button -->
	</section><!-- content -->
</div>



</body>
</html>