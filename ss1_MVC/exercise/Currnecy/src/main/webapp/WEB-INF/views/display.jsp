<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 8/12/2022
  Time: 4:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>TINH QUY DOI </h1>
        <p>nhap VND </p>
        <form action="/result" method= "get"  >
            <input name="number">
            <p>ty gia 1 usd = 23000</p>
            <button type="submit" > tinh </button>
        </form>
        <p> ${total}</p>
</body>
</html>
