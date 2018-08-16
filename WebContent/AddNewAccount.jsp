<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddNewAccount.app" method=get>
<table>
<tr>
<td>Enter Account Holder Name<input type="text" name="customerName"></td><br>
<td>Enter Account Type<select name="accountType">
<option value="Savings Account"><a href="SavingsAccount.jsp">Savings Account</a></option>
<option value="Current Account"><a href="CurrentAccount.jsp">Current Account</a></option>
</select>
</td>

</tr>
</table>
</form>
</body>
</html>