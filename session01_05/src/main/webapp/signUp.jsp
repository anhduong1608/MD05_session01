<%--
  Created by IntelliJ IDEA.
  User: SONY
  Date: 30/07/2025
  Time: 2:46 CH
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
    <h1>Sign Up</h1>

    <form method="POST" action="sign_up">
        <p>${RegisteredSuccessfully}</p>
        <input type="text" name="username" placeholder="Username"><br>
        <p>${namemsg}</p>
        <input type="password" name="password" placeholder="Password"><br>
        <p>${passwordmsg}</p>
        <input type="password" name="confirm_password" placeholder="Confirm Password"><br>
        <p>${confirmpassmsg}</p>
        <input type="email" name="email" placeholder="Email Address"><br>
        <p>${emailmsg}</p>
        <button type="submit">Sign Up</button>
    </form>
</div>
</body>
</html>
