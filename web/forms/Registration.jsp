<%-- 
    Document   : Registration
    Created on : Oct 29, 2018, 1:42:36 PM
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
            function previewFile() {
                var preview = document.querySelector('img');
                var file = document.querySelector('input[type=file]').files[0];
                var reader = new FileReader();

                reader.onloadend = function () {
                    preview.src = reader.result;
                };

                if (file) {
                    reader.readAsDataURL(file);
                } else {
                    preview.src = "";
                }
            }
        </script>
        <script>
            $(function () {
                $("#birthday").datepicker({
                    changeYear: true,
                    dateFormat: "yy-mm-dd"
                });
            });
        </script>
        <style type="text/css">
            .ui-datepicker select.ui-datepicker-year{
                color: black;
            }
        </style>
        <script>
            function clearImage() {
                document.getElementById('myImage').removeAttribute('src');
            }
        </script>
        <script>
            function validateForm() {
                var firstName = document.forms["regForm"]["firstName"].value;
                var lastName = document.forms["regForm"]["lastName"].value;
                var inputEmail = document.forms["regForm"]["inputEmail"].value;
                var inputUsername = document.forms["regForm"]["inputUsername"].value;
                var inputPassword = document.forms["regForm"]["inputPassword"].value;
                var retypePassword = document.forms["regForm"]["retypePassword"].value;

                if (firstName == "") {
                    alert("First Name must be filled out");
                    return false;
                }
                if (lastName == "") {
                    alert("Last Name must be filled out");
                    return false;
                }
                if (inputEmail == "") {
                    alert("Email must be filled out");
                    return false;
                }

                var atpos = inputEmail.indexOf("@");
                var dotpos = inputEmail.lastIndexOf(".");
                if (atpos < 1 || (dotpos - atpos < 2)) {
                    alert("Please enter correct email");
                    return false;
                }

                if (inputUsername == "") {
                    alert("Please enter your username");
                    return false;
                }

                if ((inputUsername.length < 5) || (inputUsername.length > 15)) {
                    alert("Username must be more than 5 characters and less than 15 characters");
                    return false;
                }

                var illegalChars = /\W/;
                if (illegalChars.test(inputUsername)) {
                    alert("The username contains illegal characters");
                    return false;
                }

                if (inputPassword == "") {
                    alert("Please enter your password");
                    return false;
                }

                if (inputPassword != retypePassword) {
                    alert("Please confirm your password is correct");
                    return false;
                }

                var radioEmployer = document.getElementById("radioEmployer").checked;
                var radioEmployee = document.getElementById("radioEmployee").checked;
                if ((radioEmployer == false) && (radioEmployee == false)) {
                    alert("Please fill your status");
                    return false;
                }

                return true;
            }

            function clearParagraph() {
                document.getElementById("regpid").innerHTML = "";
            }
        </script>
        <style>
            h2 {
                color: red;
            }
        </style>
    <h2><p id="regpid"></p></h2>
    <h1><center>Registration Form</center></h1><br>
</head>
<body>
    <form method="POST" action="../Registration" name="regForm" onsubmit="return validateForm()" autocomplete="off">
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="firstName">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" placeholder="First Name">
            </div>
            <div class="form-group col-md-4">
                <label for="lastName">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="inputEmail">Email</label>
                <input type="email" class="form-control" id="inputEmail" name="inputEmail" placeholder="Email">
            </div>
            <div class="form-group col-md-4">
                <label for="inputUsername">Username</label>
                <input type="text" class="form-control" id="inputUsername" name="inputUsername" placeholder="Username">
            </div>
            <div class="form-group col-md-4">
                <label for="inputPassword">Password</label>
                <input type="password" class="form-control" id="inputPassword" name="inputPassword" placeholder="Password">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="retypePassword">Retype Password</label>
                <input type="password" class="form-control" id="retypePassword" name="retypePassword" placeholder="Retype Password">
            </div>
            <div class="form-group col-md-4">
                <label for="phoneNumber">Phone Number</label>
                <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="Phone Number">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="birthday">Your Birthday</label>
                <input type="text" class="form-control" id="birthday" name="birthday" placeholder="Your Birthday">
            </div>
            <div class="form-group col-md-4">
                <label for="gender">Your Gender</label>
                <select class="form-control" id="gender" name="gender">
                    <option>Male</option>
                    <option>Female</option>
                </select>
            </div>
            <div class="form-group col-md-4">
                <label for="country">Country</label>
                <input type="text" class="form-control" id="country" name="country" placeholder="Country">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="city">City</label>
                <input type="text" class="form-control" id="city" name="city" placeholder="City">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-1">
                <label for="radioStatus">Status</label>
            </div>
            <div class="form-group col-md-3">
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="radioEmployer" value="Employer">
                    <label class="form-check-label" for="radioEmployer">Employer</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="radioEmployee" value="Employee">
                    <label class="form-check-label" for="radioEmployee">Employee</label>
                </div>
            </div>
            <div class="form-group col-md-5">
                <br><input type="file" onchange="previewFile()" class="form-control-file" id="uploadImage" name="uploadImage">
                <img src="" class="img-thumbnail" height="200" alt="Upload Image" id="myImage"><br><br>
                <button type="submit" class="btn btn-primary">Create Account</button>
                <button type="reset" class="btn btn-primary" onclick="clearImage(); clearParagraph();">Reset</button>
            </div>
        </div>
    </form>
</body>
</html>

