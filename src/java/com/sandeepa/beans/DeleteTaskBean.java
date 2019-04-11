package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTaskBean {

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    private String taskId;

    Connection con = null;
    PreparedStatement preparedStmt = null;

    public boolean DeleteTask() {
        boolean flag = false;

        con = ConnectionManager.getConnection();
        String deleteTaskQuery = "delete from addtask where taskid = ?";
        try {
            preparedStmt = con.prepareStatement(deleteTaskQuery);
            preparedStmt.setString(1, taskId);
            if (preparedStmt.executeUpdate() > 0) {
                flag = true;
            }

            con.close();

        } catch (SQLException ex) {

        }

        return flag;
    }
}
