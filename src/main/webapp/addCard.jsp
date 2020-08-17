<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addCard" method="POST">
			<table>
				<tbody>
					<tr>
						<td><label>Bank Name:</label></td>
						<td><input type="text" name="bankName" /></td>
					</tr>
				
					<tr>
						<td><label>Card Number:</label></td>
						<td><input type="text" name="cardNumber" /></td>
					</tr>

					<tr>
						<td><label>Expiry Date:</label></td>
						<td><input type="text" name="expiryDate" /></td>
					</tr>

					<tr>
						<td><input type="submit" value="Save" /></td>
					</tr>				
				</tbody>
			</table>	
		</form>
</body>
</html>