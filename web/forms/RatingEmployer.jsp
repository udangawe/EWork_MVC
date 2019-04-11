<%-- 
    Document   : RatingEmployer
    Created on : Nov 7, 2018, 1:14:54 PM
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

        <link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-star-rating/4.0.2/css/star-rating.min.css" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-star-rating/4.0.2/js/star-rating.min.js"></script> 
    <center><h1>Rating of Employer</h1></center><br>

    <script>
        $("#ratingemployer").rating();

        function ratingEmployerMessage() {
            var ratingemployer = document.getElementById("ratingemployer").value;
            var employercomments = document.getElementById("employercomments").value;

            if (ratingemployer == "") {
                alert("Please rate employer");
                return false;
            }

            if (employercomments.length > 255) {
                alert("Comments about employer must not exceed 255 charachters");
                return false;
            }
            alert("Employer rated successfully");
            return true;
        }
    </script>
</head>
<body>
    <form method="POST" action="../RatingEmployee" onsubmit="return ratingEmployerMessage();">
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="lblEmployerUsername">Employer Username</label>
                <input type="text" class="form-control" id="employerUsername" name="employerUsername" placeholder="Employer Username" value="${employerUsername}" readonly>
            </div>
            <div class="form-group col-md-4">
                <label for="lblTaskId">Task ID</label>
                <input type="text" class="form-control" id="taskId" name="taskId" placeholder="Task ID" value="${taskId}" readonly>
            </div>
            <div class="form-group col-md-4">
                <label for="lblTask">Task</label>
                <input type="text" class="form-control" id="task" name="task" placeholder="Task" value="${task}" readonly>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <br><label for="lblRatingEmployer">Rating of Employer</label>
                <input id="ratingemployer" name="ratingemployer" class="rating rating-loading" data-min="0" data-max="5" data-step="1"><br><br><br><br>
                <button type="submit" class="btn btn-primary" name="button" value="btnEmployeeRatingSubmit">Submit</button>
            </div>
            <div class="form-group col-md-4">
                <br><label for="lblEmployerComments">Comments about Employer</label>
                <textarea class="form-control" rows="5" id="employercomments" name="employercomments" placeholder="Comments about Employer"></textarea>
            </div>
            <div class="form-group col-md-4">
                <br><label for="lblRatedEmployeeUsername">Rated Employee Username</label>
                <input type="text" class="form-control" id="ratedemployeeusername" name="ratedemployeeusername" placeholder="Rated Employee Username" value="${employeeUsername}" readonly>
            </div>
        </div>
    </form>
</body>
</html>

