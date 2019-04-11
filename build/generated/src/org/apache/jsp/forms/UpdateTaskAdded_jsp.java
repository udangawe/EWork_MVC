package org.apache.jsp.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UpdateTaskAdded_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                $(\"#taskDate\").datepicker({\n");
      out.write("                    dateFormat: \"yy-mm-dd\",\n");
      out.write("                    changeYear: true\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            .ui-datepicker select.ui-datepicker-year {\n");
      out.write("                color: black;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    <input type=\"hidden\" name=\"hiddenCategory\" id=\"hiddenCategory\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("    <script>\n");
      out.write("        var hiddenCategory = document.getElementById(\"hiddenCategory\").value;\n");
      out.write("\n");
      out.write("        function selectCategory() {\n");
      out.write("            SelectElement(\"Category\", hiddenCategory);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function SelectElement(id, valueToSelect) {\n");
      out.write("            var element = document.getElementById(id);\n");
      out.write("            element.value = valueToSelect;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function EditMessage() {\n");
      out.write("            alert(\"Task edited successfully\");\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    <center><h1>Update Task Added</h1></center><br>\n");
      out.write("</head>\n");
      out.write("<body onload=\"selectCategory();\">\n");
      out.write("    <form method=\"POST\" action=\"../UpdateTaskAdded\">\n");
      out.write("        <input type=\"hidden\" name=\"taskId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-3\">\n");
      out.write("                <label for=\"lblTask\">Task</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"task\" name=\"task\" placeholder=\"Task\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" onclick=\"EditMessage();\">Edit Task</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-3\">\n");
      out.write("                <label for=\"Category\">Category</label>\n");
      out.write("                <select id=\"Category\" name=\"Category\" class=\"form-control\">\n");
      out.write("                    <option value=\"\" selected>Choose Category</option>\n");
      out.write("                    <option>Category 1</option>\n");
      out.write("                    <option>Category 2</option>\n");
      out.write("                    <option>Category 3</option>\n");
      out.write("                    <option>Category 4</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-3\">\n");
      out.write("                <label for=\"lblEstimatedValue\">Estimated Value</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"estimateVal\" name=\"estimateVal\" placeholder=\"Estimated Value\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estimatedVal}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-3\">\n");
      out.write("                <label for=\"lblTaskDate\">Task Date</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"taskDate\" name=\"taskDate\" placeholder=\"Task Date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
