package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.JobsOffered;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JobsOfferedBean {

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

    public ArrayList JobsOffered() {
        ArrayList jobsOfferedList = new ArrayList();

        con = ConnectionManager.getConnection();
        String jobsOfferedQuery = "SELECT * FROM projectdb2.employercompletetask WHERE employerusername = '" + employerUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(jobsOfferedQuery);
            while (rs.next()) {
                JobsOffered jobsOffered = new JobsOffered();

                String taskid = rs.getString("taskid");
                jobsOffered.setTaskid(taskid);

                String task = rs.getString("task");
                jobsOffered.setTask(task);

                String category = rs.getString("category");
                jobsOffered.setCategory(category);

                String estimatedvalue = rs.getString("estimatedvalue");
                jobsOffered.setEstimatedvalue(estimatedvalue);

                Date taskdate = rs.getDate("taskdate");
                jobsOffered.setTaskdate(taskdate);

                String employerusername = rs.getString("employerusername");
                jobsOffered.setEmployerusername(employerusername);

                String yourbid = rs.getString("yourbid");
                jobsOffered.setYourbid(yourbid);

                String employeeusername = rs.getString("employeeusername");
                jobsOffered.setEmployeeusername(employeeusername);

                jobsOfferedList.add(jobsOffered);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return jobsOfferedList;
    }
}
