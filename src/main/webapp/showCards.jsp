<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Cards</title>
</head>

<body>
	<table>
				<tr>
					<th>Bank Name</th>
					<th>Card Number</th>
					<th>Expiry Date</th>
				</tr>
				
				<!-- loop over and print our card details -->
				<c:forEach var="tempCard" items="${cards}">
				
					<tr>
						<td> ${tempCard.bankName} </td>
						<td> ${tempCard.cardNumber} </td>
						<td> ${tempCard.expiryDate} </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
</body>

</html>









