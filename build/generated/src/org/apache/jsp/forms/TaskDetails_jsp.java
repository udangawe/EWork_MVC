package org.apache.jsp.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TaskDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script\n");
      out.write("            src=\"https://code.jquery.com/jquery-2.2.4.min.js\"\n");
      out.write("            integrity=\"sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function openBidforTask() {\n");
      out.write("                window.open(\"BidForTask.jsp\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function displayNoFile() {\n");
      out.write("                var fileName = document.getElementById(\"fileName\").value;\n");
      out.write("\n");
      out.write("                if (fileName == \"\") {\n");
      out.write("                    alert(\"No file contain for this record\");\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    <center><h1>Task Details</h1><br></center>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form method=\"POST\" action=\"../BestBids\">\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"employerUsername\">Employer UserName</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"employerUsername\" id=\"employerUsername\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hiddenEmployerUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"taskId\">Task ID</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"taskId\" id=\"taskId\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hiddenTaskId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"lblTaskName\">Task Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"taskName\" name=\"taskName\" placeholder=\"Task Name\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hiddenTaskName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"category\">Category</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"category\" id=\"category\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hiddenCategory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"taskDate\">Task Date</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"taskDate\" id=\"taskDate\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hiddenTaskDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"estimateVal\">Estimated Value</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"estimateVal\" id=\"estimateVal\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hiddenEstimatedVal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"lblFileName\">File Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"fileName\" name=\"fileName\" placeholder=\"File Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hiddenFileName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"><br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-12\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" name=\"button\" value=\"btnEmployerProfile\">Employer Profile</button>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" name=\"button\" value=\"bidforTaskBtn\">Bid for Task</button>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" name=\"button\" value=\"btnBestBids\">Best Bids</button>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" name=\"button\" value=\"btnDownloadFile\" onclick=\"displayNoFile();\">Download File</button>\n");
      out.write("            </div>    \n");
      out.write("        </div>\n");
      out.write("        <input type=\"hidden\" id=\"hiddenEmployeeUsername\" name=\"hiddenEmployeeUsername\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${hiddenEmployeeUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
