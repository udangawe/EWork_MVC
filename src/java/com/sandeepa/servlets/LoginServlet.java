package com.sandeepa.servlets;

import com.sandeepa.beans.LoginBean;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    
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
        
        String username = request.getParameter("username");
        String inputPassword = request.getParameter("inputPassword");
        HttpSession session = request.getSession(false);
        Cookie cookie = new Cookie("username", username);
        
        LoginBean loginBean = new LoginBean();
        loginBean.setUsername(username);
        loginBean.setInputPassword(inputPassword);
        
        String loginStatus = loginBean.userLogin();
        if (loginStatus.equals("Employee")) {
            session.setAttribute("username", username);
            response.addCookie(cookie);
            response.sendRedirect("./forms/Employee.jsp");
        }
        
        if (loginStatus.equals("Employer")) {
            session.setAttribute("username", username);
            response.addCookie(cookie);
            response.sendRedirect("./forms/Employer.jsp");
        }        
        
        if (loginStatus.equals("Login Failed")) {
            session.setAttribute("username", username);
            session.setAttribute("inputPassword", inputPassword);
            session.setAttribute("message", "Please check your username and password");
            response.sendRedirect("./forms/Login.jsp");
        }
        
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
