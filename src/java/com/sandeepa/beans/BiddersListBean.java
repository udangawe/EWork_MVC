package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.BiddersList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BiddersListBean {

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    private String taskId;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    ResultSet countRs = null;
    int rowCount = 0;

    public ArrayList BestBiddersList() {

        ArrayList<BiddersList> bidderList = new ArrayList<BiddersList>();

        con = ConnectionManager.getConnection();
        String selectQuery = "SELECT bidfortask.taskid, bidfortask.yourbid, bidfortask.employeeusername, addtask.task, addtask.category, addtask.estimatedvalue, addtask.taskdate, addtask.username\n"
                + "FROM bidfortask\n"
                + "INNER JOIN addtask ON bidfortask.taskid = addtask.taskid\n"
                + "WHERE bidfortask.taskid = '" + taskId + "' ORDER BY bidfortask.yourbid;";

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(selectQuery);

            while (rs.next()) {
                BiddersList biddersList = new BiddersList();

                String taskid = rs.getString("taskid");
                biddersList.setTaskid(taskid);

                String yourbid = rs.getString("yourbid");
                biddersList.setYourbid(yourbid);

                String employeeusername = rs.getString("employeeusername");
                biddersList.setEmployeeusername(employeeusername);

                String task = rs.getString("task");
                biddersList.setTask(task);

                String category = rs.getString("category");
                biddersList.setCategory(category);

                String estimatedvalue = rs.getString("estimatedvalue");
                biddersList.setEstimatedvalue(estimatedvalue);

                Date taskdate = rs.getDate("taskdate");
                biddersList.setTaskdate(taskdate);

                String username = rs.getString("username");
                biddersList.setUsername(username);

                bidderList.add(biddersList);
            }

            //stmt.close();

        } catch (SQLException ex) {

        }

        return bidderList;
    }

    public int GetTaskIdCount() {

        try {
            String getTaskIdCount = "SELECT COUNT(bidfortask.taskid) AS taskidcount\n"
                    + "FROM bidfortask\n"
                    + "INNER JOIN addtask ON bidfortask.taskid = addtask.taskid\n"
                    + "WHERE bidfortask.taskid = '" + taskId + "' ORDER BY bidfortask.yourbid;";

            countRs = stmt.executeQuery(getTaskIdCount);
            while (countRs.next()) {
                int taskidcount = countRs.getInt("taskidcount");
                rowCount = taskidcount;
            }

            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(BiddersListBean.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowCount;
    }

}
