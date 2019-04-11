package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RatingEmployerBean {

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }

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

    public String getRatingemployee() {
        return ratingemployee;
    }

    public void setRatingemployee(String ratingemployee) {
        this.ratingemployee = ratingemployee;
    }

    public String getEmployeecomments() {
        return employeecomments;
    }

    public void setEmployeecomments(String employeecomments) {
        this.employeecomments = employeecomments;
    }

    public String getRatedemployerusername() {
        return ratedemployerusername;
    }

    public void setRatedemployerusername(String ratedemployerusername) {
        this.ratedemployerusername = ratedemployerusername;
    }

    private String employeeUsername;
    private String taskId;
    private String task;
    private String ratingemployee;
    private String employeecomments;
    private String ratedemployerusername;

    Connection con = null;
    Statement stmt = null;

    public boolean RatingEmployer() {
        boolean flag = false;

        con = ConnectionManager.getConnection();
        String sql = "INSERT INTO ratingemployer (employeeusername, taskid, task, ratingofemployee, employeecomments, ratedemployerusername) "
                + "VALUES ('" + employeeUsername + "', '" + taskId + "', '" + task + "', '" + ratingemployee + "', '" + employeecomments + "', '" + ratedemployerusername + "')";

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
