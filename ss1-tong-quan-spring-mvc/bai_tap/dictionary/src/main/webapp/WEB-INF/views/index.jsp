<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary Translate</title>
</head>
<body>
    <form action="/search" method="post">
        <input type="text" name="input">
        <input type="submit" value="Translate">
    </form>
    <h2>Result: ${result != null ?result:message}</h2>
</body>
</html>