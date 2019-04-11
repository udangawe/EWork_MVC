<%-- 
    Document   : UpdateTaskAdded
    Created on : Nov 14, 2018, 11:35:45 PM
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

        <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
              rel = "stylesheet">
        <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
        <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

        <script>
            $(function () {
                $("#taskDate").datepicker({
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

    <input type="hidden" name="hiddenCategory" id="hiddenCategory" value="${category}" />
    <script>
        var hiddenCategory = document.getElementById("hiddenCategory").value;

        function selectCategory() {
            SelectElement("Category", hiddenCategory);
        }

        function SelectElement(id, valueToSelect) {
            var element = document.getElementById(id);
            element.value = valueToSelect;
        }

        function EditMessage() {
            alert("Task edited successfully");
        }
    </script>
    <center><h1>Update Task Added</h1></center><br>
</head>
<body onload="selectCategory();">
    <form method="POST" action="../UpdateTaskAdded" autocomplete="off">
        <input type="hidden" name="taskId" value="${taskId}" />
        <div class="form-row">
            <div class="form-group col-md-3">
                <label for="lblTask">Task</label>
                <input type="text" class="form-control" id="task" name="task" placeholder="Task" value="${task}"><br>
                <button type="submit" class="btn btn-primary" onclick="EditMessage();">Edit Task</button>
            </div>
            <div class="form-group col-md-3">
                <label for="Category">Category</label>
                <select id="Category" name="Category" class="form-control">
                    <option value="" selected>Choose Category</option>
                    <option>Category 1</option>
                    <option>Category 2</option>
                    <option>Category 3</option>
                    <option>Category 4</option>
                </select>
            </div>
            <div class="form-group col-md-3">
                <label for="lblEstimatedValue">Estimated Value</label>
                <input type="text" class="form-control" id="estimateVal" name="estimateVal" placeholder="Estimated Value" value="${estimatedVal}"><br>
            </div>
            <div class="form-group col-md-3">
                <label for="lblTaskDate">Task Date</label>
                <input type="text" class="form-control" id="taskDate" name="taskDate" placeholder="Task Date" value="${taskDate}">
            </div>
        </div>
    </form>
</body>
</html>

