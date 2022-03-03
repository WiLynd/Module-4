<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Medical Form</title>
</head>
<body>
<h1>Settings</h1>
<a href="/create">Back to Setting</a>
<table>
    <tr>
        <th>Name</th>
        <th>Year Of Birth</th>
        <th>Gender</th>
        <th>Nationality</th>
        <th>Identity Card Number</th>
        <th>Vehicle</th>
        <th>Vehicle Number</th>
        <th>Vehicle Seat</th>
        <th>DepartureDay</th>
        <th>Arrived Date</th>
        <th>Location 14 Day</th>
        <th>City</th>
        <th>District</th>
        <th>Commune</th>
        <th>Address</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Symptom</th>
        <th>Exposure History</th>
    </tr>
    <c:forEach items="${medicalFormList}" var="medicalFormList" varStatus="list">
        <tr>
            <td>${list.count}</td>
            <td>${medicalFormList.name}</td>
            <td>${medicalFormList.yearOfBirth}</td>
            <td>${medicalFormList.gender}</td>
            <td>${medicalFormList.nationality}</td>
            <td>${medicalFormList.idCard}</td>
            <td>${medicalFormList.vehicle}</td>
            <td>${medicalFormList.vehicleNumber}</td>
            <td>${medicalFormList.vehicleSeat}</td>
            <td>${medicalFormList.departureDay}</td>
            <td>${medicalFormList.arrivedDate}</td>
            <td>${medicalFormList.location14Day}</td>
            <td>${medicalFormList.city}</td>
            <td>${medicalFormList.district}</td>
            <td>${medicalFormList.commune}</td>
            <td>${medicalFormList.address}</td>
            <td>${medicalFormList.phone}</td>
            <td>${medicalFormList.email}</td>
            <td>${medicalFormList.symptom}</td>
            <td>${medicalFormList.exposureHistory}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>