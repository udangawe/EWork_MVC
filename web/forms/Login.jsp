<%-- 
    Document   : Login
    Created on : Oct 30, 2018, 10:50:20 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
            function loadRegistration() {
                window.location = 'Registration.jsp';
            }
        </script>
    <h2><p>${message}</p></h2>
    <h1><center>Login Form</center></h1>
    <style>
        h2 {
            color: red;
        }
    </style>
</head>
<body>
    <form method="POST" action="../Login" autocomplete="off">
        <div class="form-group">
            <div class="form-group col-md-7">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="Username" value="${username}">
            </div>
        </div>
        <div class="form-group">
            <div class="form-group col-md-7">
                <label for="inputPassword">Password</label>
                <input type="password" class="form-control" id="inputPassword" name="inputPassword" placeholder="Password" value="${inputPassword}"><br>
                <button type="submit" class="btn btn-primary">Login</button>
                <button type="button" class="btn btn-primary" onclick="loadRegistration()">Create new account</button>
            </div>
        </div>
        <c:remove var="message"/>
        <c:remove var = "username"/>
        <c:remove var = "inputPassword"/>        
    </form>
</body>
</html>

