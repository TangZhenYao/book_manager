<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人图书借还</title>
</head>
<body>
	<table border="1px">
		<tr>
		   <a href="Index">首页</a></td>
			<td>id</td>
			<td>书籍ID</td>
			<td>书籍借阅日期</td>
			<td>书籍归还日期</td>
			<!-- <td>操作</td> -->
		</tr>
		<c:forEach items="${borrow }" var="p">
			<tr>
				<td>${p.id}</td>
				<td>${p.book_id}</td>
				<td>${p.borrowtime}</td>
				<td>${p.returntime}</td>
				<!-- <td><a href="editProduct?id=${p.id }">修改</a><br /> -->
				<!-- <a href="deleteProduct?id=${p.id}">删除</a></td> -->
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