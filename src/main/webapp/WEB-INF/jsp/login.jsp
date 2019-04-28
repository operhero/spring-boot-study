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

    <title>登录</title>
	<h1>登录</h1>

  </head>

  <body>
	<form action="/login/check" name="userForm" method="post">
		姓名：<input type="text" name="name">
		密码：<input type="text" name="password">
		<input type="submit" value="提交" />
		 &nbsp; &nbsp; &nbsp;
        <input type="reset" value="重置"  />
         &nbsp; &nbsp; &nbsp;
          <input onclick="out()" type="button" value="注册" >
          <script ...>
          function out(){
          var url = "/login/toregist";
          window.location.href= url;
          }
          </script>
	</form>
  </body>


</html>
