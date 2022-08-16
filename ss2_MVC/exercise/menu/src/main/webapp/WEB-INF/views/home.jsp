
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
        <div style="width: 350px; text-align: center; margin: auto">
            <h1>Sandwich Condiments</h1>
            <form action="/menu">
                <table>
                    <tr>
                        <c:forEach var="menu" items="${menu}">
                            <td><input type="checkbox" name="pick" value="${menu}"> ${menu}</td>
                        </c:forEach>
                    </tr>
                </table>
                <hr>
                <button type="submit">submit</button>
            </form>
                <c:if test="${list!=null}">
                <c:forEach var="list" items="${list}">
                   <p>Ban da chon: ${list}</p>
                </c:forEach>
                </c:if>
                <c:if test="${list==null}">
                    <p>${mess}</p>
                </c:if>
        </div>
</body>
</html>
