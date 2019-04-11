<%-- 
    Document   : EmployerReviews
    Created on : Nov 15, 2018, 1:36:30 PM
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

    <center><h1>Employer Reviews</h1></center><br>
</head>
<body>
    <div class="container">
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
                        <th>Employer Username</th>
                        <th>Task ID</th>
                        <th>Task</th>
                        <th>Rating of Employer</th>
                        <th>Employer Comments</th>
                        <th>Rated Employee Username</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${employerReviewsList}" var="EmployerReviewsList">
                        <tr>
                            <td>${EmployerReviewsList.employerusername}</td>
                            <td>${EmployerReviewsList.taskid}</td>
                            <td>${EmployerReviewsList.task}</td>
                            <td>${EmployerReviewsList.ratingofemployer}</td>
                            <td>${EmployerReviewsList.employercomments}</td>
                            <td>${EmployerReviewsList.ratedemployeeusername}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>

