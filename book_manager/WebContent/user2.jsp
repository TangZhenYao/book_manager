<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示购物车</title>
</head>
<body>
    <a href="Index">首页</a></td>
    <form action="user" method="GET">
  ID：<input type="text" name="id" value="${product.id }" hidden/><br /><br />
    用户名:&nbsp;&nbsp;<input type="text" name="username">
    <br /><br />
    姓名:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="name" />
    <br /><br />
    性别:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sex">
    <br /><br />
    电话:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="phone">
    <br /><br />
    地址:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="address">
    
    <input type="text" name="power" hidden>
    <!-- 权限:&nbsp;&nbsp;&nbsp;<input type="text" name="power" hidden> -->
    <br /><br />
    密码:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="password">
    <br /><br />
    注册码:&nbsp;&nbsp;<input type="text" name="loginNum">
    <br /><br />
    <input type="submit" value="提交" /><br />
    </form>
	
</body>
</html>