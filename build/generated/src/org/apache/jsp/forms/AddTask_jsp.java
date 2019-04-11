package org.apache.jsp.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddTask_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <link href = \"https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css\"\n");
      out.write("              rel = \"stylesheet\">\n");
      out.write("        <script src = \"https://code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src = \"https://code.jquery.com/ui/1.10.4/jquery-ui.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#TaskDate\").datepicker({\n");
      out.write("                    changeYear: true,\n");
      out.write("                    dateFormat: \"yy-mm-dd\"\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .ui-datepicker select.ui-datepicker-year {\n");
      out.write("                color: black;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function validateAddTask() {\n");
      out.write("                var Task = document.getElementById(\"Task\").value;\n");
      out.write("                var Category = document.getElementById(\"Category\").value;\n");
      out.write("                var TaskDate = document.getElementById(\"TaskDate\").value;\n");
      out.write("\n");
      out.write("                if (Task == \"\") {\n");
      out.write("                    alert(\"Task name must be filled out\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (Category == \"\") {\n");
      out.write("                    alert(\"Category must be selected\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (TaskDate == \"\") {\n");
      out.write("                    alert(\"Task Date must be filled out\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                alert(\"Task Added Sucessfully\");\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function getUploadedFileName() {\n");
      out.write("                var uploadfile = document.getElementById(\"uploadfile\").value;\n");
      out.write("                document.getElementById(\"uploadedfilename\").value = uploadfile.replace(\"C:\\\\fakepath\\\\\", \"\");\n");
      out.write("                document.getElementById(\"filepath\").value = uploadfile;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    <center><h1>Add Task</h1></center>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form method=\"POST\" action=\"../AddTask\" onsubmit=\"return validateAddTask()\" autocomplete=\"off\">\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-7\">\n");
      out.write("                <label for=\"Task\">Task</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"Task\" id=\"Task\" placeholder=\"Task Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-7\">\n");
      out.write("                <label for=\"Category\">Category</label>\n");
      out.write("                <select id=\"Category\" name=\"Category\" class=\"form-control\">\n");
      out.write("                    <option value=\"\" selected>Choose Category</option>\n");
      out.write("                    <option>Category 1</option>\n");
      out.write("                    <option>Category 2</option>\n");
      out.write("                    <option>Category 3</option>\n");
      out.write("                    <option>Category 4</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-7\">\n");
      out.write("                <label for=\"estimatedValue\">Estimated Value</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"estimatedValue\" id=\"estimatedValue\" placeholder=\"Estimated value offered in completion\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-7\">\n");
      out.write("                <label for=\"TaskDate\">Task Date</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"TaskDate\" id=\"TaskDate\" placeholder=\"Task Date\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-7\">\n");
      out.write("                <label for=\"lblUploadFile\">Upload File</label>\n");
      out.write("                <input type=\"file\" class=\"form-control-file\" id=\"uploadfile\" name=\"uploadfile\" onchange=\"getUploadedFileName();\"><br><br>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Add</button>\n");
      out.write("                <button type=\"reset\" class=\"btn btn-primary\">Cancel</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <input type=\"hidden\" name=\"username\" id=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("        <input type=\"hidden\" name=\"uploadedfilename\" id=\"uploadedfilename\" />\n");
      out.write("        <input type=\"hidden\" name=\"filepath\" id=\"filepath\" />\n");
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
