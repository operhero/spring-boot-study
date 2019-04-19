<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String name = request.getParameter("name");
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登录成功</title>
  </head>

  <body>
	${ name }登录成功
	</form>
  </body>
</html>
