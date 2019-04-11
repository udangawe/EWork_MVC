package org.apache.jsp.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RatingEmployer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-star-rating/4.0.2/css/star-rating.min.css\" />\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-star-rating/4.0.2/js/star-rating.min.js\"></script> \n");
      out.write("    <center><h1>Rating of Employer</h1></center><br>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(\"#ratingemployer\").rating();\n");
      out.write("\n");
      out.write("        function ratingEmployerMessage() {\n");
      out.write("            var ratingemployer = document.getElementById(\"ratingemployer\").value;\n");
      out.write("            var employercomments = document.getElementById(\"employercomments\").value;\n");
      out.write("\n");
      out.write("            if (ratingemployer == \"\") {\n");
      out.write("                alert(\"Please rate employer\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            if (employercomments.length > 255) {\n");
      out.write("                alert(\"Comments about employer must not exceed 255 charachters\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            alert(\"Employer rated successfully\");\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form method=\"POST\" action=\"../RatingEmployee\" onsubmit=\"return ratingEmployerMessage();\">\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"lblEmployerUsername\">Employer Username</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"employerUsername\" name=\"employerUsername\" placeholder=\"Employer Username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employerUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"lblTaskId\">Task ID</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"taskId\" name=\"taskId\" placeholder=\"Task ID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"lblTask\">Task</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"task\" name=\"task\" placeholder=\"Task\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${task}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <br><label for=\"lblRatingEmployer\">Rating of Employer</label>\n");
      out.write("                <input id=\"ratingemployer\" name=\"ratingemployer\" class=\"rating rating-loading\" data-min=\"0\" data-max=\"5\" data-step=\"1\"><br><br><br><br>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" name=\"button\" value=\"btnEmployeeRatingSubmit\">Submit</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <br><label for=\"lblEmployerComments\">Comments about Employer</label>\n");
      out.write("                <textarea class=\"form-control\" rows=\"5\" id=\"employercomments\" name=\"employercomments\" placeholder=\"Comments about Employer\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <br><label for=\"lblRatedEmployeeUsername\">Rated Employee Username</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"ratedemployeeusername\" name=\"ratedemployeeusername\" placeholder=\"Rated Employee Username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employeeUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
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
