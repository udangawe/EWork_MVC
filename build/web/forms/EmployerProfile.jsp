<%-- 
    Document   : EmployerProfile
    Created on : Nov 8, 2018, 8:36:53 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

    <center><h1>Employer Profile</h1></center><br>

    <script>
        $("#ratingemployer").rating();
    </script>
</head>
<body>
    <form method="POST" action="../EmployerProfile">
        <input type="hidden" name="btnUpdateEmployerDisable" id="btnUpdateEmployerDisable" value="${disableEmployerUpdate}" />

        <input type="hidden" name="username" value="${username}" />
        <div class="container">
            <div class="row">
                <div class="col-md-7 offset-md-3">
                    <label for="lblEmployerFullName">Employer Full Name</label>
                    <input type="text" class="form-control" id="employerfullname" placeholder="Employer Full Name" value="${employerfullname}" readonly="readonly"><br><br>
                </div>
                <div class="col-md-7 offset-md-3">
                    <label for="lblRatingEmployer">Rating as Employer</label>
                    <input id="ratingemployer" name="ratingemployer" class="rating rating-loading" data-min="0" data-max="5" data-step="1" value="${employerratingavg}" disabled><br>
                </div>
            </div>
            <div class="row">
                <div class="col-md-7 offset-md-3">
                    <button type="submit" class="btn btn-primary" name="button" value="btnEmployeeReviews">Employee Reviews</button><br><br>
                </div>
                <div class="col-md-7 offset-md-3">
                    <button type="submit" class="btn btn-primary" name="button" value="btnJobsOffered">Jobs Offered</button><br><br>
                </div>
                <div class="col-md-7 offset-md-3">
                    <button type="submit" class="btn btn-primary" name="button" value="btnUpdateEmployerProfile" id="btnUpdateEmployerProfile">View Employer Details</button>
                </div>
            </div>
        </div>
    </form>
    <c:remove var="disableEmployerUpdate" scope="session" /> 
</body>
</html>

