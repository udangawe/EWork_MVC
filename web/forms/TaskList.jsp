<%-- 
    Document   : TaskList
    Created on : Nov 2, 2018, 11:44:58 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
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
                $("#fromDate").datepicker({
                    dateFormat: "yy-mm-dd",
                    changeYear: true
                });
                $("#toDate").datepicker({
                    dateFormat: "yy-mm-dd",
                    changeYear: true
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
            function resetPage() {
                window.location = 'TaskList.jsp';
            }

            function validateTaskList() {
                var fromDate = document.getElementById("fromDate").value;
                var toDate = document.getElementById("toDate").value;

                if ((fromDate == "") && (toDate != "")) {
                    alert("If you fill To Date you should fill From Date also");
                    return false;
                }
                if ((fromDate != "") && (toDate == "")) {
                    alert("If you fill From Date you should fill To Date also");
                    return false;
                }
                return true;
            }

            function getTaskListTbDetails(x) {
                var rindex = x.rowIndex;
                var hiddenEmployerUsername = document.getElementById("taskListTb").rows[rindex].cells[6].innerHTML;
                var hiddenTaskId = document.getElementById("taskListTb").rows[rindex].cells[1].innerHTML;
                var hiddenCategory = document.getElementById("taskListTb").rows[rindex].cells[3].innerHTML;
                var hiddenTaskDate = document.getElementById("taskListTb").rows[rindex].cells[5].innerHTML;
                var hiddenEstimatedVal = document.getElementById("taskListTb").rows[rindex].cells[4].innerHTML;
                var hiddenFileName = document.getElementById("taskListTb").rows[rindex].cells[7].innerHTML;
                var hiddenTaskName = document.getElementById("taskListTb").rows[rindex].cells[2].innerHTML;

                document.getElementById("hiddenEmployerUsername").value = hiddenEmployerUsername;
                document.getElementById("hiddenTaskId").value = hiddenTaskId;
                document.getElementById("hiddenCategory").value = hiddenCategory;
                document.getElementById("hiddenTaskDate").value = hiddenTaskDate;
                document.getElementById("hiddenEstimatedVal").value = hiddenEstimatedVal;
                document.getElementById("hiddenFileName").value = hiddenFileName;
                document.getElementById("hiddenTaskName").value = hiddenTaskName;

                //window.open("TaskDetails.jsp");
            }
        </script>
    <center><h1>Task List</h1></center>
</head>
<body>
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/projectdb2"
        user="root" password="root"
        />

    <sql:setDataSource dataSource="${myDS}" />

    <c:if test="${empty Category && empty taskId && empty fromDate && empty toDate && empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask ORDER BY taskdate DESC;
        </sql:query>
    </c:if>
    <c:if test="${not empty Category && empty taskId && empty fromDate && empty toDate && empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE category = ? ORDER BY taskdate DESC;
            <sql:param value="${Category}" />
        </sql:query>
    </c:if>    
    <c:if test="${empty Category && not empty taskId && empty fromDate && empty toDate && empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE taskid = ? ORDER BY taskdate DESC;
            <sql:param value="${taskId}" />
        </sql:query>
    </c:if>
    <c:if test="${empty Category && empty taskId && not empty fromDate && not empty toDate && empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE taskdate BETWEEN ? AND ?;
            <sql:param value="${fromDate}" />
            <sql:param value="${toDate}" />
        </sql:query>
    </c:if>
    <c:if test="${empty Category && empty taskId && empty fromDate && empty toDate && not empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE estimatedvalue = ? ORDER BY taskdate DESC;
            <sql:param value="${estimatedVal}" />
        </sql:query>
    </c:if>  
    <c:if test="${not empty Category && not empty taskId && empty fromDate && empty toDate && empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE taskid = ? && category = ? ORDER BY taskdate DESC;
            <sql:param value="${taskId}" />
            <sql:param value="${Category}" />
        </sql:query>
    </c:if>   
    <c:if test="${not empty Category && empty taskId && not empty fromDate && not empty toDate && empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE taskdate BETWEEN ? AND ? && category = ? ORDER BY taskdate DESC;
            <sql:param value="${fromDate}" />
            <sql:param value="${toDate}" />
            <sql:param value="${Category}" />
        </sql:query>
    </c:if>
    <c:if test="${not empty Category && empty taskId && empty fromDate && empty toDate && not empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE category = ? && estimatedvalue = ? ORDER BY taskdate DESC;
            <sql:param value="${Category}" />
            <sql:param value="${estimatedVal}" />
        </sql:query>
    </c:if>
    <c:if test="${empty Category && not empty taskId && not empty fromDate && not empty toDate && empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE taskid = ? && taskdate BETWEEN ? AND ? ORDER BY taskdate DESC;
            <sql:param value="${taskId}" />
            <sql:param value="${fromDate}" />
            <sql:param value="${toDate}" />
        </sql:query>
    </c:if>
    <c:if test="${empty Category && empty taskId && not empty fromDate && not empty toDate && not empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE taskdate BETWEEN ? AND ? && estimatedvalue = ? ORDER BY taskdate DESC;
            <sql:param value="${fromDate}" />
            <sql:param value="${toDate}" />
            <sql:param value="${estimatedVal}" />
        </sql:query>
    </c:if>
    <c:if test="${empty Category && not empty taskId && empty fromDate && empty toDate && not empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE taskid = ? && estimatedvalue = ? ORDER BY taskdate DESC;
            <sql:param value="${taskId}" />
            <sql:param value="${estimatedVal}" />
        </sql:query>
    </c:if>
    <c:if test="${not empty Category && not empty taskId && not empty fromDate && not empty toDate && empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE category = ? && taskdate BETWEEN ? AND ? && taskid = ? ORDER BY taskdate DESC;
            <sql:param value="${Category}" />
            <sql:param value="${fromDate}" />
            <sql:param value="${toDate}" />
            <sql:param value="${taskId}" />
        </sql:query>
    </c:if>
    <c:if test="${empty Category && not empty taskId && not empty fromDate && not empty toDate && not empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE taskdate BETWEEN ? AND ? && taskid = ? && estimatedvalue = ? ORDER BY taskdate DESC;
            <sql:param value="${fromDate}" />
            <sql:param value="${toDate}" />
            <sql:param value="${taskId}" />
            <sql:param value="${estimatedVal}" />
        </sql:query>
    </c:if>
    <c:if test="${not empty Category && not empty taskId && empty fromDate && empty toDate && not empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE category = ? && taskid = ? && estimatedvalue = ? ORDER BY taskdate DESC;
            <sql:param value="${Category}" />
            <sql:param value="${taskId}" />
            <sql:param value="${estimatedVal}" />
        </sql:query>
    </c:if>
    <c:if test="${not empty Category && empty taskId && not empty fromDate && not empty toDate && not empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE category = ? && taskdate BETWEEN ? AND ? && estimatedvalue = ? ORDER BY taskdate DESC;
            <sql:param value="${Category}" />
            <sql:param value="${fromDate}" />
            <sql:param value="${toDate}" />
            <sql:param value="${estimatedVal}" />
        </sql:query>
    </c:if>
    <c:if test="${not empty Category && not empty taskId && not empty fromDate && not empty toDate && not empty estimatedVal}">
        <sql:query var="listTasks">
            SELECT * FROM projectdb2.addtask WHERE category = ? && taskid = ? && taskdate BETWEEN ? AND ? && estimatedvalue = ? ORDER BY taskdate DESC;
            <sql:param value="${Category}" />
            <sql:param value="${taskId}" />
            <sql:param value="${fromDate}" />
            <sql:param value="${toDate}" />
            <sql:param value="${estimatedVal}" />
        </sql:query>
    </c:if>        

    <form method="POST" action="../TaskList" onsubmit="return validateTaskList()" autocomplete="off">
        <div class="form-row">
            <div class="form-group col-md-2">
                <label for="Category">Category</label>
                <select id="Category" name="Category" class="form-control">
                    <option value="" selected>Choose Category</option>
                    <option>Category 1</option>
                    <option>Category 2</option>
                    <option>Category 3</option>
                    <option>Category 4</option>
                </select><br>
                <button type="submit" class="btn btn-primary" name="button" value="selectBtn">Select</button>
                <button type="reset" class="btn btn-primary" onclick="resetPage()">Reset</button>
            </div>
            <div class="form-group col-md-2">
                <label for="taskId">Task ID</label>
                <input type="text" class="form-control" id="taskId" name="taskId" placeholder="Task ID">
            </div>
            <div class="form-group col-md-2">
                <label for="fromDate">From Date</label>
                <input type="text" class="form-control" id="fromDate" name="fromDate" placeholder="From Date">
            </div>
            <div class="form-group col-md-2">
                <label for="toDate">To Date</label>
                <input type="text" class="form-control" id="toDate" name="toDate" placeholder="To Date">
            </div>
            <div class="form-group col-md-3">
                <label for="estimatedVal">Estimated Value</label>
                <input type="text" class="form-control" id="estimatedVal" name="estimatedVal" placeholder="Estimated Value">
            </div>
        </div>
        <div class="form-row">
            <div class="form-group col-md-12">
                <div class="table-responsive">
                    <br><table class="table" id="taskListTb">
                        <thead>
                            <tr>
                                <th></th>
                                <th>Task ID</th>
                                <th>Task Name</th>
                                <th>Category</th>
                                <th>Estimated Value</th>
                                <th>Task Date</th>
                                <th style="display: none;">UserName</th>
                                <th style="display: none;">File Name</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="user" items="${listTasks.rows}">
                                <tr onclick="getTaskListTbDetails(this)">
                                    <td><button type="submit" class="btn btn-primary" name="button" value="detailsBtn">Details</button></td>
                                    <td><c:out value="${user.taskid}" /></td>
                                    <td><c:out value="${user.task}" /></td>
                                    <td><c:out value="${user.category}" /></td>
                                    <td><c:out value="${user.estimatedvalue}" /></td>
                                    <td><c:out value="${user.taskdate}" /></td>
                                    <td style="display: none;"><c:out value="${user.username}" /></td>
                                    <td style="display: none;"><c:out value="${user.uploadedfilename}" /></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>    
        </div>
        <input type="hidden" id="hiddenEmployerUsername" name="hiddenEmployerUsername" />
        <input type="hidden" id="hiddenTaskId" name="hiddenTaskId" />
        <input type="hidden" id="hiddenCategory" name="hiddenCategory" />
        <input type="hidden" id="hiddenTaskDate" name="hiddenTaskDate" />
        <input type="hidden" id="hiddenEstimatedVal" name="hiddenEstimatedVal" />
        <input type="hidden" id="hiddenEmployeeUsername" name="hiddenEmployeeUsername" value="${employeeUsername}" />
        <input type="hidden" id="hiddenFileName" name="hiddenFileName" />
        <input type="hidden" id="hiddenTaskName" name="hiddenTaskName" />

        <c:remove var="Category" scope="session" />
        <c:remove var="taskId" scope="session" />
        <c:remove var="fromDate" scope="session" />
        <c:remove var="toDate" scope="session" />
        <c:remove var="estimatedVal" scope="session" />
    </form>
</body>
</html>

