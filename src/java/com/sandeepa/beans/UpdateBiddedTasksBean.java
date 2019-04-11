package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBiddedTasksBean {

    public String getYourbid() {
        return yourbid;
    }

    public void setYourbid(String yourbid) {
        this.yourbid = yourbid;
    }

    public int getIdbidfortask() {
        return idbidfortask;
    }

    public void setIdbidfortask(int idbidfortask) {
        this.idbidfortask = idbidfortask;
    }

    private int idbidfortask;
    private String yourbid;

    Connection con = null;
    PreparedStatement preparedStmt = null;

    public boolean UpdateBiddedTasks() {
        boolean flag = false;

        con = ConnectionManager.getConnection();
        String query = "update bidfortask set yourbid = ? where idbidfortask = ?";

        try {
            preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, yourbid);
            preparedStmt.setInt(2, idbidfortask);

            if (preparedStmt.executeUpdate() > 0) {
                flag = true;
            }

            con.close();

        } catch (SQLException ex) {

        }

        return flag;
    }

}
