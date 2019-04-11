package com.sandeepa.servlets;

import com.sandeepa.beans.EmployerReviewsBean;
import com.sandeepa.beans.JobsCompletedBean;
import com.sandeepa.beans.SelectEmployeeProfileBean;
import com.sandeepa.listclasses.EmployerReviews;
import com.sandeepa.listclasses.JobsCompleted;
import com.sandeepa.listclasses.SelectEmployeeProfile;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeProfileServlet extends HttpServlet {

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

        String employeeUsername = request.getParameter("employeeUsername");
        String button = request.getParameter("button");
        String disableUpdateBtn = request.getParameter("disableUpdateBtn");
        
        EmployerReviewsBean employerReviewsBean = new EmployerReviewsBean();
        employerReviewsBean.setEmployeeUsername(employeeUsername);
        if ("btnEmployerReviews".equals(button)) {
           ArrayList<EmployerReviews> employerReviewsList = employerReviewsBean.EmployerReviews();
            request.getSession().setAttribute("employerReviewsList", employerReviewsList);
            response.sendRedirect("./forms/EmployerReviews.jsp");
        }
        
        JobsCompletedBean jobsCompletedBean = new JobsCompletedBean();
        jobsCompletedBean.setEmployeeUsername(employeeUsername);
        if ("btnJobsCompleted".equals(button)) {
            ArrayList<JobsCompleted> jobsCompletedList = jobsCompletedBean.JobsCompleted();
            request.getSession().setAttribute("jobsCompletedList", jobsCompletedList);
            response.sendRedirect("./forms/JobsCompleted.jsp");
        }
        
        SelectEmployeeProfileBean selectEmployeeProfileBean = new SelectEmployeeProfileBean();
        selectEmployeeProfileBean.setEmployeeUsername(employeeUsername);
        if ("btnUpdateEmployeeProfile".equals(button)) {
            ArrayList<SelectEmployeeProfile> selectEmployeeProfileList = selectEmployeeProfileBean.SelectEmployeeProfile();

            request.getSession().setAttribute("firstname", selectEmployeeProfileList.get(0).getFirstname());
            request.getSession().setAttribute("lastname", selectEmployeeProfileList.get(0).getLastname());
            request.getSession().setAttribute("email", selectEmployeeProfileList.get(0).getEmail());
            request.getSession().setAttribute("phone_number", selectEmployeeProfileList.get(0).getPhone_number());
            request.getSession().setAttribute("birthdate", selectEmployeeProfileList.get(0).getBirthdate());
            request.getSession().setAttribute("gender", selectEmployeeProfileList.get(0).getGender());
            request.getSession().setAttribute("country", selectEmployeeProfileList.get(0).getCountry());
            request.getSession().setAttribute("city", selectEmployeeProfileList.get(0).getCity());
            request.getSession().setAttribute("employeeUsername", employeeUsername);
            request.getSession().setAttribute("disableUpdateBtn", disableUpdateBtn);
            response.sendRedirect("./forms/UpdateEmployeeProfile.jsp");
        }

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
