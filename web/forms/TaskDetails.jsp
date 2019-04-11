<%-- 
    Document   : TaskDetails
    Created on : Nov 2, 2018, 12:58:15 PM
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
            function openBidforTask() {
                window.open("BidForTask.jsp");
            }

            function displayNoFile() {
                var fileName = document.getElementById("fileName").value;

                if (fileName == "") {
                    alert("No file contain for this record");
                }
            }
        </script>
    <center><h1>Task Details</h1><br></center>
</head>
<body>
    <form method="POST" action="../BestBids">
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="employerUsername">Employer UserName</label>
                <input type="text" class="form-control" name="employerUsername" id="employerUsername" readonly="readonly" value="${hiddenEmployerUsername}">
            </div>
            <div class="form-group col-md-4">
                <label for="taskId">Task ID</label>
                <input type="text" class="form-control" name="taskId" id="taskId" readonly="readonly" value="${hiddenTaskId}">
            </div>
            <div class="form-group col-md-4">
                <label for="lblTaskName">Task Name</label>
                <input type="text" class="form-control" id="taskName" name="taskName" placeholder="Task Name" readonly="readonly" value="${hiddenTaskName}"><br>
            </div>
            <div class="form-group col-md-4">
                <label for="category">Category</label>
                <input type="text" class="form-control" name="category" id="category" readonly="readonly" value="${hiddenCategory}">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="taskDate">Task Date</label>
                <input type="text" class="form-control" name="taskDate" id="taskDate" readonly="readonly" value="${hiddenTaskDate}">
            </div>
            <div class="form-group col-md-4">
                <label for="estimateVal">Estimated Value</label>
                <input type="text" class="form-control" name="estimateVal" id="estimateVal" readonly="readonly" value="${hiddenEstimatedVal}"><br>
            </div>
            <div class="form-group col-md-4">
                <label for="lblFileName">File Name</label>
                <input type="text" class="form-control" id="fileName" name="fileName" placeholder="File Name" value="${hiddenFileName}" readonly="readonly"><br>
            </div>
            <div class="form-group col-md-12">
                <button type="submit" class="btn btn-primary" name="button" value="btnEmployerProfile">Employer Profile</button>
                <button type="submit" class="btn btn-primary" name="button" value="bidforTaskBtn">Bid for Task</button>
                <button type="submit" class="btn btn-primary" name="button" value="btnBestBids">Best Bids</button>
                <button type="submit" class="btn btn-primary" name="button" value="btnDownloadFile" onclick="displayNoFile();">Download File</button>
            </div>    
        </div>
        <input type="hidden" id="hiddenEmployeeUsername" name="hiddenEmployeeUsername" value="${hiddenEmployeeUsername}" />
    </form>
</body>
</html>

