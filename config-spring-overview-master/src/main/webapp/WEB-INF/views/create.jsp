<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vuanh
  Date: 10/6/20
  Time: 4:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Tạo mới HV</h1>
<form:form modelAttribute="student" method="post">
    <form:input path="name"></form:input>
    <form:input path="address"></form:input>
<%--    <form:input type="text" name="name">--%>
<%--    <input type="text" name="address"/>--%>
    <button type="submit">Tạo mới</button>
</form:form>
</body>
</html>
