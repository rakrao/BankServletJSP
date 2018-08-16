<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveFundTransfer.app" method="get">
<div>
<h3>From-></h3>
Account Number: <input type="number" name="fromAccNo">
Amount:<input type="number" name="amount"><br>

<h3>To-></h3>
Account Number: <input type="number" name="toAccNo">
<input type="submit" value="submit"><br>
</div>
</form>
</body>
</html>