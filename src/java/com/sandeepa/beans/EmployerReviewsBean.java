package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.EmployerReviews;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployerReviewsBean {

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

    public ArrayList EmployerReviews() {
        ArrayList<EmployerReviews> employerReviewsList = new ArrayList<>();

        con = ConnectionManager.getConnection();
        String employerReviewsQuery = "SELECT * FROM projectdb2.ratingemployer WHERE employeeusername = '" + employeeUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(employerReviewsQuery);
            while (rs.next()) {
                EmployerReviews employerReviews = new EmployerReviews();

                String employerusername = rs.getString("ratedemployerusername");
                employerReviews.setEmployerusername(employerusername);

                String taskid = rs.getString("taskid");
                employerReviews.setTaskid(taskid);

                String task = rs.getString("task");
                employerReviews.setTask(task);

                int ratingofemployer = rs.getInt("ratingofemployee");
                employerReviews.setRatingofemployer(ratingofemployer);

                String employercomments = rs.getString("employeecomments");
                employerReviews.setEmployercomments(employercomments);

                String ratedemployeeusername = rs.getString("employeeusername");
                employerReviews.setRatedemployeeusername(ratedemployeeusername);

                employerReviewsList.add(employerReviews);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return employerReviewsList;
    }
}
