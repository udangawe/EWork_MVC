<%-- 
    Document   : EmployerJobsOffered
    Created on : Nov 13, 2018, 8:59:44 PM
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

    <center><h1>Jobs Offered</h1></center><br>
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
                    <c:forEach items="${jobsOfferedList}" var="JobsOfferedList">
                        <tr>
                            <td>${JobsOfferedList.taskid}</td>
                            <td>${JobsOfferedList.task}</td>
                            <td>${JobsOfferedList.category}</td>
                            <td>${JobsOfferedList.estimatedvalue}</td>
                            <td>${JobsOfferedList.taskdate}</td>
                            <td>${JobsOfferedList.employerusername}</td>
                            <td>${JobsOfferedList.yourbid}</td>
                            <td>${JobsOfferedList.employeeusername}</td>
                        </tr>
                    </c:forEach>
                </tbody> 
            </table>
        </div>
    </div>
</body>
</html>

