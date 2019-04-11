package com.sandeepa.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TaskListServlet extends HttpServlet {
    
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
        
        String Category = request.getParameter("Category");
        String taskId = request.getParameter("taskId");
        String fromDate = request.getParameter("fromDate");
        String toDate = request.getParameter("toDate");
        String estimatedVal = request.getParameter("estimatedVal");
        
        String button = request.getParameter("button");
        
        if ("selectBtn".equals(button)) {
            
            request.getSession().setAttribute("Category", Category);
            request.getSession().setAttribute("taskId", taskId);
            request.getSession().setAttribute("fromDate", fromDate);
            request.getSession().setAttribute("toDate", toDate);
            request.getSession().setAttribute("estimatedVal", estimatedVal);
            response.sendRedirect("./forms/TaskList.jsp");
        }
        
        String hiddenEmployerUsername = request.getParameter("hiddenEmployerUsername");
        String hiddenTaskId = request.getParameter("hiddenTaskId");
        String hiddenCategory = request.getParameter("hiddenCategory");
        String hiddenTaskDate = request.getParameter("hiddenTaskDate");
        String hiddenEstimatedVal = request.getParameter("hiddenEstimatedVal");
        String hiddenEmployeeUsername = request.getParameter("hiddenEmployeeUsername");
        String hiddenFileName = request.getParameter("hiddenFileName");
        String hiddenTaskName = request.getParameter("hiddenTaskName");
        
        if ("detailsBtn".equals(button)) {
            
            request.getSession().setAttribute("hiddenEmployerUsername", hiddenEmployerUsername);
            request.getSession().setAttribute("hiddenTaskId", hiddenTaskId);
            request.getSession().setAttribute("hiddenCategory", hiddenCategory);
            request.getSession().setAttribute("hiddenTaskDate", hiddenTaskDate);
            request.getSession().setAttribute("hiddenEstimatedVal", hiddenEstimatedVal);
            request.getSession().setAttribute("hiddenEmployeeUsername", hiddenEmployeeUsername);
            request.getSession().setAttribute("hiddenFileName", hiddenFileName);
            request.getSession().setAttribute("hiddenTaskName", hiddenTaskName);
            
            response.sendRedirect("./forms/TaskDetails.jsp");
        }
        
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
