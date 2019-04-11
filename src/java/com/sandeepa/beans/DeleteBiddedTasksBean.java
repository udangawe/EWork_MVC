package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBiddedTasksBean {

    public int getIdbidfortask() {
        return idbidfortask;
    }

    public void setIdbidfortask(int idbidfortask) {
        this.idbidfortask = idbidfortask;
    }

    private int idbidfortask;

    Connection con = null;
    PreparedStatement preparedStmt = null;

    public boolean DeleteBiddedTasks() {
        boolean flag = false;

        con = ConnectionManager.getConnection();
        String query = "delete from bidfortask where idbidfortask = ?";
        try {
            preparedStmt = con.prepareStatement(query);
            preparedStmt.setInt(1, idbidfortask);

            if (preparedStmt.executeUpdate() > 0) {
                flag = true;
            }
            con.close();

        } catch (SQLException ex) {

        }

        return flag;
    }
}
