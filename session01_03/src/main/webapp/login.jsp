<%--
  Created by IntelliJ IDEA.
  User: SONY
  Date: 30/07/2025
  Time: 1:58 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <link href="css.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="container">
  <h1>Chuyển đổi tiền tệ</h1>
  <form method="POST" action="/login">
    <label>Rate</label>
    <input type="number" name="rate"><br>
    <label>USD</label>
    <input type="number" name="usd"><br>
    <button type="submit">Convert</button>
  </form>
</div>
</body>
</html>
