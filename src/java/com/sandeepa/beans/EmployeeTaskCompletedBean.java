package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.EmployeeTaskCompleted;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeTaskCompletedBean {

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

    public ArrayList EmployeeTaskCompleted() {
        ArrayList<EmployeeTaskCompleted> employeeTaskCompletedList = new ArrayList<EmployeeTaskCompleted>();

        con = ConnectionManager.getConnection();
        String selectQuery = "SELECT * FROM projectdb2.employeecompletetask WHERE employeeusername = '" + employeeUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                EmployeeTaskCompleted employeeTaskCompleted = new EmployeeTaskCompleted();

                String taskid = rs.getString("taskid");
                employeeTaskCompleted.setTaskid(taskid);

                String task = rs.getString("task");
                employeeTaskCompleted.setTask(task);

                String category = rs.getString("category");
                employeeTaskCompleted.setCategory(category);

                String estimatedvalue = rs.getString("estimatedvalue");
                employeeTaskCompleted.setEstimatedvalue(estimatedvalue);

                Date taskdate = rs.getDate("taskdate");
                employeeTaskCompleted.setTaskdate(taskdate);

                String employerusername = rs.getString("employerusername");
                employeeTaskCompleted.setEmployerusername(employerusername);

                String yourbid = rs.getString("yourbid");
                employeeTaskCompleted.setYourbid(yourbid);

                String employeeusername = rs.getString("employeeusername");
                employeeTaskCompleted.setEmployeeusername(employeeusername);

                employeeTaskCompletedList.add(employeeTaskCompleted);
            }
            stmt.close();

        } catch (SQLException ex) {

        }
        return employeeTaskCompletedList;
    }
}
