<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 05.04.2016
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css"/>
    <title>Persons</title>

</head>
<body>
<h1>Студенты</h1>
    <table>
        <thead>
        <tr><th>№</th><th>Имя</th><th>Фамилия</th><th>Возраст</th><th>Телефон</th><th>Оценки</th></tr>
        </thead>
        <tbody>
            <c:forEach var="p" items="${persons}">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.firstName}</td>
                    <td>${p.lastName}</td>
                    <td>${p.age}</td>
                    <td>${p.phone}</td>
                    <td><a href="marksbyperson.html?person_id=${p.id}">Оценки</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
