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
                <form:form action="/edit" modelAttribute="medical" method="post">
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
                            <label for="example" class="form-label">SO CMND (HO CHIEU) </label>
                            <form:input path="id" type="number" class="form-control" id="example"
                                        aria-describedby="emailHelp"/>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-lg-12">
                            <h5>Thong tin di chuyen</h5>
                            <p><form:radiobutton cssClass="ms-4" path="travel" value="May bay"/> May bay </p>
                            <form:radiobutton cssClass="ms-4" path="travel" value="Tau thuyen"/>
                            <form:radiobutton cssClass="ms-4" path="travel" value="Oto"/>
                            <form:radiobutton cssClass="ms-4" path="travel" value="khac"/>
                        </div>

                    </div>
                    <div class="mb-3 row">
                        <div class="col-lg-6">
                            <label for="ex" class="form-label">SO HIEU PHUONG TIEN </label>
                            <form:input path="travelNumber" type="text" class="form-control" id="ex"
                                        aria-describedby="emailHelp"/>
                        </div>
                        <div class="col-lg-6">
                            <label for="ex1" class="form-label">SO GHE </label>
                            <form:input path="travelSeats" type="text" class="form-control" id="ex1"
                                        aria-describedby="emailHelp"/>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="row">
                                <label class="form-label">Ngay Khoi hanh </label>
                                <div class="col-lg-4">
                                    <form:select path="dayStart" items="${day}" class="form-control"
                                                 aria-describedby="emailHelp"/>
                                </div>
                                <div class="col-lg-4">
                                    <form:select path="monthStart" items="${month}" class="form-control"
                                                 id="exampleInputEmail1"
                                                 aria-describedby="emailHelp"/>
                                </div>
                                <div class="col-lg-4">
                                    <form:select path="yearStart" items="${year}" class="form-control"
                                                 id="exampleInputEmail1"
                                                 aria-describedby="emailHelp"/>
                                </div>

                            </div>


                        </div>
                        <div class="col-lg-6">
                            <div class="row">
                                <label class="form-label">Ngay Ket thuc </label>
                                <div class="col-lg-4">
                                    <form:select path="dayEnd" items="${day}" class="form-control"
                                                 aria-describedby="emailHelp"/>
                                </div>
                                <div class="col-lg-4">
                                    <form:select path="monthEnd" items="${month}" class="form-control"
                                                 id="exampleInputEmail1"
                                                 aria-describedby="emailHelp"/>
                                </div>
                                <div class="col-lg-4">
                                    <form:select path="yearEnd" items="${year}" class="form-control"
                                                 id="exampleInputEmail1"
                                                 aria-describedby="emailHelp"/>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row mb-3">
                        <label for="exampleInput" class="form-label">Dia diem da di trong vong 14 ngay </label>
                        <form:input path="note" type="text" class="form-control" id="exampleInput"
                                    aria-describedby="emailHelp"/>
                    </div>
                    <div class="row">
                        <div class="col-lg-12">
                            <button class="btn-primary btn d-flex justify-content-lg-center" type="submit"> submit
                            </button>
                        </div>
                    </div>
                </form:form>

            </div>
        </div>
        <div class="col-lg-2">
            <a class="btn btn-primary" href="/show"> showlist</a>
        </div>
    </div>
</div>
<script src="../../bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
</body>
</html>
