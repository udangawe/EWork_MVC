<%-- 
    Document   : JobsCompleted
    Created on : Nov 15, 2018, 2:25:21 PM
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

    <center><h1>Jobs Completed</h1></center><br>
</head>
<body>
    <div class="container">
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
                        <th>Task ID</th>
                        <th>Task</th>
                        <th>Category</th>
                        <th>Estimated Value</th>
                        <th>Task Date</th>
                        <th>Employer Username</th>
                        <th>Bid</th>
                        <th>Employee Username</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${jobsCompletedList}" var="JobsCompletedList">
                        <tr>
                            <td>${JobsCompletedList.taskid}</td>
                            <td>${JobsCompletedList.task}</td>
                            <td>${JobsCompletedList.category}</td>
                            <td>${JobsCompletedList.estimatedvalue}</td>
                            <td>${JobsCompletedList.taskdate}</td>
                            <td>${JobsCompletedList.employerusername}</td>
                            <td>${JobsCompletedList.yourbid}</td>
                            <td>${JobsCompletedList.employeeusername}</td>
                        </tr>
                    </c:forEach>
                </tbody> 
            </table>
        </div>
    </div>
</body>
</html>

