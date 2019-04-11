package com.sandeepa.servlets;

import com.sandeepa.beans.BiddedTasksBean;
import com.sandeepa.beans.EmployeeProfileBean;
import com.sandeepa.beans.EmployeeTaskCompletedBean;
import com.sandeepa.beans.OngoingTasksBean;
import com.sandeepa.beans.ReadEmployeeFullNameBean;
import com.sandeepa.beans.SelectEmployeeRatingAvgBean;
import com.sandeepa.listclasses.BiddedTasks;
import com.sandeepa.listclasses.EmployeeProfile;
import com.sandeepa.listclasses.EmployeeTaskCompleted;
import com.sandeepa.listclasses.OngoingTasks;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {

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
        String employeeUsername = request.getParameter("employeeUsername");

        if ("SearchTask".equals(button)) {
            //String employeeUsername = request.getParameter("employeeUsername");
            request.getSession().setAttribute("employeeUsername", employeeUsername);
            response.sendRedirect("./forms/TaskList.jsp");
        }

        BiddedTasksBean biddedTasksBean = new BiddedTasksBean();
        biddedTasksBean.setEmployeeUsername(employeeUsername);
        if ("BiddedTasks".equals(button)) {
            ArrayList<BiddedTasks> biddedTasksList = biddedTasksBean.BiddedTasks();
            request.getSession().setAttribute("biddedTasksList", biddedTasksList);
            response.sendRedirect("./forms/BiddedTasks.jsp");
        }

        OngoingTasksBean ongoingTasksBean = new OngoingTasksBean();
        ongoingTasksBean.setEmployeeUsername(employeeUsername);
        if ("OngoingTasks".equals(button)) {
            ArrayList<OngoingTasks> ongoingTasksList = ongoingTasksBean.OngoingTasks();
            request.getSession().setAttribute("ongoingTasksList", ongoingTasksList);
            response.sendRedirect("./forms/OngoingTasks.jsp");
        }

        EmployeeTaskCompletedBean employeeTaskCompletedBean = new EmployeeTaskCompletedBean();
        employeeTaskCompletedBean.setEmployeeUsername(employeeUsername);
        if ("TasksCompleted".equals(button)) {
            ArrayList<EmployeeTaskCompleted> employeeComTaskDataList = employeeTaskCompletedBean.EmployeeTaskCompleted();
            request.getSession().setAttribute("employeeComTaskDataList", employeeComTaskDataList);
            response.sendRedirect("./forms/EmployeeTaskCompleted.jsp");
        }

        //EmployeeProfileBean employeeProfileBean = new EmployeeProfileBean();
        SelectEmployeeRatingAvgBean selectEmployeeRatingAvgBean = new SelectEmployeeRatingAvgBean();
        ReadEmployeeFullNameBean readEmployeeFullNameBean = new ReadEmployeeFullNameBean();
        //employeeProfileBean.setEmployeeUsername(employeeUsername);
        selectEmployeeRatingAvgBean.setEmployeeUserName(employeeUsername);
        readEmployeeFullNameBean.setUserName(employeeUsername);
        if ("MyProfile".equals(button)) {
            //ArrayList<EmployeeProfile> employeeProfileList = employeeProfileBean.EmployeeProfile();
            int employeeRatingAvg = selectEmployeeRatingAvgBean.SelectEmployeeRatingAvg();
            String employeefullname = readEmployeeFullNameBean.ReadEmployeeFullName();
            request.getSession().setAttribute("employeefullname", employeefullname);
            request.getSession().setAttribute("ratingemployeeavg", employeeRatingAvg);
            request.getSession().setAttribute("employeeUsername", employeeUsername);
            response.sendRedirect("./forms/EmployeeProfile.jsp");
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
