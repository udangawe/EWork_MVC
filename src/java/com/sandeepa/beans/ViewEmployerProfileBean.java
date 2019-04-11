package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.ViewEmployerProfile;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ViewEmployerProfileBean {

    public String getEmployerUsername() {
        return employerUsername;
    }

    public void setEmployerUsername(String employerUsername) {
        this.employerUsername = employerUsername;
    }

    private String employerUsername;

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ArrayList ViewEmployerProfile() {
        ArrayList<ViewEmployerProfile> viewEmployerProfileList = new ArrayList<>();

        con = ConnectionManager.getConnection();
        String employerNameQuery = "SELECT registration.firstname, registration.lastname, AVG(ratingemployer.ratingofemployee) AS employerratingavg \n"
                + "FROM registration \n"
                + "INNER JOIN ratingemployer ON registration.username = ratingemployer.ratedemployerusername \n"
                + "WHERE registration.username = '" + employerUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(employerNameQuery);

            while (rs.next()) {
                ViewEmployerProfile viewEmployerProfile = new ViewEmployerProfile();

                String firstname = rs.getString("firstname");
                viewEmployerProfile.setFirstname(firstname);

                String lastname = rs.getString("lastname");
                viewEmployerProfile.setLastname(lastname);

                int employerratingavg = rs.getInt("employerratingavg");
                viewEmployerProfile.setEmployerratingavg(employerratingavg);

                viewEmployerProfileList.add(viewEmployerProfile);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return viewEmployerProfileList;
    }

}
