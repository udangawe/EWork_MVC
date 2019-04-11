package com.sandeepa.beans;

import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.EmployeeReviews;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeReviewsBean {

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

    public ArrayList EmployeeReviews() {
        ArrayList ratingEmployerList = new ArrayList();

        con = ConnectionManager.getConnection();
        String ratingEmployerQuery = "SELECT * FROM projectdb2.ratingemployee WHERE employerusername = '" + employerUsername + "';";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(ratingEmployerQuery);
            while (rs.next()) {
                EmployeeReviews employeeReviews = new EmployeeReviews();

                String employeeusername = rs.getString("ratedemployeeusername");
                employeeReviews.setEmployeeusername(employeeusername);

                String taskid = rs.getString("taskid");
                employeeReviews.setTaskid(taskid);

                String task = rs.getString("task");
                employeeReviews.setTask(task);

                int ratingofemployee = rs.getInt("ratingofemployer");
                employeeReviews.setRatingofemployee(ratingofemployee);

                String employeecomments = rs.getString("employercomments");
                employeeReviews.setEmployeecomments(employeecomments);

                String ratedemployerusername = rs.getString("employerusername");
                employeeReviews.setRatedemployerusername(ratedemployerusername);

                ratingEmployerList.add(employeeReviews);
            }
            stmt.close();

        } catch (SQLException ex) {

        }

        return ratingEmployerList;
    }
}
