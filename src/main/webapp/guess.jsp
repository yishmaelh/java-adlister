<%--
  Created by IntelliJ IDEA.
  User: yishhenderson
  Date: 9/3/21
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Guess A Number</title>
</head>
<body>
<h1 style="text-align: center; margin: 90px">The Guessing Game</h1>
<form action="/guess.jsp" method="POST">
  <div>
    <label for="numberGuess">Please guess a number from 1 to 3:</label>
    <input id="numberGuess" name="numberGuess" class="form-control" type="text">
  </div>
</form>
</body>
</html>
