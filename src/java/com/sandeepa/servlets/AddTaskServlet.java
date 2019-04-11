package com.sandeepa.servlets;

import com.sandeepa.beans.AddTaskBean;
import java.io.IOException;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class AddTaskServlet extends HttpServlet {

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

        String Task = request.getParameter("Task");
        String Category = request.getParameter("Category");
        String estimatedValue = request.getParameter("estimatedValue");
        String TaskDate = request.getParameter("TaskDate");
        String username = request.getParameter("username");
        String uniqueTaskID = UUID.randomUUID().toString().substring(0, 4);
        String uploadedfilename = request.getParameter("uploadedfilename");
        Part filePart = request.getPart("uploadfile");

        AddTaskBean addTaskBean = new AddTaskBean();
        addTaskBean.setTask(Task);
        addTaskBean.setCategory(Category);
        addTaskBean.setEstimatedValue(estimatedValue);
        addTaskBean.setTaskDate(TaskDate);
        addTaskBean.setUsername(username);
        addTaskBean.setUniqueTaskID(uniqueTaskID);
        addTaskBean.setUploadedfilename(uploadedfilename);
        addTaskBean.setFilePart(filePart);

        addTaskBean.addTask();
        response.sendRedirect("./forms/Employer.jsp");

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
