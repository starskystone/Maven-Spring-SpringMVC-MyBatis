<%--
  Created by IntelliJ IDEA.
  User: xiaoleilei
  Date: 2017/8/4
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Spring MVC Hello World</title>
</head>

<body>
<h2>All Students in System</h2>

<table border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Age</th>
        <th>Sex</th>
    </tr>
    <c:forEach var="users" items="${users}">
        <tr>

            <td>${users.id}</td>

        </tr>
    </c:forEach>
</table>



</body>
</html>
