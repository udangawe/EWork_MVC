<%-- 
    Document   : OngoingTasks
    Created on : Nov 6, 2018, 1:27:30 PM
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

    <center><h1>Ongoing Tasks</h1></center><br>
    <script>
        function completeEmployeeTask(row) {
            var x = row.cells;

            document.getElementById("taskId").value = x[1].innerHTML;
            document.getElementById("task").value = x[2].innerHTML;
            document.getElementById("category").value = x[3].innerHTML;
            document.getElementById("estimatedValue").value = x[4].innerHTML;
            document.getElementById("taskDate").value = x[5].innerHTML;
            document.getElementById("employerUsername").value = x[6].innerHTML;
            document.getElementById("yourBid").value = x[7].innerHTML;
            document.getElementById("employeeUsername").value = x[8].innerHTML;
        }

        function displayMessage() {
            alert("Task completed successfully");
        }
    </script>
</head>
<body>
    <form method="POST" action="../OngoingTasks">
        <div class="container">
            <div class="table-responsive">
                <table class="table" id="ongoingTasksTb">
                    <thead>
                        <tr>
                            <th></th>
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
                        <c:forEach var="ongoingtasks" items="${ongoingTasksList}">
                            <tr onclick="completeEmployeeTask(this);">
                                <td><button type="submit" class="btn btn-primary" name="button" value="btnCompleteTask" onclick="displayMessage();">Complete Task</button></td>
                                <td><c:out value="${ongoingtasks.taskid}" /></td>
                                <td><c:out value="${ongoingtasks.task}" /></td>
                                <td><c:out value="${ongoingtasks.category}" /></td>
                                <td><c:out value="${ongoingtasks.estimatedvalue}" /></td>
                                <td><c:out value="${ongoingtasks.taskdate}" /></td>
                                <td><c:out value="${ongoingtasks.employerusername}" /></td>
                                <td><c:out value="${ongoingtasks.yourbid}" /></td>
                                <td><c:out value="${ongoingtasks.employeeusername}" /></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <input type="hidden" name="taskId" id="taskId" />
        <input type="hidden" name="task" id="task" />
        <input type="hidden" name="category" id="category" />
        <input type="hidden" name="estimatedValue" id="estimatedValue" />
        <input type="hidden" name="taskDate" id="taskDate" />
        <input type="hidden" name="employerUsername" id="employerUsername" />
        <input type="hidden" name="yourBid" id="yourBid" />
        <input type="hidden" name="employeeUsername" id="employeeUsername" />
    </form>
</body>
</html>


