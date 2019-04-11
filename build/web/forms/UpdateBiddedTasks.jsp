<%-- 
    Document   : UpdateBiddedTasks
    Created on : Nov 19, 2018, 12:32:01 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script
            src="https://code.jquery.com/jquery-2.2.4.min.js"
            integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
        crossorigin="anonymous"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <center><h1>Update Bidded Tasks</h1></center><br><br>
    <script>
        function displayMessage() {
            alert("Bidded Value is updated successfully");
        }
    </script>
</head>
<body>
    <form method="POST" action="../UpdateBiddedTasks" autocomplete="off">
        <div class="form-row">
            <div class="form-group col-md-2">
                <label for="inputBidValue">Bid Value</label>
                <input type="text" class="form-control" name="bidValue" id="bidValue" value="${yourbid}"><br>
                <button type="submit" class="btn btn-primary" onclick="displayMessage();">Update Bid Value</button>
            </div>
        </div>
        <input type="hidden" name="idbidfortask" value="${idbidfortask}" />
    </form>
</body>
</html>
