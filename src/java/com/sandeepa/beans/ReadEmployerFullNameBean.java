package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployerFullNameBean {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public String ReadEmployerFullName() {
        String employerFullName = "";

        con = ConnectionManager.getConnection();
        String sql = "SELECT * FROM projectdb2.registration where username = '" + userName + "';";

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                employerFullName = rs.getString("firstname") + " " + rs.getString("lastname");
            }
        } catch (SQLException ex) {

        }
        return employerFullName;
    }

}
