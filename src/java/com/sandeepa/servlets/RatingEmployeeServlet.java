
package com.sandeepa.servlets;

import com.sandeepa.beans.RatingEmployeeBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RatingEmployeeServlet extends HttpServlet {

    
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
        
        String employerUsername = request.getParameter("employerUsername");
        String taskId = request.getParameter("taskId");
        String task = request.getParameter("task");
        String ratingemployer = request.getParameter("ratingemployer");
        String employercomments = request.getParameter("employercomments");
        String ratedemployeeusername = request.getParameter("ratedemployeeusername");
        
        String button = request.getParameter("button");
        RatingEmployeeBean ratingEmployeeBean = new RatingEmployeeBean();
        ratingEmployeeBean.setEmployerUsername(employerUsername);
        ratingEmployeeBean.setTaskId(taskId);
        ratingEmployeeBean.setTask(task);
        ratingEmployeeBean.setRatingemployer(ratingemployer);
        ratingEmployeeBean.setEmployercomments(employercomments);
        ratingEmployeeBean.setRatedemployeeusername(ratedemployeeusername);
        
        if ("btnEmployeeRatingSubmit".equals(button)) {
            ratingEmployeeBean.RatingEmployee();
            response.sendRedirect("./forms/Employee.jsp");
        }
        
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
