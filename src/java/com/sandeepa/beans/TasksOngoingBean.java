package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.TasksOngoing;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TasksOngoingBean {

    public String getEmployerUsername() {
        return employerUsername;
    }

    public void setEmployerUsername(String employerUsername) {
        this.employerUsername = employerUsername;
    }

    private String employerUsername;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ArrayList TasksOngoing() {
        ArrayList<TasksOngoing> tasksOngoingList = new ArrayList<TasksOngoing>();

        con = ConnectionManager.getConnection();
        String selectQuery = "SELECT * FROM projectdb2.employertaskoffered WHERE employerusername = '" + employerUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                TasksOngoing tasksOngoing = new TasksOngoing();

                String taskid = rs.getString("taskid");
                tasksOngoing.setTaskid(taskid);

                String task = rs.getString("task");
                tasksOngoing.setTask(task);

                String category = rs.getString("category");
                tasksOngoing.setCategory(category);

                String estimatedvalue = rs.getString("estimatedvalue");
                tasksOngoing.setEstimatedvalue(estimatedvalue);

                Date taskdate = rs.getDate("taskdate");
                tasksOngoing.setTaskdate(taskdate);

                String employerusername = rs.getString("employerusername");
                tasksOngoing.setEmployerusername(employerusername);

                String yourbid = rs.getString("yourbid");
                tasksOngoing.setYourbid(yourbid);

                String employeeusername = rs.getString("employeeusername");
                tasksOngoing.setEmployeeusername(employeeusername);

                tasksOngoingList.add(tasksOngoing);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return tasksOngoingList;
    }
}
