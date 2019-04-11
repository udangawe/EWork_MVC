
package com.sandeepa.servlets;

import com.sandeepa.beans.UpdateBiddedTasksBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateBiddedTasksServlet extends HttpServlet {

    
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
        
        String bidValue = request.getParameter("bidValue");
        String idbidfortask = request.getParameter("idbidfortask");
        int IdBidforTask = Integer.parseInt(idbidfortask);
        
        UpdateBiddedTasksBean updateBiddedTasksBean = new UpdateBiddedTasksBean();
        updateBiddedTasksBean.setYourbid(bidValue);
        updateBiddedTasksBean.setIdbidfortask(IdBidforTask);
        updateBiddedTasksBean.UpdateBiddedTasks();
        response.sendRedirect("./forms/Employee.jsp");
        
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
