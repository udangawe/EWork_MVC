package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class RatingEmployeeBean {

    public String getEmployerUsername() {
        return employerUsername;
    }

    public void setEmployerUsername(String employerUsername) {
        this.employerUsername = employerUsername;
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

    public String getRatingemployer() {
        return ratingemployer;
    }

    public void setRatingemployer(String ratingemployer) {
        this.ratingemployer = ratingemployer;
    }

    public String getEmployercomments() {
        return employercomments;
    }

    public void setEmployercomments(String employercomments) {
        this.employercomments = employercomments;
    }

    public String getRatedemployeeusername() {
        return ratedemployeeusername;
    }

    public void setRatedemployeeusername(String ratedemployeeusername) {
        this.ratedemployeeusername = ratedemployeeusername;
    }

    private String employerUsername;
    private String taskId;
    private String task;
    private String ratingemployer;
    private String employercomments;
    private String ratedemployeeusername;

    Connection con = null;
    Statement stmt = null;

    public boolean RatingEmployee() {
        boolean flag = false;

        con = ConnectionManager.getConnection();
        String sql = "INSERT INTO ratingemployee (employerusername, taskid, task, ratingofemployer, employercomments, ratedemployeeusername) "
                + "VALUES ('" + employerUsername + "', '" + taskId + "', '" + task + "', '" + ratingemployer + "', '" + employercomments + "', '" + ratedemployeeusername + "')";

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
