<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Profile</title>
</head>
<style>
* {
	font-family: Arial, Helvetica, sans-serif;
	margin: 0;
	padding: 0;
}

table {
	border-collapse: collapse;
	width: 100%;
	width: 60%;
	margin: 20px auto;
}

td {
	border: 1px solid #dddddd;
	color: #5c32a8;
	padding: 8px;
	font-weight: bold;
	text-align: center;
}
</style>
<body>
	<table>
		<tr>
			<td>Họ tên</td>
			<td>${name}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${email}</td>
		</tr>
		<tr>
			<td>Ngày sinh</td>
			<td>${birthday}</td>
		</tr>
		<tr>
			<td>Giờ sinh</td>
			<td>${birthtime}</td>
		</tr>
		<tr>
			<td>Giới tính</td>
			<td>${gender}</td>
		</tr>
		<tr>
			<td>Quốc gia</td>
			<td>${country}</td>
		</tr>
		<tr>
			<td>IDE Yêu thích <br>
				<p style="color: red;">Hãy đảm bảo các IDE bạn chọn đã hiển thị
					đầy đủ</p>
			</td>
			<td><c:forEach items="${favorite_ide}" var="fav">
		    	${fav}<br>
				</c:forEach></td>
		</tr>
		<tr>
			<td>Điểm TOEIC</td>
			<td>${toeic}</td>
		</tr>
		<tr>
			<td>Giới thiệu bản thân</td>
			<td>${message}</td>
		</tr>
	</table>
</body>
</html>
