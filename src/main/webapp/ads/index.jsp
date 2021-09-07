<%--
  Created by IntelliJ IDEA.
  User: yishhenderson
  Date: 9/7/21
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads for One, Ads for All</title>
</head>
<body>
<h1>Here are all the ads:</h1>

<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>${ad.title}</h2>
        <h3>${ad.description}</h3>
    </div>
</c:forEach>

</body>
</html>
