<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Xin chào C06K</h1>
<table border="1px">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>address</th>
    </tr>
    <c:forEach var="s" items="${list}">
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.address}</td>
        </tr>
    </c:forEach>
</table>
</body>
</body>
</html>