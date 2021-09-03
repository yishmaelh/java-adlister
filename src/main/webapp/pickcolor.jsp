<%--
  Created by IntelliJ IDEA.
  User: yishhenderson
  Date: 9/3/21
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Choose Your Color</title>
</head>
<body>
<main>
    <h1>What is your favorite color?</h1>
    <form action="/viewcolor.jsp" method="POST">
        <input id="color" name="color" type="text">
        <button type="submit">Submit</button>
    </form>
</main>

</body>
</html>
