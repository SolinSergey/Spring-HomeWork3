<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 26.09.2022
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Общий список продуктов</title>
</head>
<body>
<h1>Список продуктов</h1>

<ul>
    <c:forEach var="item" items="${products.products}">
        <li>id=${item.id}   |   ${item.title}   |   ${item.cost} рублей</li>
    </c:forEach>
</ul>


<%--<ul>--%>
<%--<c:forEach var="item" items="${students}">--%>
<%--<li>${item.firstName}</li>--%>
<%--</c:forEach>--%>
<%--</ul>--%>

</body>
</html>
