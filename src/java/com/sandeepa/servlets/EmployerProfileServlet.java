package com.sandeepa.servlets;

import com.sandeepa.beans.EmployeeReviewsBean;
import com.sandeepa.beans.JobsOfferedBean;
import com.sandeepa.beans.SelectEmployerProfileBean;
import com.sandeepa.listclasses.EmployeeReviews;
import com.sandeepa.listclasses.JobsOffered;
import com.sandeepa.listclasses.SelectEmployerProfile;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployerProfileServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String employerUsername = request.getParameter("username");
        String button = request.getParameter("button");
        String btnUpdateEmployerDisable = request.getParameter("btnUpdateEmployerDisable");
        
        
        EmployeeReviewsBean employeeReviewsBean = new EmployeeReviewsBean();
        employeeReviewsBean.setEmployerUsername(employerUsername);
        if ("btnEmployeeReviews".equals(button)) {
            ArrayList<EmployeeReviews> ratingEmployerList = employeeReviewsBean.EmployeeReviews();
            request.getSession().setAttribute("ratingEmployerList", ratingEmployerList);
            response.sendRedirect("./forms/EmployeeReviews.jsp");
        }
        
        JobsOfferedBean jobsOfferedBean = new JobsOfferedBean();
        jobsOfferedBean.setEmployerUsername(employerUsername);
        if ("btnJobsOffered".equals(button)) {
            ArrayList<JobsOffered> jobsOfferedList = jobsOfferedBean.JobsOffered();
            request.getSession().setAttribute("jobsOfferedList", jobsOfferedList);
            response.sendRedirect("./forms/EmployerJobsOffered.jsp");
        }
        
        SelectEmployerProfileBean selectEmployerProfileBean = new SelectEmployerProfileBean();
        selectEmployerProfileBean.setEmployerUsername(employerUsername);
        if ("btnUpdateEmployerProfile".equals(button)) {
           ArrayList<SelectEmployerProfile> selectEmployerProfileList = selectEmployerProfileBean.SelectEmployerProfile();

            request.getSession().setAttribute("firstname", selectEmployerProfileList.get(0).getFirstname());
            request.getSession().setAttribute("lastname", selectEmployerProfileList.get(0).getLastname());
            request.getSession().setAttribute("email", selectEmployerProfileList.get(0).getEmail());
            request.getSession().setAttribute("phone_number", selectEmployerProfileList.get(0).getPhone_number());
            request.getSession().setAttribute("birthdate", selectEmployerProfileList.get(0).getBirthdate());
            request.getSession().setAttribute("gender", selectEmployerProfileList.get(0).getGender());
            request.getSession().setAttribute("country", selectEmployerProfileList.get(0).getCountry());
            request.getSession().setAttribute("city", selectEmployerProfileList.get(0).getCity());
            request.getSession().setAttribute("username", employerUsername);
            request.getSession().setAttribute("btnUpdateEmployerDisable", btnUpdateEmployerDisable);
            response.sendRedirect("./forms/UpdateEmployerProfile.jsp");
        }

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
