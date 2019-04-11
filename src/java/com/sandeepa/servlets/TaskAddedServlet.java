package com.sandeepa.servlets;

import com.sandeepa.beans.BiddersListBean;
import com.sandeepa.beans.DeleteTaskBean;
import com.sandeepa.listclasses.BiddersList;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TaskAddedServlet extends HttpServlet {

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

        String button = request.getParameter("button");
        String taskId = request.getParameter("taskId");
        
        BiddersListBean biddersListBean = new BiddersListBean();
        biddersListBean.setTaskId(taskId);
        if ("btnBiddersList".equals(button)) {
            ArrayList<BiddersList> bidderList = biddersListBean.BestBiddersList();
            int rowCount = biddersListBean.GetTaskIdCount();

            request.getSession().setAttribute("bidderList", bidderList);
            request.getSession().setAttribute("rowCount", rowCount);
            response.sendRedirect("./forms/BiddersList.jsp");
        }

        String task = request.getParameter("task");
        String category = request.getParameter("category");
        String estimatedVal = request.getParameter("estimatedVal");
        String taskDate = request.getParameter("taskDate");

        if ("btnEditTask".equals(button)) {
            request.getSession().setAttribute("taskId", taskId);
            request.getSession().setAttribute("task", task);
            request.getSession().setAttribute("category", category);
            request.getSession().setAttribute("estimatedVal", estimatedVal);
            request.getSession().setAttribute("taskDate", taskDate);

            response.sendRedirect("./forms/UpdateTaskAdded.jsp");
        }
        
        DeleteTaskBean deleteTaskBean = new DeleteTaskBean();
        deleteTaskBean.setTaskId(taskId);
        if ("btnDeleteTask".equals(button)) {
            deleteTaskBean.DeleteTask();
            response.sendRedirect("./forms/Employer.jsp");
        }

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
