package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.BestBids;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BidForTaskBean {

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getYourBid() {
        return yourBid;
    }

    public void setYourBid(String yourBid) {
        this.yourBid = yourBid;
    }

    public String getHiddenEmployeeUsername() {
        return hiddenEmployeeUsername;
    }

    public void setHiddenEmployeeUsername(String hiddenEmployeeUsername) {
        this.hiddenEmployeeUsername = hiddenEmployeeUsername;
    }

    private String taskId;
    private String yourBid;
    private String hiddenEmployeeUsername;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ArrayList BidForTask() {

        con = ConnectionManager.getConnection();
        try {
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO bidfortask (taskid, yourbid, employeeusername) "
                    + "VALUES ('" + taskId + "', '" + yourBid + "', '" + hiddenEmployeeUsername + "')");
            con.close();

        } catch (SQLException ex) {

        }

        ArrayList<BestBids> bestBidsList = new ArrayList<BestBids>();

        con = ConnectionManager.getConnection();
        String selectQuery = "SELECT * FROM projectdb2.bidfortask where taskid = '" + taskId + "' ORDER BY yourbid;";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                BestBids bestBids = new BestBids();

                String taskid = rs.getString("taskid");
                bestBids.setTaskid(taskid);

                String yourbid = rs.getString("yourbid");
                bestBids.setYourbid(yourbid);

                String employeeusername = rs.getString("employeeusername");
                bestBids.setEmployeeusername(employeeusername);

                bestBidsList.add(bestBids);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return bestBidsList;
    }

}
