<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
    <title>Ввод данных нового продукта</title>
</head>

<h1>Введите данные нового продукта</h1>

<body>
<form:form action="processForm" modelAttribute="product">
    Наименование: <form:input path="title" />
    <br>
    <br>
    Цена: <form:input path="cost" />
    <br>
    <br>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>