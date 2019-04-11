<%-- 
    Document   : HomePage
    Created on : Mar 3, 2019, 12:42:34 PM
    Author     : Sachuzzz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

        <script>
            function loadLoginPage() {
                window.location = "Login.jsp";
            }
        </script>
    </head>
    <body>
        <div class="container">
            <center><h1>Home Page</h1></center><br><br>

            <button type="button" class="btn btn-primary" onclick="loadLoginPage();">Login Page</button>
        </div>
    </body>
</html>
