package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.OngoingTasks;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OngoingTasksBean {

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }
    private String employeeUsername;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ArrayList OngoingTasks() {
        ArrayList<OngoingTasks> ongoingTasksList = new ArrayList<OngoingTasks>();

        con = ConnectionManager.getConnection();
        String selectQuery = "SELECT * FROM projectdb2.employeetaskoffered WHERE employeeusername = '" + employeeUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                OngoingTasks ongoingTasks = new OngoingTasks();

                String taskid = rs.getString("taskid");
                ongoingTasks.setTaskid(taskid);

                String task = rs.getString("task");
                ongoingTasks.setTask(task);

                String category = rs.getString("category");
                ongoingTasks.setCategory(category);

                String estimatedvalue = rs.getString("estimatedvalue");
                ongoingTasks.setEstimatedvalue(estimatedvalue);

                Date taskdate = rs.getDate("taskdate");
                ongoingTasks.setTaskdate(taskdate);

                String employerusername = rs.getString("employerusername");
                ongoingTasks.setEmployerusername(employerusername);

                String yourbid = rs.getString("yourbid");
                ongoingTasks.setYourbid(yourbid);

                String employeeusername = rs.getString("employeeusername");
                ongoingTasks.setEmployeeusername(employeeusername);

                ongoingTasksList.add(ongoingTasks);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return ongoingTasksList;
    }
}
