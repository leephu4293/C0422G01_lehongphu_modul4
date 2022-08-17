<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 8/17/2022
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="../../bootstrap-5.0.2-dist/css/bootstrap.min.css">
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="row container-fluid">
    <div class="col-lg-2"></div>
    <div class="col-lg-8">
        <div class="row">
            <div class="col-lg-12">
                <form:form action="/create" modelAttribute="medical">
                    <div class="mb-3 row">
                        <label for="exampleInputEmail" class="form-label">HO VA TEN </label>
                        <form:input path="name" type="text" class="form-control" id="exampleInputEmail"
                                    aria-describedby="emailHelp"/>
                    </div>
                    <div class="mb-3 row">
                        <div class="col-lg-4">
                            <label for="exampleInputEmail1" class="form-label">NAM SINH </label>
                            <form:select path="age" items="${year}" class="form-control" id="exampleInputEmail1"
                                         aria-describedby="emailHelp"/>
                        </div>
                        <div class="col-lg-4">
                            <label for="exampleInputEmail2" class="form-label">GIOI TINH </label>
                            <form:select path="gender" items="${gender}" class="form-control" id="exampleInputEmail2"
                                         aria-describedby="emailHelp"/>
                        </div>
                        <div class="col-lg-4">
                            <label for="exampleInputEmail3" class="form-label"> QUOC TICH </label>
                            <form:select path="nation" items="${nation}" class="form-control" id="exampleInputEmail3"
                                         aria-describedby="emailHelp"/>
                        </div>
                        <div class="mb-3 row">
                            <label for="exampleInputEmail" class="form-label">SO CMND (HO CHIEU) </label>
                            <form:input path="id" type="number" class="form-control" id="exampleInputEmail"
                                        aria-describedby="emailHelp"/>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-lg-12">
                            <h5>Thong tin di chuyen
                                <h5>
                                    <form:radiobuttons cssClass="ms-4" path="travel" items="${travel}" id="1"/>

                        </div>

                    </div>
                    <div class="mb-3 row">
                            <%--                    <div class="col-lg-6">--%>
                            <%--                    <label for="exampleInputEmail" class="form-label">SO CMND (HO CHIEU) </label>--%>
                            <%--                    <form:input path="" type="number" class="form-control" id="exampleInputEmail"--%>
                            <%--                                aria-describedby="emailHelp"/>--%>
                            <%--                    </div>--%>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
    <div class="col-lg-2"></div>
</div>
<script src="../../bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
</body>
</html>
