<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<h1>Calculator</h1>
<form action="calculation" method="post">
  <input type="text" name="a">
  <input type="text" name="b">
  <input type="submit" name="calculation" value="Add">
  <input type="submit" name="calculation" value="Sub">
  <input type="submit" name="calculation" value="Mul">
  <input type="submit" name="calculation" value="Div">
</form>
<h1>Kết quả: ${result}</h1>
</body>
</html>