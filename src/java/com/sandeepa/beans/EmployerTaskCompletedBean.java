package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.EmployerTaskCompleted;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployerTaskCompletedBean {

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

    public ArrayList EmployerTaskCompleted() {
        ArrayList<EmployerTaskCompleted> employerTaskCompletedList = new ArrayList<EmployerTaskCompleted>();

        con = ConnectionManager.getConnection();
        String selectQuery = "SELECT * FROM projectdb2.employercompletetask WHERE employerusername = '" + employerUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                EmployerTaskCompleted employerTaskCompleted = new EmployerTaskCompleted();

                String taskid = rs.getString("taskid");
                employerTaskCompleted.setTaskid(taskid);

                String task = rs.getString("task");
                employerTaskCompleted.setTask(task);

                String category = rs.getString("category");
                employerTaskCompleted.setCategory(category);

                String estimatedvalue = rs.getString("estimatedvalue");
                employerTaskCompleted.setEstimatedvalue(estimatedvalue);

                Date taskdate = rs.getDate("taskdate");
                employerTaskCompleted.setTaskdate(taskdate);

                String employerusername = rs.getString("employerusername");
                employerTaskCompleted.setEmployerusername(employerusername);

                String yourbid = rs.getString("yourbid");
                employerTaskCompleted.setYourbid(yourbid);

                String employeeusername = rs.getString("employeeusername");
                employerTaskCompleted.setEmployeeusername(employeeusername);

                employerTaskCompletedList.add(employerTaskCompleted);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return employerTaskCompletedList;
    }
}
