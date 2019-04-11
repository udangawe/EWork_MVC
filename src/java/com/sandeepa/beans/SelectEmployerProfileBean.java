package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.SelectEmployerProfile;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectEmployerProfileBean {

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

    public ArrayList SelectEmployerProfile() {
        ArrayList<SelectEmployerProfile> selectEmployerProfileList = new ArrayList<>();

        con = ConnectionManager.getConnection();
        String registrationQuery = "SELECT * FROM registration WHERE username = '" + employerUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(registrationQuery);
            while (rs.next()) {
                SelectEmployerProfile selectEmployerProfile = new SelectEmployerProfile();

                String firstname = rs.getString("firstname");
                selectEmployerProfile.setFirstname(firstname);

                String lastname = rs.getString("lastname");
                selectEmployerProfile.setLastname(lastname);

                String email = rs.getString("email");
                selectEmployerProfile.setEmail(email);

                String phone_number = rs.getString("phone_number");
                selectEmployerProfile.setPhone_number(phone_number);

                Date birthdate = rs.getDate("birthdate");
                selectEmployerProfile.setBirthdate(birthdate);

                String gender = rs.getString("gender");
                selectEmployerProfile.setGender(gender);

                String country = rs.getString("country");
                selectEmployerProfile.setCountry(country);

                String city = rs.getString("city");
                selectEmployerProfile.setCity(city);

                selectEmployerProfileList.add(selectEmployerProfile);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return selectEmployerProfileList;
    }
}
