<%-- 
    Document   : BiddedTasks
    Created on : Nov 4, 2018, 7:11:43 PM
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

    <center><h1>Bidded Tasks</h1></center>
    <script>
        function showRow(row) {
            var x = row.cells;
            document.getElementById("idbidfortask").value = x[0].innerHTML;
            document.getElementById("yourbid").value = x[2].innerHTML;
        }

        function deleteBiddedTask() {
            alert("Bidded Task is deleted successfully");
        }
    </script>
</head>
<body>
    <form method="POST" action="../BiddedTasks">
        <div class="container">
            <table class="table" id="BiddedTasksTb">
                <thead>
                    <tr>
                        <th style="display: none;"></th>
                        <th>Task ID</th>
                        <th>Your Bid</th>
                        <th>Task</th>
                        <th>Category</th>
                        <th>Estimated Value</th>
                        <th>Employer Username</th>
                        <th>Task Date</th>
                        <th>Edit Bid</th>
                        <th>Delete Bid</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="taskslist" items="${biddedTasksList}">
                        <tr onclick="showRow(this);">
                            <td style="display: none;"><c:out value="${taskslist.idbidfortask}" /></td>
                            <td><c:out value="${taskslist.taskid}" /></td>
                            <td><c:out value="${taskslist.yourbid}" /></td>
                            <td><c:out value="${taskslist.task}" /></td>
                            <td><c:out value="${taskslist.category}" /></td>
                            <td><c:out value="${taskslist.estimatedvalue}" /></td>
                            <td><c:out value="${taskslist.username}" /></td>
                            <td><c:out value="${taskslist.taskdate}" /></td>
                            <td><button type="submit" class="btn btn-primary" name="button" value="Edit Task">Edit Bid</button></td>
                            <td><button type="submit" class="btn btn-primary" name="button" value="Delete Task" onclick="deleteBiddedTask();">Delete Bid</button></td>
                        </tr>
                    </c:forEach> 
                </tbody>
            </table>
        </div>
        <input type="hidden" name="idbidfortask" id="idbidfortask" />
        <input type="hidden" name="yourbid" id="yourbid" />
    </form>
</body>
</html>

