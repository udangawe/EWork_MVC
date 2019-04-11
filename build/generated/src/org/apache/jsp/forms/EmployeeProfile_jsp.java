package org.apache.jsp.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmployeeProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_remove_var_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_remove_var_scope_nobody.release();
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
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <link href=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-star-rating/4.0.2/css/star-rating.min.css\" />\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/bootstrap-star-rating/4.0.2/js/star-rating.min.js\"></script>\n");
      out.write("\n");
      out.write("    <center><h1>Employee Profile</h1></center><br>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(\"#ratingemployee\").rating();\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form method=\"POST\" action=\"../EmployeeProfile\">\n");
      out.write("        <input type=\"hidden\" name=\"disableUpdateBtn\" id=\"disableUpdateBtn\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${disableUpdate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("\n");
      out.write("        <input type=\"hidden\" name=\"employeeUsername\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employeeUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-7 offset-md-3\">\n");
      out.write("                    <label for=\"lblEmployeeFullName\">Employee Full Name</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"employeefullname\" placeholder=\"Employee Full Name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employeefullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\"><br><br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-7 offset-md-3\">\n");
      out.write("                    <label for=\"lblRatingEmployee\">Rating as Employee</label>\n");
      out.write("                    <input id=\"ratingemployee\" name=\"ratingemployee\" class=\"rating rating-loading\" data-min=\"0\" data-max=\"5\" data-step=\"1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ratingemployeeavg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled><br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-7 offset-md-3\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\" name=\"button\" value=\"btnEmployerReviews\">Employer Reviews</button><br><br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-7 offset-md-3\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\" name=\"button\" value=\"btnJobsCompleted\">Jobs Completed</button><br><br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-7 offset-md-3\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\" name=\"button\" value=\"btnUpdateEmployeeProfile\" id=\"btnUpdateEmployeeProfile\">View Employee Details</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("    ");
      if (_jspx_meth_c_remove_0(_jspx_page_context))
        return;
      out.write("            \n");
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

  private boolean _jspx_meth_c_remove_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent(null);
    _jspx_th_c_remove_0.setVar("disableUpdate");
    _jspx_th_c_remove_0.setScope("session");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }
}
