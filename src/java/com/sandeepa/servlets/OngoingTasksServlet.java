package com.sandeepa.servlets;

import com.sandeepa.beans.CompleteTaskEmployeeBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OngoingTasksServlet extends HttpServlet {

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

        String taskId = request.getParameter("taskId");
        String task = request.getParameter("task");
        String category = request.getParameter("category");
        String estimatedValue = request.getParameter("estimatedValue");
        String taskDate = request.getParameter("taskDate");
        String employerUsername = request.getParameter("employerUsername");
        String yourBid = request.getParameter("yourBid");
        String employeeUsername = request.getParameter("employeeUsername");

        String button = request.getParameter("button");
        CompleteTaskEmployeeBean completeTaskEmployeeBean = new CompleteTaskEmployeeBean();
        completeTaskEmployeeBean.setTaskId(taskId);
        completeTaskEmployeeBean.setTask(task);
        completeTaskEmployeeBean.setCategory(category);
        completeTaskEmployeeBean.setEstimatedValue(estimatedValue);
        completeTaskEmployeeBean.setTaskDate(taskDate);
        completeTaskEmployeeBean.setEmployerUsername(employerUsername);
        completeTaskEmployeeBean.setYourBid(yourBid);
        completeTaskEmployeeBean.setEmployeeUsername(employeeUsername);

        if ("btnCompleteTask".equals(button)) {

            completeTaskEmployeeBean.CompleteTaskEmployee();
            completeTaskEmployeeBean.DeleteEmployeeTaskOffered();
            request.getSession().setAttribute("employerUsername", employerUsername);
            request.getSession().setAttribute("taskId", taskId);
            request.getSession().setAttribute("task", task);
            request.getSession().setAttribute("employeeUsername", employeeUsername);
            response.sendRedirect("./forms/RatingEmployer.jsp");
        }

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
