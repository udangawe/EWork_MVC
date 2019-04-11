<%-- 
    Document   : BestBids
    Created on : Nov 2, 2018, 8:21:39 PM
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

    <center><h1>Best Bids</h1></center><br>
</head>
<body>
    <form method="POST" action="../BestBids">
        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <th>Task ID</th>
                        <th>Bid Value</th>
                        <th>Employee Username</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="bidsList" items="${bestBidsList}">
                        <tr>
                            <td><c:out value="${bidsList.taskid}" /></td>
                            <td><c:out value="${bidsList.yourbid}" /></td>
                            <td><c:out value="${bidsList.employeeusername}" /></td>
                        </tr>
                    </c:forEach>
                </tbody>    
            </table><br>

            <button type="submit" class="btn btn-primary" name="button" value="EmployeeHomePage">Employee Home Page</button>
        </div>
        <input type="hidden" name="username" value="${username}" />
    </form>
</body>
</html>

