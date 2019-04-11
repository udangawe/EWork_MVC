<%-- 
    Document   : EmployerTaskCompleted
    Created on : Nov 7, 2018, 12:15:09 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script
            src="https://code.jquery.com/jquery-2.2.4.min.js"
            integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
        crossorigin="anonymous"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <center><h1>Employer Tasks Completed</h1></center><br>
</head>
<body>
    <form>
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
                            <th>Your Bid</th>
                            <th>Employee Username</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="employerTaskCompleted" items="${employerTaskCompletedList}">
                            <tr>
                                <td><c:out value="${employerTaskCompleted.taskid}" /></td>
                                <td><c:out value="${employerTaskCompleted.task}" /></td>
                                <td><c:out value="${employerTaskCompleted.category}" /></td>
                                <td><c:out value="${employerTaskCompleted.estimatedvalue}" /></td>
                                <td><c:out value="${employerTaskCompleted.taskdate}" /></td>
                                <td><c:out value="${employerTaskCompleted.employerusername}" /></td>
                                <td><c:out value="${employerTaskCompleted.yourbid}" /></td>
                                <td><c:out value="${employerTaskCompleted.employeeusername}" /></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </form>
</body>
</html>

