package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEmployerRatingAvgBean {

    public String getEmployerUserName() {
        return employerUserName;
    }

    public void setEmployerUserName(String employerUserName) {
        this.employerUserName = employerUserName;
    }
    private String employerUserName;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public int SelectEmployerRatingAvg() {
        int employerRatingAvg = 0;
        String sql = "SELECT AVG(ratingofemployer) AS ratingemployeravg FROM projectdb2.ratingemployee WHERE employerusername = '" + employerUserName + "';";

        try {
            con = ConnectionManager.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                employerRatingAvg = rs.getInt("ratingemployeravg");
            }

        } catch (SQLException ex) {

        }
        return employerRatingAvg;
    }
}
