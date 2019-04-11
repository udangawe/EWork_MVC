package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.JobsCompleted;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JobsCompletedBean {

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

    public ArrayList JobsCompleted() {
        ArrayList<JobsCompleted> jobsCompletedList = new ArrayList<>();

        con = ConnectionManager.getConnection();
        String employeeCompleteTaskQuery = "SELECT * FROM projectdb2.employeecompletetask WHERE employeeusername = '" + employeeUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(employeeCompleteTaskQuery);
            while (rs.next()) {
                JobsCompleted jobsCompleted = new JobsCompleted();

                String taskid = rs.getString("taskid");
                jobsCompleted.setTaskid(taskid);

                String task = rs.getString("task");
                jobsCompleted.setTask(task);

                String category = rs.getString("category");
                jobsCompleted.setCategory(category);

                String estimatedvalue = rs.getString("estimatedvalue");
                jobsCompleted.setEstimatedvalue(estimatedvalue);

                Date taskdate = rs.getDate("taskdate");
                jobsCompleted.setTaskdate(taskdate);

                String employerusername = rs.getString("employerusername");
                jobsCompleted.setEmployerusername(employerusername);

                String yourbid = rs.getString("yourbid");
                jobsCompleted.setYourbid(yourbid);

                String employeeusername = rs.getString("employeeusername");
                jobsCompleted.setEmployeeusername(employeeusername);

                jobsCompletedList.add(jobsCompleted);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return jobsCompletedList;
    }
}
