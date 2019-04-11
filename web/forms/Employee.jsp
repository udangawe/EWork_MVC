<%-- 
    Document   : Employee
    Created on : Oct 31, 2018, 2:04:09 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
              rel = "stylesheet">
        <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
        <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

        <script>
            $(function () {
                $("#lastRevDate").datepicker({
                    changeYear: true,
                    dateFormat: "yy-mm-dd"
                });
            });
        </script>
        <style type="text/css">
            .ui-datepicker select.ui-datepicker-year {
                color: black;
            }
        </style>

    <h1><center>Employee</center></h1><br><br>
</head>
<body>
    <form method="POST" action="../Employee">
        <div class="container">
            <div class="form-group">
                <button type="submit" class="btn btn-primary" name="button" value="SearchTask">Search Task</button><br><br>
                <button type="submit" class="btn btn-primary" name="button" value="BiddedTasks">Bidded Tasks</button><br><br>
                <button type="submit" class="btn btn-primary" name="button" value="OngoingTasks">Ongoing Tasks</button><br><br>
                <button type="submit" class="btn btn-primary" name="button" value="TasksCompleted">Tasks Completed</button><br><br>
                <button type="submit" class="btn btn-primary" name="button" value="MyProfile">My Profile</button><br><br>
                <button type="submit" class="btn btn-primary" name="button" value="Logout">Logout</button>

                <input type="hidden" name="employeeUsername" id="employeeUsername" value="${username}" />
            </div>
        </div>
        <!-- <c:remove var = "username"/> -->    
    </form>
</body>
</html>

