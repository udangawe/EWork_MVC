package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.EmployerProfile;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployerProfileBean {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private String username;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ArrayList EmployerProfile() {
        ArrayList<EmployerProfile> employerProfileList = new ArrayList<>();

        con = ConnectionManager.getConnection();
        String employerNameQuery = "SELECT registration.firstname, registration.lastname, AVG(ratingemployer.ratingofemployee) AS employerratingavg \n"
                + "FROM registration \n"
                + "INNER JOIN ratingemployer ON registration.username = ratingemployer.ratedemployerusername \n"
                + "WHERE registration.username = '" + username + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(employerNameQuery);

            while (rs.next()) {
                EmployerProfile employerProfile = new EmployerProfile();

                String firstname = rs.getString("firstname");
                employerProfile.setFirstname(firstname);

                String lastname = rs.getString("lastname");
                employerProfile.setLastname(lastname);

                int employerratingavg = rs.getInt("employerratingavg");
                employerProfile.setEmployerratingavg(employerratingavg);

                employerProfileList.add(employerProfile);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return employerProfileList;
    }
}
