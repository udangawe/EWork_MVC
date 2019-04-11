package com.sandeepa.servlets;

import com.sandeepa.beans.BestBidsBean;
import com.sandeepa.beans.ReadEmployerFullNameBean;
import com.sandeepa.beans.ViewEmployerProfileBean;
import com.sandeepa.dbcon.ConnectionManager;
import com.sandeepa.listclasses.BestBids;
import com.sandeepa.listclasses.ViewEmployerProfile;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BestBidsServlet extends HttpServlet {

    private static final int BUFFER_SIZE = 4096;

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

        String employerUsername = request.getParameter("employerUsername");
        String taskId = request.getParameter("taskId");
        String category = request.getParameter("category");
        String taskDate = request.getParameter("taskDate");
        String estimateVal = request.getParameter("estimateVal");
        String hiddenEmployeeUsername = request.getParameter("hiddenEmployeeUsername");

        String button = request.getParameter("button");

        if ("bidforTaskBtn".equals(button)) {

            request.getSession().setAttribute("employerUsername", employerUsername);
            request.getSession().setAttribute("taskId", taskId);
            request.getSession().setAttribute("category", category);
            request.getSession().setAttribute("taskDate", taskDate);
            request.getSession().setAttribute("estimateVal", estimateVal);
            request.getSession().setAttribute("hiddenEmployeeUsername", hiddenEmployeeUsername);
            response.sendRedirect("./forms/BidForTask.jsp");
        }

        BestBidsBean bestBidsBean = new BestBidsBean();
        bestBidsBean.setTaskId(taskId);
        if ("btnBestBids".equals(button)) {
            ArrayList<BestBids> bestBidsList = bestBidsBean.BestBids();
            request.getSession().setAttribute("bestBidsList", bestBidsList);
            request.getSession().setAttribute("username", hiddenEmployeeUsername);
            response.sendRedirect("./forms/BestBids.jsp");
        }

        Connection con = null;
        PreparedStatement statement = null;
        ResultSet rs = null;

        String downloadFileName = request.getParameter("fileName");

        if ("btnDownloadFile".equals(button) && !downloadFileName.trim().equals("")) {

            con = ConnectionManager.getConnection();
            String downloadFileSql = "SELECT * FROM addtask WHERE taskid = ?";
            try {
                statement = con.prepareStatement(downloadFileSql);
                statement.setString(1, taskId);
                rs = statement.executeQuery();
                if (rs.next()) {

                    String fileName = rs.getString("uploadedfilename");
                    Blob blob = rs.getBlob("uploadedfile");
                    InputStream inputStream = blob.getBinaryStream();
                    int fileLength = inputStream.available();

                    ServletContext context = getServletContext();

                    String mimeType = context.getMimeType(fileName);
                    if (mimeType == null) {
                        mimeType = "application/octet-stream";
                    }

                    response.setContentType(mimeType);
                    response.setContentLength(fileLength);
                    String headerKey = "Content-Disposition";
                    String headerValue = String.format("attachment; filename=\"%s\"", fileName);
                    response.setHeader(headerKey, headerValue);

                    OutputStream outStream = response.getOutputStream();

                    byte[] buffer = new byte[BUFFER_SIZE];
                    int bytesRead = -1;

                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outStream.write(buffer, 0, bytesRead);
                    }

                    inputStream.close();
                    outStream.flush();
                    outStream.close();

                }

            } catch (SQLException ex) {

            } finally {
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException ex) {

                    }
                }
            }

        }

        if ("btnDownloadFile".equals(button) && downloadFileName.trim().equals("")) {
            response.sendRedirect("./forms/TaskDetails.jsp");
        }
        
        String employeeUsername = request.getParameter("username");
        if ("EmployeeHomePage".equals(button)) {
            request.getSession().setAttribute("username", employeeUsername);
            response.sendRedirect("./forms/Employee.jsp");
        }
        
        ReadEmployerFullNameBean readEmployerFullNameBean = new ReadEmployerFullNameBean();
        readEmployerFullNameBean.setUserName(employerUsername);
        ViewEmployerProfileBean viewEmployerProfileBean = new ViewEmployerProfileBean();
        viewEmployerProfileBean.setEmployerUsername(employerUsername);
        if ("btnEmployerProfile".equals(button)) {
            ArrayList<ViewEmployerProfile> viewEmployerProfileList = viewEmployerProfileBean.ViewEmployerProfile();

            String employerfullname = readEmployerFullNameBean.ReadEmployerFullName();
            request.getSession().setAttribute("employerfullname", employerfullname);
            request.getSession().setAttribute("employerratingavg", viewEmployerProfileList.get(0).getEmployerratingavg());
            request.getSession().setAttribute("username", employerUsername);
            request.getSession().setAttribute("disableEmployerUpdate", "disableEmployerUpdate");
            response.sendRedirect("./forms/EmployerProfile.jsp");
        }
        
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
