package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class OfferTaskBean {

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
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEstimatedvalue() {
        return estimatedvalue;
    }

    public void setEstimatedvalue(String estimatedvalue) {
        this.estimatedvalue = estimatedvalue;
    }

    public String getTaskdate() {
        return taskdate;
    }

    public void setTaskdate(String taskdate) {
        this.taskdate = taskdate;
    }

    public String getEmployerusername() {
        return employerusername;
    }

    public void setEmployerusername(String employerusername) {
        this.employerusername = employerusername;
    }

    public String getYourbid() {
        return yourbid;
    }

    public void setYourbid(String yourbid) {
        this.yourbid = yourbid;
    }

    public String getEmployeeusername() {
        return employeeusername;
    }

    public void setEmployeeusername(String employeeusername) {
        this.employeeusername = employeeusername;
    }

    private String taskId;
    private String task;
    private String category;
    private String estimatedvalue;
    private String taskdate;
    private String employerusername;
    private String yourbid;
    private String employeeusername;

    Connection con = null;
    Statement stmt = null;
    PreparedStatement preparedStmt = null;

    public boolean EmployerTaskOffered() {
        boolean flag = false;

        con = ConnectionManager.getConnection();
        String sql = "INSERT INTO projectdb2.employertaskoffered (taskid, task, category, estimatedvalue, taskdate, employerusername, yourbid, employeeusername) VALUES ('" + taskId + "', '" + task + "', '" + category + "', '" + estimatedvalue + "', '" + taskdate + "', '" + employerusername + "', '" + yourbid + "', '" + employeeusername + "')";

        try {
            stmt = con.createStatement();
            if (stmt.executeUpdate(sql) > 0) {
                flag = true;
            }

        } catch (SQLException ex) {

        }
        return flag;
    }

    public boolean EmployeeTaskOffered() {
        boolean flag = false;

        con = ConnectionManager.getConnection();
        String sql = "INSERT INTO projectdb2.employeetaskoffered (taskid, task, category, estimatedvalue, taskdate, employerusername, yourbid, employeeusername) VALUES ('" + taskId + "', '" + task + "', '" + category + "', '" + estimatedvalue + "', '" + taskdate + "', '" + employerusername + "', '" + yourbid + "', '" + employeeusername + "')";

        try {
            stmt = con.createStatement();
            if (stmt.executeUpdate(sql) > 0) {
                flag = true;
            }

        } catch (SQLException ex) {

        }
        return flag;
    }

    public boolean DeleteTask() {
        boolean flag = false;

        con = ConnectionManager.getConnection();
        String sql = "delete from projectdb2.addtask where taskid = '" + taskId + "'";

        try {
            stmt = con.createStatement();
            if (stmt.executeUpdate(sql) > 0) {
                flag = true;
            }

        } catch (SQLException ex) {

        }
        return flag;
    }
}
