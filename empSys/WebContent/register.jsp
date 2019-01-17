<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>员工注册</h1>

	<hr width="100%">
		
		<form action="${pageContext.request.contextPath }/Registerservlet" method="post">		
		编&emsp;  &emsp; 号: 	<input type="text"	name="id" id="id" >	
		<br>
               姓&emsp;  &emsp; 名: <input type="text"	name="name" id="name">
               <br>
                密&emsp;  &emsp; 码:  <input type="password"	name="password" id="password" >
                  <br>
                 性&emsp;  &emsp; 别:<input type="checkbox"	name="gender" id="gender" value="男" >男
                          <input type="checkbox"	name="gender" id="gender" value="女">女
      <br>          
                  年&emsp;  &emsp; 龄:  <input type="text"	name="age" id="age" >
        <br>           
                   入&emsp;职&emsp;日&emsp;期:<input type="date"	name="hiredate" id="hiredate" >           
        <br>             
                     电&emsp;  &emsp; 话: <input type="text"	name="phone" id="phone" >
        <br>            
                    邮&emsp;  &emsp; 箱: <input type="text"	name="email" id="email" >
        <br>
             <input type="submit" value="注册">   <input	type="reset" value="重置"> 
           </form>    		




</body>
</html>