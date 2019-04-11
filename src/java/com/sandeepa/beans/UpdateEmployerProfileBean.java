package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UpdateEmployerProfileBean {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(String inputEmail) {
        this.inputEmail = inputEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String firstName;
    private String lastName;
    private String inputEmail;
    private String phoneNumber;
    private String birthday;
    private String gender;
    private String country;
    private String city;
    private String username;

    Connection con = null;
    PreparedStatement preparedStmt = null;

    public boolean UpdateEmployerProfile() {
        boolean flag = false;

        try {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = sdf.parse(birthday);
            java.sql.Date sqlBirthDate = new java.sql.Date(date.getTime());

            con = ConnectionManager.getConnection();
            String updateEmployerProfileQuery = "update registration set firstname = ?, lastname = ?, email = ?, phone_number = ?, birthdate = ?, gender = ?, country = ?, city = ? where username = ?";
            try {
                preparedStmt = con.prepareStatement(updateEmployerProfileQuery);
                preparedStmt.setString(1, firstName);
                preparedStmt.setString(2, lastName);
                preparedStmt.setString(3, inputEmail);
                preparedStmt.setString(4, phoneNumber);
                preparedStmt.setDate(5, sqlBirthDate);
                preparedStmt.setString(6, gender);
                preparedStmt.setString(7, country);
                preparedStmt.setString(8, city);
                preparedStmt.setString(9, username);

                if (preparedStmt.executeUpdate() > 0) {
                    flag = true;
                }
                con.close();

            } catch (SQLException ex) {

            }

        } catch (ParseException ex) {

        }

        return flag;
    }
}
