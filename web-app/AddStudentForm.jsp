<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<jsp:include page="NavBar.jsp"></jsp:include>
<%
String name = request.getParameter("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
form {
	margin-top: 10px;
}

form table {
	margin: auto;
	width: auto;
}

tr {
	text-align: center;
}

fieldset table {
	margin: auto;
	text-align: left;
}

fieldset {
	margin: 15px 520px;
	text-align: center;
}

legend {
	color: white;
	background-color: #333;
}

body {
	background-image:
	
		url('https://docs.google.com/uc?id=1n5DxVwOfbC9q680zkz4AD1Tx_n5tIe9-');		
	background-size: 100%;
}
.txt{
	color:white;
}
</style>
</head>
<body>
	<fieldset>
		<legend>:::Insert Student Details:::</legend>
		<form method="post" action="./addStudent">
			<table>
				<tr>
					<td class="txt" ><label>Name</label></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td class="txt" ><label>Email</label></td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td class="txt" ><label>UserName</label></td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td class="txt" ><label>Password</label></td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Add Student"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
	if (name != null) {
	%>

	<h3>
		Successfully added
		<%=name%>
		to the database
	</h3>
	<%
	}
	%>
</body>
</html>