<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
  <h1>Sandwich condiments</h1>
  <form>
    <input type="checkbox" id="Lettuce" value="Lettuce" name="condiment">
    <label for="Lettuce">Lettuce</label>
    <input type="checkbox" id="Tomato"  value="Tomato" name="condiment">
    <label for="Tomato">Lettuce</label>
    <input type="checkbox" id="Mustard" value="Mustard" name="condiment">
    <label for="Mustard">Mustard</label>
    <input type="checkbox" id="Sprouts" value="Sprouts" name="condiment">
    <label for="Sprouts">Sprouts</label>
    <input type="submit" value="Save">
  </form>
  <c:if test="${condiments!=null}">
    <h1>Sandwich has</h1>
    <c:forEach items="${condiments}" var="condiment">
      <h3>- ${condiment}</h3>
    </c:forEach>
  </c:if>
</body>
</html>