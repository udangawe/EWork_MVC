<%-- 
    Document   : AddTask
    Created on : Nov 1, 2018, 11:06:09 AM
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
            $(function () {
                $("#TaskDate").datepicker({
                    changeYear: true,
                    dateFormat: "yy-mm-dd"
                });
            });
        </script>
        <style>
            .ui-datepicker select.ui-datepicker-year {
                color: black;
                font-weight: bold;
            }
        </style>
        <script>
            function validateAddTask() {
                var Task = document.getElementById("Task").value;
                var Category = document.getElementById("Category").value;
                var TaskDate = document.getElementById("TaskDate").value;

                if (Task == "") {
                    alert("Task name must be filled out");
                    return false;
                }
                if (Category == "") {
                    alert("Category must be selected");
                    return false;
                }
                if (TaskDate == "") {
                    alert("Task Date must be filled out");
                    return false;
                }
                alert("Task Added Sucessfully");
                return true;
            }

            function getUploadedFileName() {
                var uploadfile = document.getElementById("uploadfile").value;
                document.getElementById("uploadedfilename").value = uploadfile.replace("C:\\fakepath\\", "");
                document.getElementById("filepath").value = uploadfile;
            }
        </script>
    <center><h1>Add Task</h1></center>
</head>
<body>
    <form method="POST" action="../AddTask" onsubmit="return validateAddTask()" autocomplete="off">
        <div class="form-row">
            <div class="form-group col-md-7">
                <label for="Task">Task</label>
                <input type="text" class="form-control" name="Task" id="Task" placeholder="Task Name">
            </div>
            <div class="form-group col-md-7">
                <label for="Category">Category</label>
                <select id="Category" name="Category" class="form-control">
                    <option value="" selected>Choose Category</option>
                    <option>Category 1</option>
                    <option>Category 2</option>
                    <option>Category 3</option>
                    <option>Category 4</option>
                </select>
            </div>
            <div class="form-group col-md-7">
                <label for="estimatedValue">Estimated Value</label>
                <input type="text" class="form-control" name="estimatedValue" id="estimatedValue" placeholder="Estimated value offered in completion">
            </div>
            <div class="form-group col-md-7">
                <label for="TaskDate">Task Date</label>
                <input type="text" class="form-control" name="TaskDate" id="TaskDate" placeholder="Task Date">
            </div>
            <div class="form-group col-md-7">
                <label for="lblUploadFile">Upload File</label>
                <input type="file" class="form-control-file" id="uploadfile" name="uploadfile" onchange="getUploadedFileName();"><br><br>
                <button type="submit" class="btn btn-primary">Add</button>
                <button type="reset" class="btn btn-primary">Cancel</button>
            </div>
        </div>
        <input type="hidden" name="username" id="username" value="${username}" />
        <input type="hidden" name="uploadedfilename" id="uploadedfilename" />
        <input type="hidden" name="filepath" id="filepath" />
    </form>
</body>
</html>

