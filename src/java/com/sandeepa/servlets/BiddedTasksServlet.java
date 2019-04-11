package com.sandeepa.servlets;

import com.sandeepa.beans.DeleteBiddedTasksBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BiddedTasksServlet extends HttpServlet {

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

        String idbidfortask = request.getParameter("idbidfortask");
        String yourbid = request.getParameter("yourbid");
        int IdBidforTask = Integer.parseInt(idbidfortask);
        String button = request.getParameter("button");

        if ("Edit Task".equals(button)) {
            request.getSession().setAttribute("idbidfortask", idbidfortask);
            request.getSession().setAttribute("yourbid", yourbid);
            response.sendRedirect("./forms/UpdateBiddedTasks.jsp");
        }
        
        DeleteBiddedTasksBean deleteBiddedTasksBean = new DeleteBiddedTasksBean();
        deleteBiddedTasksBean.setIdbidfortask(IdBidforTask);
        if ("Delete Task".equals(button)) {
            deleteBiddedTasksBean.DeleteBiddedTasks();
            response.sendRedirect("./forms/Employee.jsp");
        }

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
