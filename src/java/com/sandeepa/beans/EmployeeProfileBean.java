package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.EmployeeProfile;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeProfileBean {

    public String getEmployeeUsername() {
        return employeeUsername;
    }

    public void setEmployeeUsername(String employeeUsername) {
        this.employeeUsername = employeeUsername;
    }
    private String employeeUsername;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ArrayList EmployeeProfile() {
        ArrayList<EmployeeProfile> employeeProfileList = new ArrayList<>();

        con = ConnectionManager.getConnection();
        String employeeRatingQuery = "SELECT registration.firstname, registration.lastname, AVG(ratingemployee.ratingofemployer) AS ratingemployeeavg\n"
                + "FROM registration\n"
                + "INNER JOIN ratingemployee ON registration.username = ratingemployee.ratedemployeeusername\n"
                + "WHERE registration.username = '" + employeeUsername + "';";

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(employeeRatingQuery);
            while (rs.next()) {
                EmployeeProfile employeeProfile = new EmployeeProfile();

                String firstname = rs.getString("firstname");
                employeeProfile.setFirstname(firstname);

                String lastname = rs.getString("lastname");
                employeeProfile.setLastname(lastname);

                int ratingemployeeavg = rs.getInt("ratingemployeeavg");
                employeeProfile.setRatingemployeeavg(ratingemployeeavg);

                employeeProfileList.add(employeeProfile);
            }
            stmt.close();

        } catch (SQLException ex) {

        }
        return employeeProfileList;
    }
}
