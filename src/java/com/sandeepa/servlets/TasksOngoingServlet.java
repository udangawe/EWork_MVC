package com.sandeepa.servlets;

import com.sandeepa.beans.CompleteTaskEmployerBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TasksOngoingServlet extends HttpServlet {

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
        String employerusername = request.getParameter("employerusername");
        String yourBid = request.getParameter("yourBid");
        String employeeUsername = request.getParameter("employeeUsername");

        CompleteTaskEmployerBean completeTaskEmployerBean = new CompleteTaskEmployerBean();
        completeTaskEmployerBean.setTaskId(taskId);
        completeTaskEmployerBean.setTask(task);
        completeTaskEmployerBean.setCategory(category);
        completeTaskEmployerBean.setEstimatedValue(estimatedValue);
        completeTaskEmployerBean.setTaskDate(taskDate);
        completeTaskEmployerBean.setEmployerusername(employerusername);
        completeTaskEmployerBean.setYourBid(yourBid);
        completeTaskEmployerBean.setEmployeeUsername(employeeUsername);

        String button = request.getParameter("button");
        if ("btnCompleteTask".equals(button)) {
            completeTaskEmployerBean.EmployerCompleteTask();
            completeTaskEmployerBean.DeleteEmployerTaskOffered();
            request.getSession().setAttribute("employeeUsername", employeeUsername);
            request.getSession().setAttribute("taskId", taskId);
            request.getSession().setAttribute("task", task);
            request.getSession().setAttribute("employerusername", employerusername);
            response.sendRedirect("./forms/RatingEmployee.jsp");
        }

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
