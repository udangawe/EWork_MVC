<%-- 
    Document   : TaskAdded
    Created on : Nov 2, 2018, 12:29:30 AM
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

    <center><h1>Task Added</h1></center>
    <script>
        function getBidderList(row) {
            var x = row.cells;
            document.getElementById("taskId").value = x[1].innerHTML;
            document.getElementById("task").value = x[2].innerHTML;
            document.getElementById("category").value = x[3].innerHTML;
            document.getElementById("estimatedVal").value = x[4].innerHTML;
            document.getElementById("taskDate").value = x[5].innerHTML;
            document.getElementById("employerUsername").value = x[6].innerHTML;
            document.getElementById("fileName").value = x[7].innerHTML;
            //window.open("BiddersList.jsp");
        }

        function deleteTaskMsg() {
            alert("Task deleted successfully");
        }
    </script>
</head>
<body>
    <form method="POST" action="../TaskAdded">
        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <th></th>
                        <th>Task ID</th>
                        <th>Task</th>
                        <th>Category</th>
                        <th>Estimated Value</th>
                        <th>Task Date</th>
                        <th>Username</th>
                        <th>File Name</th>
                        <th>Edit Task</th>
                        <th>Delete Task</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="taskAdded" items="${taskAddedList}">
                        <tr onclick="getBidderList(this);">
                            <td><button type="submit" class="btn btn-primary" name="button" value="btnBiddersList">Best Bidders List</button></td>
                            <td><c:out value="${taskAdded.taskid}" /></td>
                            <td><c:out value="${taskAdded.task}" /></td>
                            <td><c:out value="${taskAdded.category}" /></td>
                            <td><c:out value="${taskAdded.estimatedvalue}" /></td>
                            <td><c:out value="${taskAdded.taskdate}" /></td>
                            <td><c:out value="${taskAdded.employerusername}" /></td>
                            <td><c:out value="${taskAdded.uploadedfilename}" /></td>
                            <td><button type="submit" class="btn btn-primary" name="button" value="btnEditTask">Edit Task</button></td>
                            <td><button type="submit" class="btn btn-primary" name="button" value="btnDeleteTask" onclick="deleteTaskMsg();">Delete Task</button></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <input type="hidden" name="taskId" id="taskId" />
            <input type="hidden" name="task" id="task" />
            <input type="hidden" name="category" id="category" />
            <input type="hidden" name="estimatedVal" id="estimatedVal" />
            <input type="hidden" name="taskDate" id="taskDate" />
            <input type="hidden" name="employerUsername" id="employerUsername" />
            <input type="hidden" name="fileName" id="fileName" />
        </div>
    </form>
</body>
</html>

