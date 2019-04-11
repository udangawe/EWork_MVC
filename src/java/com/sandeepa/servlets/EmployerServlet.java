package com.sandeepa.servlets;

import com.sandeepa.beans.EmployerProfileBean;
import com.sandeepa.beans.EmployerTaskCompletedBean;
import com.sandeepa.beans.ReadEmployerFullNameBean;
import com.sandeepa.beans.SelectEmployerRatingAvgBean;
import com.sandeepa.beans.TasksAddedBean;
import com.sandeepa.beans.TasksOngoingBean;
import com.sandeepa.listclasses.EmployerProfile;
import com.sandeepa.listclasses.EmployerTaskCompleted;
import com.sandeepa.listclasses.TaskAdded;
import com.sandeepa.listclasses.TasksOngoing;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployerServlet extends HttpServlet {

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
        if ("AddTask".equals(button)) {
            String username = request.getParameter("username");
            request.getSession().setAttribute("username", username);
            response.sendRedirect("./forms/AddTask.jsp");
        }

        String username = request.getParameter("username");
        TasksAddedBean tasksAddedBean = new TasksAddedBean();
        tasksAddedBean.setUsername(username);
        if ("TaskAdded".equals(button)) {
            ArrayList<TaskAdded> taskAddedList = tasksAddedBean.TasksAdded();
            request.getSession().setAttribute("taskAddedList", taskAddedList);
            response.sendRedirect("./forms/TaskAdded.jsp");
        }

        TasksOngoingBean tasksOngoingBean = new TasksOngoingBean();
        tasksOngoingBean.setEmployerUsername(username);
        if ("TasksOngoing".equals(button)) {
            ArrayList<TasksOngoing> tasksOngoingList = tasksOngoingBean.TasksOngoing();
            request.getSession().setAttribute("tasksOngoingList", tasksOngoingList);
            response.sendRedirect("./forms/TasksOngoing.jsp");
        }

        EmployerTaskCompletedBean employerTaskCompletedBean = new EmployerTaskCompletedBean();
        employerTaskCompletedBean.setEmployerUsername(username);
        if ("TasksCompleted".equals(button)) {
            ArrayList<EmployerTaskCompleted> employerTaskCompletedList = employerTaskCompletedBean.EmployerTaskCompleted();
            request.getSession().setAttribute("employerTaskCompletedList", employerTaskCompletedList);
            response.sendRedirect("./forms/EmployerTaskCompleted.jsp");
        }

        //EmployerProfileBean employerProfileBean = new EmployerProfileBean();
        SelectEmployerRatingAvgBean selectEmployerRatingAvgBean = new SelectEmployerRatingAvgBean();
        ReadEmployerFullNameBean readEmployerFullNameBean = new ReadEmployerFullNameBean();
        //employerProfileBean.setUsername(username);
        selectEmployerRatingAvgBean.setEmployerUserName(username);
        readEmployerFullNameBean.setUserName(username);
        if ("MyProfile".equals(button)) {
            //ArrayList<EmployerProfile> employerProfileList = employerProfileBean.EmployerProfile();
            int employerratingavg = selectEmployerRatingAvgBean.SelectEmployerRatingAvg();
            String employerfullname = readEmployerFullNameBean.ReadEmployerFullName();
            request.getSession().setAttribute("employerfullname", employerfullname);
            request.getSession().setAttribute("employerratingavg", employerratingavg);
            request.getSession().setAttribute("username", username);
            response.sendRedirect("./forms/EmployerProfile.jsp");
        }
        
        if ("Logout".equals(button)) {
            response.sendRedirect("./forms/Login.jsp");
        }

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
