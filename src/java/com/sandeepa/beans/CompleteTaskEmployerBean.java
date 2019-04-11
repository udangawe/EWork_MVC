package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CompleteTaskEmployerBean {

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(String estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    public String getEmployerusername() {
        return employerusername;
    }

    public void setEmployerusername(String employerusername) {
        this.employerusername = employerusername;
    }

    public String getYourBid() {
        return yourBid;
    }

    public void setYourBid(String yourBid) {
        this.yourBid = yourBid;
    }

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

    private String taskId;
    private String task;
    private String category;
    private String estimatedValue;
    private String taskDate;
    private String employerusername;
    private String yourBid;
    private String employeeUsername;

    Connection con = null;
    Statement stmt = null;
    PreparedStatement preparedStmt;

    public boolean EmployerCompleteTask() {
        boolean flag = false;

        con = ConnectionManager.getConnection();
        String sql = "INSERT INTO employercompletetask (taskid, task, category, estimatedvalue, taskdate, employerusername, yourbid, employeeusername) "
                + "VALUES ('" + taskId + "', '" + task + "', '" + category + "', '" + estimatedValue + "', '" + taskDate + "', '" + employerusername + "', '" + yourBid + "', '" + employeeUsername + "')";

        try {
            stmt = con.createStatement();
            if (stmt.executeUpdate(sql) > 0) {
                flag = true;
            }
        } catch (SQLException ex) {

        }
        return flag;
    }

    public boolean DeleteEmployerTaskOffered() {
        boolean flag = false;

        con = ConnectionManager.getConnection();
        String sql = "delete from employertaskoffered where taskid = '" + taskId + "'";

        try {
            stmt = con.createStatement();
            if (stmt.executeUpdate(sql) > 0) {
                flag = true;
            }
        } catch (SQLException ex) {

        }
        return flag;
    }
}
