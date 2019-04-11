package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;

public class AddTaskBean {

    public Part getFilePart() {
        return filePart;
    }

    public void setFilePart(Part filePart) {
        this.filePart = filePart;
    }

    public String getTask() {
        return Task;
    }

    public void setTask(String Task) {
        this.Task = Task;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(String estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public String getTaskDate() {
        return TaskDate;
    }

    public void setTaskDate(String TaskDate) {
        this.TaskDate = TaskDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUniqueTaskID() {
        return uniqueTaskID;
    }

    public void setUniqueTaskID(String uniqueTaskID) {
        this.uniqueTaskID = uniqueTaskID;
    }

    public String getUploadedfilename() {
        return uploadedfilename;
    }

    public void setUploadedfilename(String uploadedfilename) {
        this.uploadedfilename = uploadedfilename;
    }

    private String Task;
    private String Category;
    private String estimatedValue;
    private String TaskDate;
    private String username;
    private String uniqueTaskID;
    private String uploadedfilename;
    private Part filePart;

    Connection con = null;
    Statement stmt = null;

    InputStream inputStream = null;

    public boolean addTask() throws IOException {
        if (filePart != null) {
            inputStream = filePart.getInputStream();
        }

        boolean flag = false;

        con = ConnectionManager.getConnection();

        String sql = "INSERT INTO addtask (taskid, task, category, estimatedvalue, taskdate, username, uploadedfile, uploadedfilename) "
                + "VALUES ('" + uniqueTaskID + "', '" + Task + "', '" + Category + "', '" + estimatedValue + "', '" + TaskDate + "', '" + username + "', '" + inputStream + "', '" + uploadedfilename + "')";

        try {
            stmt = con.createStatement();
            if (stmt.executeUpdate(sql) > 0) {
                flag = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AddTaskBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
}
