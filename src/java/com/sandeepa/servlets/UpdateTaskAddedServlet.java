package com.sandeepa.servlets;

import com.sandeepa.beans.UpdateTaskAddedBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateTaskAddedServlet extends HttpServlet {

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
        String Category = request.getParameter("Category");
        String estimateVal = request.getParameter("estimateVal");
        String taskDate = request.getParameter("taskDate");

        UpdateTaskAddedBean updateTaskAddedBean = new UpdateTaskAddedBean();
        updateTaskAddedBean.setTaskId(taskId);
        updateTaskAddedBean.setTask(task);
        updateTaskAddedBean.setCategory(Category);
        updateTaskAddedBean.setEstimateVal(estimateVal);
        updateTaskAddedBean.setTaskDate(taskDate);
        updateTaskAddedBean.UpdateTaskAdded();

        response.sendRedirect("./forms/Employer.jsp");

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
