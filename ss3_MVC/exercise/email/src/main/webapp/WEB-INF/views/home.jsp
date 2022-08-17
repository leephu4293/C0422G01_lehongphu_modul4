<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 8/17/2022
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="../../bootstrap-5.0.2-dist/css/bootstrap.min.css">
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="row">
    <div class="col-lg-2"></div>
    <div class="col-lg-8 d-flex justify-content-center">
        <div class="w-75">
            <h1 class="justify-content-lg-center">SETTINGS</h1>
            <form:form action="/create" method="get" modelAttribute="email">

                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Languages</label>
                    <form:select path="language" items="${language}" class="form-control" id="exampleInputEmail1"
                                 aria-describedby="emailHelp"/>
                </div>

                <div class="mb-3">
                    <label for="exampleInputEmail2" class="form-label">Page Size</label>
                    <form:select path="pageSize" items="${size}" class="form-control" id="exampleInputEmail2"
                                 aria-describedby="emailHelp"/>
                </div>

                <div class="form-check ">
                    <form:checkbox class="form-check-input" path="filter" value="Enable spams filter"
                                   id="flexCheckDefault"/>
                    <label class="form-check-label" for="flexCheckDefault">
                        Enable spams filter
                    </label>
                </div>

                <div class="mb-3 ">
                    <label for="id1">Signature</label>
                    <form:textarea class="form-control" path="sign" id="id1"/>
                </div>

                <div>
                    <button type="submit" class="btn-primary">submit</button>
                </div>

            </form:form>
        </div>
    </div>
    <div class="col-lg-2"></div>
</div>
<script src="../../bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
</body>
</html>
