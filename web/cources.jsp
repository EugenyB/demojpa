<%--
  Created by IntelliJ IDEA.
  User: eugen
  Date: 06.04.2016
  Time: 0:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Курсы</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Предметы</h1>
    <table>
        <thead>
        <tr><th>№</th><th>Название</th><th>К-во часов</th><th>Успеваемость</th></tr>
        </thead>
        <tbody>
            <c:forEach var="c" items="${cources}">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.title}</td>
                    <td>${c.hours}</td>
                    <td><a href="marksbycourse.html?course_id=${c.id}">Оценки</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
