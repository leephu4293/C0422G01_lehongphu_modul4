<%--
  Created by IntelliJ IDEA.
  User: ABC
  Date: 8/15/2022
  Time: 10:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="../../bootstrap-5.0.2-dist/css/bootstrap.min.css">
<html>
<head>
    <title>Title</title>

</head>
<body>
<form action="/home">
    <div class="row g-3 align-items-center">
        <div class="col-auto">
            <label class="col-form-label" for="seachInput">NHAP TU MUON TIM</label>
        </div>
        <div class="col-auto">
            <input type="text" name="word" id="seachInput" class="form-control" aria-describedby="passwordHelpInline">
        </div>
        <div class="col-auto">
          <button type="submit" class="btn-outline-primary btn">Submit</button>
        </div>
    </div>
</form>
<p> ${result}</p>
</body>
<script src="../../bootstrap-5.0.2-dist/js/bootstrap.min.js"></script>
</html>
