package com.sandeepa.servlets;

import com.sandeepa.beans.UpdateEmployerProfileBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateEmployerProfileServlet extends HttpServlet {

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
        String username = request.getParameter("username");

        String button = request.getParameter("button");

        UpdateEmployerProfileBean updateEmployerProfileBean = new UpdateEmployerProfileBean();
        updateEmployerProfileBean.setFirstName(firstName);
        updateEmployerProfileBean.setLastName(lastName);
        updateEmployerProfileBean.setInputEmail(inputEmail);
        updateEmployerProfileBean.setPhoneNumber(phoneNumber);
        updateEmployerProfileBean.setBirthday(birthday);
        updateEmployerProfileBean.setGender(gender);
        updateEmployerProfileBean.setCountry(country);
        updateEmployerProfileBean.setCity(city);
        updateEmployerProfileBean.setUsername(username);
        if ("btnUpdateEmployer".equals(button)) {

            updateEmployerProfileBean.UpdateEmployerProfile();
            response.sendRedirect("./forms/Employer.jsp");
        }

        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
