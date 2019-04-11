<%-- 
    Document   : EmployeeReviews
    Created on : Nov 13, 2018, 7:46:27 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <center><h1>Employee Reviews</h1></center><br>
</head>
<body>
    <div class="container">
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
                        <th>Employee Username</th>
                        <th>Task ID</th>
                        <th>Task</th>
                        <th>Rating of Employee</th>
                        <th>Employee Comments</th>
                        <th>Rated Employer Username</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${ratingEmployerList}" var="RatingEmployerList">
                        <tr>
                            <td>${RatingEmployerList.employeeusername}</td>
                            <td>${RatingEmployerList.taskid}</td>
                            <td>${RatingEmployerList.task}</td>
                            <td>${RatingEmployerList.ratingofemployee}</td>
                            <td>${RatingEmployerList.employeecomments}</td>
                            <td>${RatingEmployerList.ratedemployerusername}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>

