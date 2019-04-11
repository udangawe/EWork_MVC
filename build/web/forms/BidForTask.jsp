<%-- 
    Document   : BidForTask
    Created on : Nov 2, 2018, 6:56:51 PM
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

        <script>
            function validateBidforTask() {
                var yourBid = document.getElementById("yourBid").value;

                if (yourBid == "") {
                    alert("Bid value must be filled out");
                    return false;
                } else {
                    alert("Your bid was successfully submitted");
                }
                return true;
            }
        </script>
        <style>
            #yourBid {
                border-color: red;
            }
        </style>
    <center><h1>Bid for Task</h1></center><br>
</head>
<body>
    <form method="POST" action="../BidForTask" onsubmit="return validateBidforTask()" autocomplete="off">
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="employerUsername">Employer UserName</label>
                <input type="text" class="form-control" name="employerUsername" id="employerUsername" readonly="readonly" value="${employerUsername}">
            </div>
            <div class="form-group col-md-4">
                <label for="taskId">Task ID</label>
                <input type="text" class="form-control" name="taskId" id="taskId" readonly="readonly" value="${taskId}">
            </div>
            <div class="form-group col-md-4">
                <label for="category">Category</label>
                <input type="text" class="form-control" name="category" id="category" readonly="readonly" value="${category}">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="taskDate">Task Date</label>
                <input type="text" class="form-control" name="taskDate" id="taskDate" readonly="readonly" value="${taskDate}"><br>
                <button type="submit" class="btn btn-primary">Bid Now</button>
            </div>
            <div class="form-group col-md-4">
                <label for="estimateVal">Estimated Value</label>
                <input type="text" class="form-control" name="estimateVal" id="estimateVal" readonly="readonly" value="${estimateVal}">
            </div>
            <div class="form-group col-md-4">
                <label for="yourBid">Your Bid</label>
                <input type="text" class="form-control" name="yourBid" id="yourBid">
            </div>
        </div>
        <input type="hidden" name="hiddenEmployeeUsername" id="hiddenEmployeeUsername" value="${hiddenEmployeeUsername}"/>
    </form>
</body>
</html>
