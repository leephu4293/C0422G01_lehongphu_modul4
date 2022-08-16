<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 8/16/2022
  Time: 2:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <div>
          <form action="/calculator">
              <label for="id1">number1</label>
              <input type="number" id="id1" name="number1">
              <label for="id2">number2</label>
              <input type="number" id="id2" name="number2">
              <select name="select">
                  <option value="Addition">Addition(+)</option>
                  <option value="Subtraction">Subtraction(-)</option>
                  <option value="Multiplication">Multiplication(X)</option>
                  <option value="Division">Division(/)</option>
              </select>
              <button type="submit"> submit </button>
          </form>
             <p>ket qua la : ${result}</p>
      </div>
</body>
</html>
