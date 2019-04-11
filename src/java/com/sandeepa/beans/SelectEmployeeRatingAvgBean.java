package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEmployeeRatingAvgBean {

    public String getEmployeeUserName() {
        return employeeUserName;
    }

    public void setEmployeeUserName(String employeeUserName) {
        this.employeeUserName = employeeUserName;
    }

    private String employeeUserName;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public int SelectEmployeeRatingAvg() {
        int employeeRatingAvg = 0;
        String sql = "SELECT AVG(ratingofemployee) AS employeeratingavg FROM projectdb2.ratingemployer WHERE employeeusername = '" + employeeUserName + "';";

        try {
            con = ConnectionManager.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                employeeRatingAvg = rs.getInt("employeeratingavg");
            }

        } catch (SQLException ex) {

        }

        return employeeRatingAvg;
    }
}
