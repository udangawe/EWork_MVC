package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.ViewEmployeeProfile;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ViewEmployeeProfileBean {

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

    public ArrayList ViewEmployeeProfile() {
        ArrayList<ViewEmployeeProfile> viewEmployeeProfileList = new ArrayList<>();

        con = ConnectionManager.getConnection();
        String employeeRatingQuery = "SELECT registration.firstname, registration.lastname, AVG(ratingemployee.ratingofemployer) AS ratingemployeeavg\n"
                + "FROM registration\n"
                + "INNER JOIN ratingemployee ON registration.username = ratingemployee.ratedemployeeusername\n"
                + "WHERE registration.username = '" + employeeUsername + "';";

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(employeeRatingQuery);
            while (rs.next()) {
                ViewEmployeeProfile viewEmployeeProfile = new ViewEmployeeProfile();

                String firstname = rs.getString("firstname");
                viewEmployeeProfile.setFirstname(firstname);

                String lastname = rs.getString("lastname");
                viewEmployeeProfile.setLastname(lastname);

                int ratingemployeeavg = rs.getInt("ratingemployeeavg");
                viewEmployeeProfile.setRatingemployeeavg(ratingemployeeavg);

                viewEmployeeProfileList.add(viewEmployeeProfile);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return viewEmployeeProfileList;
    }
}
