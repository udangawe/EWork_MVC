package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.BestBids;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BestBidsBean {

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

    public ArrayList BestBids() {

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
