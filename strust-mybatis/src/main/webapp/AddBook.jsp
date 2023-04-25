<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Book</title>
</head>
<body>

	<s:form action="addBook" method="POST" theme="simple" />

	<table>
		<tr>
			<td>Tiêu đề</td>
			<td><s:textfield name="objSack.bookName"
					value="%{objSach.bookName}" />
					<s:hidden name="objSach.bookId" value="%{objSach.bookId}"/>		
			</td>
		</tr>

		<tr>
			<td>Mô tả</td>
			<td><s:textfield name="objSack.description"
					value="%{objSach.description}" /></td>
		</tr>

		<tr>
			<td>Chọn ảnh</td>
			<td><s:file name="fileUpload" label="Select a file to upload"
					size="40" /> <s:property value="fileUploadFileName" /> <s:property
					value="fileUploadContentType" /> <img alt="Book"
				src="images/<s:property value="objSach.avatar"/> width="
				200" height="200" /> <s:hidden name="objSach.avatar"
					value="%{objSach.avatar}" /></td>
		</tr>
		<tr>
			<td>Tác giả</td>
			<td><s:textfield name="objSack.authorName"
					value="%{objSach.authorName}" /></td>
		</tr>
		<tr>
			<td>Gía sách</td>
			<td><s:textfield name="objSack.price"
					value="%{objSach.price}" /></td>
		</tr>
		
		<tr>
			<td></td>
			<s:submit value="cập nhật"/>
			<td>
				<s:textfield name="objSack.authorName"/>
				&nbsp; <a href='<s:url action="listBook.action"/>'>Trở lại</a>
			</td>
		</tr>
		
		<tr>
			<td></td>
			<td>
				<s:actionerror/>
			</td>
			
		</tr>
	</table>

</body>
</html>