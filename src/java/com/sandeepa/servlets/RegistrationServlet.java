package com.sandeepa.servlets;

import com.sandeepa.beans.RegistrationBean;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class RegistrationServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
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
        String inputUsername = request.getParameter("inputUsername");
        String inputPassword = request.getParameter("inputPassword");
        String phoneNumber = request.getParameter("phoneNumber");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        String inlineRadioOptions = request.getParameter("inlineRadioOptions");
        
        Part filePart = request.getPart("uploadImage");
        InputStream inputStream = null;
        if (filePart != null) {
            inputStream = filePart.getInputStream();
        }
        
        RegistrationBean registrationBean = new RegistrationBean();
        registrationBean.setFirstName(firstName);
        registrationBean.setLastName(lastName);
        registrationBean.setInputEmail(inputEmail);
        registrationBean.setInputUsername(inputUsername);
        registrationBean.setInputPassword(inputPassword);
        registrationBean.setPhoneNumber(phoneNumber);
        registrationBean.setBirthday(birthday);
        registrationBean.setGender(gender);
        registrationBean.setCountry(country);
        registrationBean.setCity(city);
        registrationBean.setInlineRadioOptions(inlineRadioOptions);
        registrationBean.setInputStream(inputStream);
        
        int regStatus = registrationBean.addRegistration();
        
        PrintWriter out = response.getWriter();
        
        if (regStatus > 0) {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('This username already exists');");
            out.println("window.history.back();");
            out.println("</script>");
        } else {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('You have registered successfully!!!');");
            out.println("window.location = './forms/Login.jsp'");
            out.println("</script>");
        }
        
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
