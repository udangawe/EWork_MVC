package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UpdateTaskAddedBean {

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
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getEstimateVal() {
        return estimateVal;
    }

    public void setEstimateVal(String estimateVal) {
        this.estimateVal = estimateVal;
    }

    public String getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(String taskDate) {
        this.taskDate = taskDate;
    }

    private String taskId;
    private String task;
    private String Category;
    private String estimateVal;
    private String taskDate;

    Connection con = null;
    PreparedStatement preparedStmt = null;

    public boolean UpdateTaskAdded() {
        boolean flag = false;

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = sdf.parse(taskDate);
            java.sql.Date sqlTaskDate = new java.sql.Date(date.getTime());

            con = ConnectionManager.getConnection();
            String updateTaskAddedQuery = "update addtask set task = ?, category = ?, estimatedvalue = ?, taskdate = ? where taskid = ?";
            try {
                preparedStmt = con.prepareStatement(updateTaskAddedQuery);
                preparedStmt.setString(1, task);
                preparedStmt.setString(2, Category);
                preparedStmt.setString(3, estimateVal);
                preparedStmt.setDate(4, sqlTaskDate);
                preparedStmt.setString(5, taskId);

                if (preparedStmt.executeUpdate() > 0) {
                    flag = true;
                }
                con.close();

            } catch (SQLException ex) {

            }

        } catch (ParseException ex) {

        }

        return flag;
    }
}
