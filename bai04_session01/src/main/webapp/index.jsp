<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "hiển thị thời gian click bên dưới" %>
</h1>
<br/>
<a href="hello-servlet">Hiển thị thời gian hiện tại</a>
<form action="hello-servlet" method="post">
    <p style="color: red;font-size: 13px">${errol}</p>
    <input type="text" name="name" placeholder="user name" required/>
    <input type="password" name="password" placeholder="pass" required/>
    <input type="submit" value="Submit">
</form>
</body>
</html>