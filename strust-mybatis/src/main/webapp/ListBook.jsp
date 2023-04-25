<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Book</title>
</head>
<body>
	<div style="text-align:center;">Quản lý thông tin sách</div>
	<div style="text-align:right;">
		<a href="bookDetail.action" title="add book" >Thêm mới</a>
	</div>
	<s:form method="POST" theme="simple" />
		<table border="1" style="border-collapse:collapse; width=100%">
			<tr>
				<th>Ảnh</th>
				<th>Tên sách</th>
				<th>Mô tả</th>
				<th>Tác giả</th>
				<th>Chủ đề</th>
				<th>Gía</th>
			</tr>
			<s:iterator value="listBooks" var="b">
				<tr>
					<td>
						<img alt="" src="images/<s:property value="avatar" width="100" height="100"/>
					</td>
					<td><s:property value="bookName"/></td>
					<td><s:property value="description"/></td>
					<td><s:property value="authorName"/></td>
					<td></td>
					<td>
						<a href="<s:url action="bookDetail?ma=%{bookId}"">Sửa</a>
					</td>
					<td>
						<a onclick="return confirm('Bạn có chắc muốn xóa không?')"
							href="<s:url action="deleteBook?ma=%{bookId}"/> ">Xóa</a>
					</td>
					
				</tr>
				
			</s:iterator>
		</table>
	
</body>
</html>