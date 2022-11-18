<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<% String msg = (String) request.getAttribute("msg"); %>
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
		url('https://docs.google.com/uc?id=1n5DxVwOfbC9q680zkz4AD1Tx_n5tIe9-');	background-size: 100%;
}
.txt{
color:white;
}
</style>
</head>
<body>
	<fieldset class="txt">
		<% if (msg != null){ %>
		<%= msg %>
		<% } %>

		<legend>:::LOGIN:::</legend>
		<form method="post" action="./home">
			<table>
				<tr>
					<td class="txt"><label>Username</label></td>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
					<td class="txt" ><label>Password</label></td>
					<td><input type="text" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>