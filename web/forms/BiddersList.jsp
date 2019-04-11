<%-- 
    Document   : BiddersList
    Created on : Nov 4, 2018, 11:47:54 PM
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

    <center><h1>Bidders List</h1></center>
    <script>
        function offerTask(row) {
            var x = row.cells;

            document.getElementById("taskId").value = x[1].innerHTML;
            document.getElementById("task").value = x[4].innerHTML;
            document.getElementById("category").value = x[5].innerHTML;
            document.getElementById("estimatedvalue").value = x[6].innerHTML;
            document.getElementById("taskdate").value = x[7].innerHTML;
            document.getElementById("username").value = x[8].innerHTML;
            document.getElementById("yourbid").value = x[2].innerHTML;
            document.getElementById("employeeusername").value = x[3].innerHTML;
        }

        function displayMessage() {
            alert("Task offered successfully");
        }
    </script>
</head>
<body>
    <form method="POST" action="../OfferTask">
        <input type="hidden" name="rowCount" value="${rowCount}" />
        <div class="container">
            <table class="table" id="biddersListTb">
                <thead>
                    <tr>
                        <th>Offer Task</th>
                        <th>Task ID</th>
                        <th>Bid Value</th>
                        <th>Employee Username</th>
                        <th>View Employee Profile</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="list" items="${bidderList}">
                        <tr onclick="offerTask(this);">
                            <td><button type="submit" class="btn btn-primary" name="button" value="btnOfferTask" onclick="displayMessage();">Offer Task</button></td>
                            <td><c:out value="${list.taskid}" /></td>
                            <td><c:out value="${list.yourbid}" /></td>
                            <td><c:out value="${list.employeeusername}" /></td>
                            <td style="display:none;"><c:out value="${list.task}" /></td>
                            <td style="display:none;"><c:out value="${list.category}" /></td>
                            <td style="display:none;"><c:out value="${list.estimatedvalue}" /></td>
                            <td style="display:none;"><c:out value="${list.taskdate}" /></td>
                            <td style="display:none;"><c:out value="${list.username}" /></td>
                            <td><button type="submit" class="btn btn-primary" name="button" value="btnEmployeeProfile">Employee Profile</button></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <c:if test="${rowCount == 0}">
            <br><center><h2>No Bids Yet</h2></center>
            </c:if>

        <input type="hidden" name="taskId" id="taskId" />
        <input type="hidden" name="task" id="task" />
        <input type="hidden" name="category" id="category" />
        <input type="hidden" name="estimatedvalue" id="estimatedvalue" />
        <input type="hidden" name="taskdate" id="taskdate" />
        <input type="hidden" name="username" id="username" />
        <input type="hidden" name="yourbid" id="yourbid" />
        <input type="hidden" name="employeeusername" id="employeeusername" />
    </form>
</body>
</html>

