package com.sandeepa.servlets;

import com.sandeepa.beans.BidForTaskBean;
import com.sandeepa.listclasses.BestBids;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BidForTaskServlet extends HttpServlet {

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
        String yourBid = request.getParameter("yourBid");
        String hiddenEmployeeUsername = request.getParameter("hiddenEmployeeUsername");

        BidForTaskBean bidForTaskBean = new BidForTaskBean();
        bidForTaskBean.setTaskId(taskId);
        bidForTaskBean.setYourBid(yourBid);
        bidForTaskBean.setHiddenEmployeeUsername(hiddenEmployeeUsername);

        ArrayList<BestBids> bestBidsList = bidForTaskBean.BidForTask();

        request.getSession().setAttribute("bestBidsList", bestBidsList);
        response.sendRedirect("./forms/BestBids.jsp");

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
