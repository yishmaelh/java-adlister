<%--
  Created by IntelliJ IDEA.
  User: yishhenderson
  Date: 9/2/21
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% if (request.getMethod().equalsIgnoreCase("POST")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (password.equals("password") && username.equals("username")) {
        response.sendRedirect("/profile.jsp");
    }
}
%>
<html>
<head>
    <title>Welcome to the Login Portal</title>
</head>
<body>
<form action="login.jsp" method="post">
    <div class="form">
        <label for="username" class="form-label">Username</label>
        <input type="text" id="username" name="username" class="form-control" placeholder="Enter Username">
    </div>
    <div class="form">
        <label for="password" class="form-label">Password</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Enter Password">
    </div>
    <button type="submit" class="btn btn-block">Login</button>
</form>
</body>
</html>
