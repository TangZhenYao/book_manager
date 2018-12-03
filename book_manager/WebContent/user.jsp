<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息</title>
</head>
<body>
	<table border="1px">
		<tr>
		    <a href="Index">首页</a></td>
			<td>id</td>
			<td>用户名</td>
			<td>姓名</td>
			<td>性别</td>
			<td>电话</td>
			<td>地址</td>
			<td>权限</td>
			<td>密码</td>
			<td>注册码</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${user }" var="p">
			<tr>
				<td>${p.id}</td>
				<td>${p.username}</td>
				<td>${p.name}</td>
				<td>${p.sex}</td>
				<td>${p.phone}</td>
				<td>${p.address}</td>
				<td>${p.power}</td>
				<td>${p.password}</td>
				<td>${p.loginNum}</td>
				<!-- <td><a href="editProduct?id=${p.id }">修改</a><br /> -->
				<td><a href="user2?id=${p.id }">修改</a></td>
			</tr>
		</c:forEach>
		<!-- <tr>
			<td colspan="4">一共有${page.totalCount }条数据，一共有${page.totalPageNum }页
				<a href="productpage?pageNum=1">首页</a> <a
				href="productpage?pageNum=${page.prePageNum }">上一页</a> <a
				href="productpage?pageNum=${page.nextPageNum }">下一页</a> <a
				href="productpage?pageNum=${page.totalPageNum }">末页</a>
			</td>
		</tr> -->
	</table>
</body>
</html>