package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegistrationBean {

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

    public String getInputUsername() {
        return inputUsername;
    }

    public void setInputUsername(String inputUsername) {
        this.inputUsername = inputUsername;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
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

    public String getInlineRadioOptions() {
        return inlineRadioOptions;
    }

    public void setInlineRadioOptions(String inlineRadioOptions) {
        this.inlineRadioOptions = inlineRadioOptions;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    private String firstName;
    private String lastName;
    private String inputEmail;
    private String inputUsername;
    private String inputPassword;
    private String phoneNumber;
    private String birthday;
    private String gender;
    private String country;
    private String city;
    private String inlineRadioOptions;
    private InputStream inputStream;

    Connection con = null;
    Statement stmt = null;

    public int addRegistration() {

        int count = 0;

        con = ConnectionManager.getConnection();
        try {
            stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery("select count(*) from projectdb2.registration where username = '" + inputUsername + "';");
            while (resultSet.next()) {
                count = resultSet.getInt(1);
            }
            if (count == 0) {
                stmt.executeUpdate("INSERT INTO registration (image, firstname, lastname, email, username, password, phone_number, birthdate, gender, country, city, status) "
                        + "VALUES ('" + inputStream + "', '" + firstName + "', '" + lastName + "', '" + inputEmail + "', '" + inputUsername + "', '" + inputPassword + "', '" + phoneNumber + "', '" + birthday + "', '" + gender + "','" + country + "', '" + city + "', '" + inlineRadioOptions + "')");
            }
            stmt.close();
            con.close();

        } catch (SQLException ex) {

        }

        return count;
    }

}
