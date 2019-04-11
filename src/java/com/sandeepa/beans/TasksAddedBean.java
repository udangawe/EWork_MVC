package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.TaskAdded;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TasksAddedBean {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ArrayList TasksAdded() {

        ArrayList<TaskAdded> taskAddedList = new ArrayList<TaskAdded>();

        con = ConnectionManager.getConnection();
        String selectQuery = "SELECT * FROM projectdb2.addtask WHERE username = '" + username + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                TaskAdded taskAdded = new TaskAdded();

                String taskid = rs.getString("taskid");
                taskAdded.setTaskid(taskid);

                String task = rs.getString("task");
                taskAdded.setTask(task);

                String category = rs.getString("category");
                taskAdded.setCategory(category);

                String estimatedvalue = rs.getString("estimatedvalue");
                taskAdded.setEstimatedvalue(estimatedvalue);

                Date taskdate = rs.getDate("taskdate");
                taskAdded.setTaskdate(taskdate);

                String employerusername = rs.getString("username");
                taskAdded.setEmployerusername(employerusername);

                String uploadedfilename = rs.getString("uploadedfilename");
                taskAdded.setUploadedfilename(uploadedfilename);

                taskAddedList.add(taskAdded);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return taskAddedList;
    }
}
