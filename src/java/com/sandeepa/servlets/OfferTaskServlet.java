package com.sandeepa.servlets;

import com.sandeepa.beans.OfferTaskBean;
import com.sandeepa.beans.ReadEmployeeFullNameBean;
import com.sandeepa.beans.ViewEmployeeProfileBean;
import com.sandeepa.listclasses.ViewEmployeeProfile;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OfferTaskServlet extends HttpServlet {
    
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
        String estimatedvalue = request.getParameter("estimatedvalue");
        String taskdate = request.getParameter("taskdate");
        String employerusername = request.getParameter("username");
        String yourbid = request.getParameter("yourbid");
        String employeeusername = request.getParameter("employeeusername");
        
        String button = request.getParameter("button");
        OfferTaskBean offerTaskBean = new OfferTaskBean();
        offerTaskBean.setTaskId(taskId);
        offerTaskBean.setTask(task);
        offerTaskBean.setCategory(category);
        offerTaskBean.setEstimatedvalue(estimatedvalue);
        offerTaskBean.setTaskdate(taskdate);
        offerTaskBean.setEmployerusername(employerusername);
        offerTaskBean.setYourbid(yourbid);
        offerTaskBean.setEmployeeusername(employeeusername);
        
        if ("btnOfferTask".equals(button)) {
            offerTaskBean.EmployerTaskOffered();
            offerTaskBean.EmployeeTaskOffered();
            offerTaskBean.DeleteTask();
            response.sendRedirect("./forms/Employer.jsp");
        }
        
        ReadEmployeeFullNameBean readEmployeeFullNameBean = new ReadEmployeeFullNameBean();
        readEmployeeFullNameBean.setUserName(employeeusername);
        ViewEmployeeProfileBean viewEmployeeProfileBean = new ViewEmployeeProfileBean();
        viewEmployeeProfileBean.setEmployeeUsername(employeeusername);
        if ("btnEmployeeProfile".equals(button)) {
            ArrayList<ViewEmployeeProfile> viewEmployeeProfileList = viewEmployeeProfileBean.ViewEmployeeProfile();
            
            String employeefullname = readEmployeeFullNameBean.ReadEmployeeFullName();
            request.getSession().setAttribute("employeefullname", employeefullname);
            request.getSession().setAttribute("ratingemployeeavg", viewEmployeeProfileList.get(0).getRatingemployeeavg());
            request.getSession().setAttribute("employeeUsername", employeeusername);
            request.getSession().setAttribute("disableUpdate", "disableUpdate");
            response.sendRedirect("./forms/EmployeeProfile.jsp");
        }
        
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
