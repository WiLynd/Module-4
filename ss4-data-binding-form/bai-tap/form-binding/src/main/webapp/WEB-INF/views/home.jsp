<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="section" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h2>Settings</h2>
<form:form action="submit" method="post" modelAttribute="setting" >
  <table style="border-collapse: collapse" border="2">
    <tr>
      <td>
        <form:label path="languages">Languages</form:label>
      </td>
      <td>
        <form:select path="languages" cssStyle="width: 300px">
        <option value="English">English</option>
        <option value="Vietnamese">Vietnamese</option>
        <option value="Japanese">Japanese</option>
        <option value="Chinese">Chinese</option>
        </form:select>
      </td>
    </tr>
    <tr>
      <td>
        <form:label path="pageSize">Page Size</form:label>
      </td>
      <td style="width: 300px">
        Show
        <form:select path="pageSize">
          <option value="5">5</option>
          <option value="10">10</option>
          <option value="15">15</option>
          <option value="25">25</option>
          <option value="50">50</option>
          <option value="100">100</option>
        </form:select>
        emails per page
      </td>
    </tr>
    <tr>
      <td>
        <form:label path="spamsFilter">Spams filter:</form:label>
      </td>
      <td width="300px">
        <form:checkbox path="spamsFilter" value="true"/>Enable spams filter</td>
      </td>
    </tr>
    <tr>
      <td>
        <form:label path="signature">Signature</form:label>
      </td>
      <td>
        <form:textarea path="signature" readonly="false" cssStyle="width: 300px"></form:textarea>
      </td>
    </tr>
    <tr>
      <td>
        <input type="submit" value="Update">
      </td>
      <td>
        <input type="reset" value="Cancel">
      </td>
    </tr>
  </table>

</form:form>

</body>
</html>