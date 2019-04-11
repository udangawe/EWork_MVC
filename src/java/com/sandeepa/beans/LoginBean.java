package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginBean {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }

    private String username;
    private String inputPassword;

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String status = "";

    public String userLogin() {

        String loginStatus = "";
        con = ConnectionManager.getConnection();
        try {
            pst = con.prepareStatement("Select * from registration where username=? and password=?");
            pst.setString(1, username);
            pst.setString(2, inputPassword);
            rs = pst.executeQuery();
            if (rs.next()) {
                status = rs.getString("status");
                if (status.equals("Employee")) {
                    loginStatus = "Employee";
                }

                if (status.equals("Employer")) {
                    loginStatus = "Employer";
                }
            } else {
                loginStatus = "Login Failed";
            }

            pst.close();
            con.close();

        } catch (SQLException ex) {

        }

        return loginStatus;
    }
}
