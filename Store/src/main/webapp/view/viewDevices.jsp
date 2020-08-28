<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${devices.brandName} Devices</title>
</head>
<body>
	<h3>List of ${devices.brandName} devices</h3>
	<hr>
	<ul>
		<c:forEach items = "${devices.devices}" var="device">
			<li>
				Name: ${device.name} -> category: ${device.type}<br>
			</li>
			
		</c:forEach>
	</ul>
</body>
</html>