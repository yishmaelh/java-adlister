<%--@elvariable id="color" type="PickColorServlet"--%>
<%--
  Created by IntelliJ IDEA.
  User: yishhenderson
  Date: 9/3/21
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your Favorite Color</title>
</head>
<body style="background-color: <%= request.getParameter("color") %>">
<h1 style="margin: auto"><%= request.getParameter("color") %> is a great color!</h1>

</body>
</html>
