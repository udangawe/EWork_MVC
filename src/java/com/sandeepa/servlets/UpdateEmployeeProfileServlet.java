package com.sandeepa.servlets;

import com.sandeepa.beans.UpdateEmployeeProfileBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateEmployeeProfileServlet extends HttpServlet {

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

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String inputEmail = request.getParameter("inputEmail");
        String phoneNumber = request.getParameter("phoneNumber");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String employeeUsername = request.getParameter("employeeUsername");

        UpdateEmployeeProfileBean updateEmployeeProfileBean = new UpdateEmployeeProfileBean();
        updateEmployeeProfileBean.setFirstName(firstName);
        updateEmployeeProfileBean.setLastName(lastName);
        updateEmployeeProfileBean.setInputEmail(inputEmail);
        updateEmployeeProfileBean.setPhoneNumber(phoneNumber);
        updateEmployeeProfileBean.setBirthday(birthday);
        updateEmployeeProfileBean.setGender(gender);
        updateEmployeeProfileBean.setCountry(country);
        updateEmployeeProfileBean.setCity(city);
        updateEmployeeProfileBean.setEmployeeUsername(employeeUsername);

        updateEmployeeProfileBean.UpdateEmployeeProfile();
        response.sendRedirect("./forms/Employee.jsp");

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
