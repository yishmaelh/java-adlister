<%--
  Created by IntelliJ IDEA.
  User: yishhenderson
  Date: 9/2/21
  Time: 10:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% if (request.getMethod().equalsIgnoreCase("POST")){
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(password.equals("password") && username.equals("username")){
    response.sendRedirect("/profile.jsp");
    }
}
%>
<html>
<head>
    <title>Some Login Form</title>
</head>
<body>

</body>
</html>
