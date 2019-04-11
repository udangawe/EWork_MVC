package com.sandeepa.servlets;

import com.sandeepa.beans.RatingEmployerBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RatingEmployerServlet extends HttpServlet {

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
        String taskId = request.getParameter("taskId");
        String task = request.getParameter("task");
        String ratingemployee = request.getParameter("ratingemployee");
        String employeecomments = request.getParameter("employeecomments");
        String ratedemployerusername = request.getParameter("ratedemployerusername");

        String button = request.getParameter("button");
        RatingEmployerBean ratingEmployerBean = new RatingEmployerBean();
        ratingEmployerBean.setEmployeeUsername(employeeUsername);
        ratingEmployerBean.setTaskId(taskId);
        ratingEmployerBean.setTask(task);
        ratingEmployerBean.setRatingemployee(ratingemployee);
        ratingEmployerBean.setEmployeecomments(employeecomments);
        ratingEmployerBean.setRatedemployerusername(ratedemployerusername);

        if ("btnSubmitRatingEmployer".equals(button)) {
            ratingEmployerBean.RatingEmployer();
            response.sendRedirect("./forms/Employer.jsp");
        }

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
