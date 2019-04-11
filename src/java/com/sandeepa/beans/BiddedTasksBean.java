package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.BiddedTasks;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BiddedTasksBean {
    
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
    
    public ArrayList BiddedTasks() {
        
        ArrayList<BiddedTasks> biddedTasksList = new ArrayList<BiddedTasks>();
        
        con = ConnectionManager.getConnection();
        String selectQuery = "SELECT bidfortask.idbidfortask, bidfortask.taskid, bidfortask.yourbid, addtask.task, addtask.category, addtask.estimatedvalue, addtask.username, addtask.taskdate\n"
                + "FROM bidfortask INNER JOIN addtask ON bidfortask.taskid = addtask.taskid\n"
                + "WHERE bidfortask.employeeusername = '" + employeeUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                BiddedTasks biddedTasks = new BiddedTasks();
                
                int idbidfortask = rs.getInt("idbidfortask");
                biddedTasks.setIdbidfortask(idbidfortask);
                
                String taskid = rs.getString("taskid");
                biddedTasks.setTaskid(taskid);
                
                String yourbid = rs.getString("yourbid");
                biddedTasks.setYourbid(yourbid);
                
                String task = rs.getString("task");
                biddedTasks.setTask(task);
                
                String category = rs.getString("category");
                biddedTasks.setCategory(category);
                
                String estimatedvalue = rs.getString("estimatedvalue");
                biddedTasks.setEstimatedvalue(estimatedvalue);
                
                String username = rs.getString("username");
                biddedTasks.setUsername(username);
                
                Date taskdate = rs.getDate("taskdate");
                biddedTasks.setTaskdate(taskdate);
                
                biddedTasksList.add(biddedTasks);
            }
            stmt.close();
            
        } catch (SQLException ex) {
            
        }
        
        return biddedTasksList;
    }
}
