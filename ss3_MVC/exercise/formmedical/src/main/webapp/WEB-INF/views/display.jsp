<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 8/17/2022
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2px">
    <tr>
        <th>Name</th>
        <th>Year</th>
        <th>Gender</th>
        <th>id</th>
        <th>Nation</th>
        <th>Transport</th>
        <th>Day start</th>
        <th>Day end</th>
        <th>Note</th>
        <th>EDIT</th>
    </tr>
    <c:forEach var="list" items="${list}">
        <tr>
            <td>${list.name}</td>
            <td>${list.age}</td>
            <td>${list.gender}</td>
            <td>${list.id}</td>
            <td>${list.nation}</td>
            <td>${list.travel} ,${list.travelNumber},${list.travelSeats}</td>
            <td>${list.dayStart}/${list.monthStart}/${list.yearStart}</td>
            <td>${list.dayEnd}/${list.monthEnd}/${list.yearEnd}</td>
            <td>${list.note}</td>
            <td><a class="btn btn-primary" href="/edit/${list.id}">edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
