package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.SelectEmployeeProfile;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectEmployeeProfileBean {

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

    public ArrayList SelectEmployeeProfile() {
        ArrayList<SelectEmployeeProfile> selectEmployeeProfileList = new ArrayList<>();

        con = ConnectionManager.getConnection();
        String registrationQuery = "SELECT * FROM registration WHERE username = '" + employeeUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(registrationQuery);
            while (rs.next()) {
                SelectEmployeeProfile selectEmployeeProfile = new SelectEmployeeProfile();

                String firstname = rs.getString("firstname");
                selectEmployeeProfile.setFirstname(firstname);

                String lastname = rs.getString("lastname");
                selectEmployeeProfile.setLastname(lastname);

                String email = rs.getString("email");
                selectEmployeeProfile.setEmail(email);

                String phone_number = rs.getString("phone_number");
                selectEmployeeProfile.setPhone_number(phone_number);

                Date birthdate = rs.getDate("birthdate");
                selectEmployeeProfile.setBirthdate(birthdate);

                String gender = rs.getString("gender");
                selectEmployeeProfile.setGender(gender);

                String country = rs.getString("country");
                selectEmployeeProfile.setCountry(country);

                String city = rs.getString("city");
                selectEmployeeProfile.setCity(city);

                selectEmployeeProfileList.add(selectEmployeeProfile);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return selectEmployeeProfileList;
    }
}
