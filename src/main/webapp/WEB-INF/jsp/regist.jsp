<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>注册用户</title>
	<h1>注册用户</h1>
  </head>

  <body>
  	<form action="/login/regist" name="userForm" method="post">
  		姓名：<input type="text" name="name">
  		密码：<input type="text" name="password">
  		<input type="submit" value="注册" />
  		 &nbsp; &nbsp; &nbsp;
          <input type="reset" value="重置"  />
  	</form>
    </body>
</html>