<%-- 
    Document   : UpdateEmployeeProfile
    Created on : Nov 15, 2018, 7:44:09 PM
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

    <center><h1>Update Employee Profile</h1></center><br><br>
    <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
          rel = "stylesheet">
    <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
    <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

    <script>
        $(function () {
            $("#birthday").datepicker({
                dateFormat: "yy-mm-dd",
                changeYear: true
            });
        });
    </script>
    <style>
        .ui-datepicker select.ui-datepicker-year {
            color: black;
            font-size: 16px;
            font-weight: bold;
        }
    </style>
    <input type="hidden" name="selectedGender" id="selectedGender" value="${gender}" />
    <input type="hidden" name="disableUpdateBtn" id="disableUpdateBtn" value="${disableUpdateBtn}" />
    <script>
        function SelectElement(id, valueToSelect)
        {
            var element = document.getElementById(id);
            element.value = valueToSelect;
        }

        var selectedGender = document.getElementById("selectedGender").value;

        function selectGender() {
            SelectElement("gender", selectedGender);
        }

        function displayMessage() {
            alert("Employee Profile Updated Successfully");
        }

        function disableUpdateBtn() {
            var disableUpdateBtn = document.getElementById("disableUpdateBtn").value;

            if (disableUpdateBtn != "") {
                document.getElementById("btnUpdateEmployer").disabled = true;
            }
        }
    </script>
</head>
<body onload="selectGender();disableUpdateBtn();">
    <form method="POST" action="../UpdateEmployeeProfile" autocomplete="off">
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="lblFirstName">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" placeholder="First Name" value="${firstname}">
            </div>
            <div class="form-group col-md-4">
                <label for="lblLastName">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name" value="${lastname}">
            </div>
            <div class="form-group col-md-4">
                <label for="inputEmail">Email</label>
                <input type="email" class="form-control" id="inputEmail" name="inputEmail" placeholder="Email" value="${email}"><br>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="lblPhoneNumber">Phone Number</label>
                <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="Phone Number" value="${phone_number}">
            </div>
            <div class="form-group col-md-4">
                <label for="lblBirthDate">Birth Date</label>
                <input type="text" class="form-control" id="birthday" name="birthday" placeholder="Birth Date" value="${birthdate}">
            </div>
            <div class="form-group col-md-4">
                <label for="gender">Your Gender</label>
                <select class="form-control" id="gender" name="gender">
                    <option>Male</option>
                    <option>Female</option>
                </select><br>
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4">
                <label for="lblCountry">Country</label>
                <input type="text" class="form-control" id="country" name="country" placeholder="Country" value="${country}"><br>
                <button type="submit" class="btn btn-primary" name="btnUpdateEmployer" id="btnUpdateEmployer" onclick="displayMessage();">Update</button>
            </div>
            <div class="form-group col-md-4">
                <label for="lblCity">City</label>
                <input type="text" class="form-control" id="city" name="city" placeholder="City" value="${city}">
            </div>
        </div>
        <input type="hidden" name="employeeUsername" value="${employeeUsername}" />
    </form>
</body>
</html>

