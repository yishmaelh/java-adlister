<%--
  Created by IntelliJ IDEA.
  User: yishhenderson
  Date: 9/3/21
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Planet</title>
</head>
<body>
<form action="/pizza-order" method="post">
    <div class="form">
        <label for="crust">
            Crust
        </label>
        <select id="crust" name="crust">
            <option>Hand Tossed</option>
            <option>Stuffed</option>
            <option>Deep Dish</option>
        </select>
    </div>
    <div class="form">
        <label for="sauce">
            Sauce
        </label>
        <select id="sauce" name="sauce">
            <option>BBQ</option>
            <option>Marinara</option>
            <option>Alfredo</option>
        </select>
    </div>
    <div class="form">
        <label for="size">
            Size
        </label>
        <select id="size" name="size">
            <option>Small</option>
            <option>Medium</option>
            <option>Large</option>
        </select>
    </div>
    <h3>Choose Toppings</h3>
    <div>
        <label for="chicken">Chicken</label>
        <input type="checkbox" id="chicken" name="chicken" value="chicken" >
    </div>
    <div>
        <label for="pineapple">Mushrooms</label>
        <input type="checkbox" id="pineapple" name="pineapple" value="pineapple" >
    </div>
    <div>
        <label for="cheese">Cheese</label>
        <input type="checkbox" id="cheese" name="cheese" value="cheese" >
    </div>
</form>

</body>
</html>
