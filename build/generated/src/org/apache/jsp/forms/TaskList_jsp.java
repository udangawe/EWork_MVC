package org.apache.jsp.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TaskList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_dataSource_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_param_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_setDataSource_dataSource_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_param_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_remove_var_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_setDataSource_dataSource_nobody.release();
    _jspx_tagPool_sql_param_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_remove_var_scope_nobody.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_sql_query_var.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#fromDate\").datepicker({\n");
      out.write("                    dateFormat: \"yy-mm-dd\",\n");
      out.write("                    changeYear: true\n");
      out.write("                });\n");
      out.write("                $(\"#toDate\").datepicker({\n");
      out.write("                    dateFormat: \"yy-mm-dd\",\n");
      out.write("                    changeYear: true\n");
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
      out.write("            function resetPage() {\n");
      out.write("                window.location = 'TaskList.jsp';\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function validateTaskList() {\n");
      out.write("                var fromDate = document.getElementById(\"fromDate\").value;\n");
      out.write("                var toDate = document.getElementById(\"toDate\").value;\n");
      out.write("\n");
      out.write("                if ((fromDate == \"\") && (toDate != \"\")) {\n");
      out.write("                    alert(\"If you fill To Date you should fill From Date also\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if ((fromDate != \"\") && (toDate == \"\")) {\n");
      out.write("                    alert(\"If you fill From Date you should fill To Date also\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function getTaskListTbDetails(x) {\n");
      out.write("                var rindex = x.rowIndex;\n");
      out.write("                var hiddenEmployerUsername = document.getElementById(\"taskListTb\").rows[rindex].cells[6].innerHTML;\n");
      out.write("                var hiddenTaskId = document.getElementById(\"taskListTb\").rows[rindex].cells[1].innerHTML;\n");
      out.write("                var hiddenCategory = document.getElementById(\"taskListTb\").rows[rindex].cells[3].innerHTML;\n");
      out.write("                var hiddenTaskDate = document.getElementById(\"taskListTb\").rows[rindex].cells[5].innerHTML;\n");
      out.write("                var hiddenEstimatedVal = document.getElementById(\"taskListTb\").rows[rindex].cells[4].innerHTML;\n");
      out.write("                var hiddenFileName = document.getElementById(\"taskListTb\").rows[rindex].cells[7].innerHTML;\n");
      out.write("                var hiddenTaskName = document.getElementById(\"taskListTb\").rows[rindex].cells[2].innerHTML;\n");
      out.write("\n");
      out.write("                document.getElementById(\"hiddenEmployerUsername\").value = hiddenEmployerUsername;\n");
      out.write("                document.getElementById(\"hiddenTaskId\").value = hiddenTaskId;\n");
      out.write("                document.getElementById(\"hiddenCategory\").value = hiddenCategory;\n");
      out.write("                document.getElementById(\"hiddenTaskDate\").value = hiddenTaskDate;\n");
      out.write("                document.getElementById(\"hiddenEstimatedVal\").value = hiddenEstimatedVal;\n");
      out.write("                document.getElementById(\"hiddenFileName\").value = hiddenFileName;\n");
      out.write("                document.getElementById(\"hiddenTaskName\").value = hiddenTaskName;\n");
      out.write("\n");
      out.write("                //window.open(\"TaskDetails.jsp\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    <center><h1>Task List</h1></center>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_sql_setDataSource_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("    ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("    ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_9(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_10(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_11(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_12(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_13(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_14(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_15(_jspx_page_context))
        return;
      out.write("        \n");
      out.write("\n");
      out.write("    <form method=\"POST\" action=\"../TaskList\" onsubmit=\"return validateTaskList()\">\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-2\">\n");
      out.write("                <label for=\"Category\">Category</label>\n");
      out.write("                <select id=\"Category\" name=\"Category\" class=\"form-control\">\n");
      out.write("                    <option value=\"\" selected>Choose Category</option>\n");
      out.write("                    <option>Category 1</option>\n");
      out.write("                    <option>Category 2</option>\n");
      out.write("                    <option>Category 3</option>\n");
      out.write("                    <option>Category 4</option>\n");
      out.write("                </select><br>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\" name=\"button\" value=\"selectBtn\">Select</button>\n");
      out.write("                <button type=\"reset\" class=\"btn btn-primary\" onclick=\"resetPage()\">Reset</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-2\">\n");
      out.write("                <label for=\"taskId\">Task ID</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"taskId\" name=\"taskId\" placeholder=\"Task ID\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-2\">\n");
      out.write("                <label for=\"fromDate\">From Date</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"fromDate\" name=\"fromDate\" placeholder=\"From Date\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-2\">\n");
      out.write("                <label for=\"toDate\">To Date</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"toDate\" name=\"toDate\" placeholder=\"To Date\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-3\">\n");
      out.write("                <label for=\"estimatedVal\">Estimated Value</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"estimatedVal\" name=\"estimatedVal\" placeholder=\"Estimated Value\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-12\">\n");
      out.write("                <div class=\"table-responsive\">\n");
      out.write("                    <br><table class=\"table\" id=\"taskListTb\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th></th>\n");
      out.write("                                <th>Task ID</th>\n");
      out.write("                                <th>Task Name</th>\n");
      out.write("                                <th>Category</th>\n");
      out.write("                                <th>Estimated Value</th>\n");
      out.write("                                <th>Task Date</th>\n");
      out.write("                                <th style=\"display: none;\">UserName</th>\n");
      out.write("                                <th style=\"display: none;\">File Name</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>    \n");
      out.write("        </div>\n");
      out.write("        <input type=\"hidden\" id=\"hiddenEmployerUsername\" name=\"hiddenEmployerUsername\" />\n");
      out.write("        <input type=\"hidden\" id=\"hiddenTaskId\" name=\"hiddenTaskId\" />\n");
      out.write("        <input type=\"hidden\" id=\"hiddenCategory\" name=\"hiddenCategory\" />\n");
      out.write("        <input type=\"hidden\" id=\"hiddenTaskDate\" name=\"hiddenTaskDate\" />\n");
      out.write("        <input type=\"hidden\" id=\"hiddenEstimatedVal\" name=\"hiddenEstimatedVal\" />\n");
      out.write("        <input type=\"hidden\" id=\"hiddenEmployeeUsername\" name=\"hiddenEmployeeUsername\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${employeeUsername}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("        <input type=\"hidden\" id=\"hiddenFileName\" name=\"hiddenFileName\" />\n");
      out.write("        <input type=\"hidden\" id=\"hiddenTaskName\" name=\"hiddenTaskName\" />\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_remove_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_remove_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_remove_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_remove_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_remove_4(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("myDS");
    _jspx_th_sql_setDataSource_0.setDriver("com.mysql.jdbc.Driver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:mysql://localhost:3306/projectdb2");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("root");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_sql_setDataSource_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_1 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_dataSource_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_1.setParent(null);
    _jspx_th_sql_setDataSource_1.setDataSource((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${myDS}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_setDataSource_1 = _jspx_th_sql_setDataSource_1.doStartTag();
    if (_jspx_th_sql_setDataSource_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_dataSource_nobody.reuse(_jspx_th_sql_setDataSource_1);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_dataSource_nobody.reuse(_jspx_th_sql_setDataSource_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty Category && empty taskId && empty fromDate && empty toDate && empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_sql_query_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_sql_query_0.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask ORDER BY taskdate DESC;\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty Category && empty taskId && empty fromDate && empty toDate && empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_sql_query_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_1 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_sql_query_1.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_1 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_1 = _jspx_th_sql_query_1.doStartTag();
      if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_1[0]++;
          _jspx_th_sql_query_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_1.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE category = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_1, _jspx_page_context, _jspx_push_body_count_sql_query_1))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_1[0]--;
      }
      if (_jspx_th_sql_query_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_1.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_1);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_0 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_1);
    _jspx_th_sql_param_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_0 = _jspx_th_sql_param_0.doStartTag();
    if (_jspx_th_sql_param_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_0);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty Category && not empty taskId && empty fromDate && empty toDate && empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_sql_query_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_2 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_sql_query_2.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_2 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_2 = _jspx_th_sql_query_2.doStartTag();
      if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_2[0]++;
          _jspx_th_sql_query_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_2.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE taskid = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_2, _jspx_page_context, _jspx_push_body_count_sql_query_2))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_2[0]--;
      }
      if (_jspx_th_sql_query_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_2.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_2);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_1(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_1 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_1.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_2);
    _jspx_th_sql_param_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_1 = _jspx_th_sql_param_1.doStartTag();
    if (_jspx_th_sql_param_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_1);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty Category && empty taskId && not empty fromDate && not empty toDate && empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_sql_query_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_3 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_sql_query_3.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_3 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_3 = _jspx_th_sql_query_3.doStartTag();
      if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_3[0]++;
          _jspx_th_sql_query_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_3.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE taskdate BETWEEN ? AND ?;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_3, _jspx_page_context, _jspx_push_body_count_sql_query_3))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_3, _jspx_page_context, _jspx_push_body_count_sql_query_3))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_3[0]--;
      }
      if (_jspx_th_sql_query_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_3.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_3);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_2(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_2 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_2.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_3);
    _jspx_th_sql_param_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_2 = _jspx_th_sql_param_2.doStartTag();
    if (_jspx_th_sql_param_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_2);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_2);
    return false;
  }

  private boolean _jspx_meth_sql_param_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_3 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_3.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_3);
    _jspx_th_sql_param_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_3 = _jspx_th_sql_param_3.doStartTag();
    if (_jspx_th_sql_param_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_3);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty Category && empty taskId && empty fromDate && empty toDate && not empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_sql_query_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_4 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_4.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_sql_query_4.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_4 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_4 = _jspx_th_sql_query_4.doStartTag();
      if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_4[0]++;
          _jspx_th_sql_query_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_4.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE estimatedvalue = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_4, _jspx_page_context, _jspx_push_body_count_sql_query_4))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_4[0]--;
      }
      if (_jspx_th_sql_query_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_4.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_4);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_4(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_4 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_4.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_4);
    _jspx_th_sql_param_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estimatedVal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_4 = _jspx_th_sql_param_4.doStartTag();
    if (_jspx_th_sql_param_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_4);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty Category && not empty taskId && empty fromDate && empty toDate && empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_sql_query_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_5 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_5.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_sql_query_5.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_5 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_5 = _jspx_th_sql_query_5.doStartTag();
      if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_5[0]++;
          _jspx_th_sql_query_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_5.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE taskid = ? && category = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_5, _jspx_page_context, _jspx_push_body_count_sql_query_5))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_5, _jspx_page_context, _jspx_push_body_count_sql_query_5))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_5[0]--;
      }
      if (_jspx_th_sql_query_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_5.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_5);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_5(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_5 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_5.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_5);
    _jspx_th_sql_param_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_5 = _jspx_th_sql_param_5.doStartTag();
    if (_jspx_th_sql_param_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_5);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_5);
    return false;
  }

  private boolean _jspx_meth_sql_param_6(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_6 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_6.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_5);
    _jspx_th_sql_param_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_6 = _jspx_th_sql_param_6.doStartTag();
    if (_jspx_th_sql_param_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_6);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_6);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty Category && empty taskId && not empty fromDate && not empty toDate && empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_sql_query_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_6 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_6.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_sql_query_6.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_6 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_6 = _jspx_th_sql_query_6.doStartTag();
      if (_jspx_eval_sql_query_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_6[0]++;
          _jspx_th_sql_query_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_6.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE taskdate BETWEEN ? AND ? && category = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_6, _jspx_page_context, _jspx_push_body_count_sql_query_6))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_6, _jspx_page_context, _jspx_push_body_count_sql_query_6))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_6, _jspx_page_context, _jspx_push_body_count_sql_query_6))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_6[0]--;
      }
      if (_jspx_th_sql_query_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_6.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_6);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_7(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_7 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_7.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_6);
    _jspx_th_sql_param_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_7 = _jspx_th_sql_param_7.doStartTag();
    if (_jspx_th_sql_param_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_7);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_7);
    return false;
  }

  private boolean _jspx_meth_sql_param_8(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_8 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_8.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_6);
    _jspx_th_sql_param_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_8 = _jspx_th_sql_param_8.doStartTag();
    if (_jspx_th_sql_param_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_8);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_8);
    return false;
  }

  private boolean _jspx_meth_sql_param_9(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_9 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_9.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_6);
    _jspx_th_sql_param_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_9 = _jspx_th_sql_param_9.doStartTag();
    if (_jspx_th_sql_param_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_9);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_9);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty Category && empty taskId && empty fromDate && empty toDate && not empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_sql_query_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_7 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_7.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_sql_query_7.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_7 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_7 = _jspx_th_sql_query_7.doStartTag();
      if (_jspx_eval_sql_query_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_7[0]++;
          _jspx_th_sql_query_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_7.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE category = ? && estimatedvalue = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_7, _jspx_page_context, _jspx_push_body_count_sql_query_7))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_7, _jspx_page_context, _jspx_push_body_count_sql_query_7))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_7[0]--;
      }
      if (_jspx_th_sql_query_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_7.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_7);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_10(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_10 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_10.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_7);
    _jspx_th_sql_param_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_10 = _jspx_th_sql_param_10.doStartTag();
    if (_jspx_th_sql_param_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_10);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_10);
    return false;
  }

  private boolean _jspx_meth_sql_param_11(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_11 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_11.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_7);
    _jspx_th_sql_param_11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estimatedVal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_11 = _jspx_th_sql_param_11.doStartTag();
    if (_jspx_th_sql_param_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_11);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_11);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty Category && not empty taskId && not empty fromDate && not empty toDate && empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_sql_query_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_8 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_8.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_sql_query_8.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_8 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_8 = _jspx_th_sql_query_8.doStartTag();
      if (_jspx_eval_sql_query_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_8[0]++;
          _jspx_th_sql_query_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_8.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE taskid = ? && taskdate BETWEEN ? AND ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_8, _jspx_page_context, _jspx_push_body_count_sql_query_8))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_8, _jspx_page_context, _jspx_push_body_count_sql_query_8))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_8, _jspx_page_context, _jspx_push_body_count_sql_query_8))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_8[0]--;
      }
      if (_jspx_th_sql_query_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_8.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_8);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_12(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_12 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_12.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_8);
    _jspx_th_sql_param_12.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_12 = _jspx_th_sql_param_12.doStartTag();
    if (_jspx_th_sql_param_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_12);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_12);
    return false;
  }

  private boolean _jspx_meth_sql_param_13(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_13 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_13.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_8);
    _jspx_th_sql_param_13.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_13 = _jspx_th_sql_param_13.doStartTag();
    if (_jspx_th_sql_param_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_13);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_13);
    return false;
  }

  private boolean _jspx_meth_sql_param_14(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_8)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_14 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_14.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_8);
    _jspx_th_sql_param_14.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_14 = _jspx_th_sql_param_14.doStartTag();
    if (_jspx_th_sql_param_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_14);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_14);
    return false;
  }

  private boolean _jspx_meth_c_if_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent(null);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty Category && empty taskId && not empty fromDate && not empty toDate && not empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_sql_query_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_9 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_9.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_9);
    _jspx_th_sql_query_9.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_9 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_9 = _jspx_th_sql_query_9.doStartTag();
      if (_jspx_eval_sql_query_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_9[0]++;
          _jspx_th_sql_query_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_9.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE taskdate BETWEEN ? AND ? && estimatedvalue = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_9, _jspx_page_context, _jspx_push_body_count_sql_query_9))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_9, _jspx_page_context, _jspx_push_body_count_sql_query_9))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_9, _jspx_page_context, _jspx_push_body_count_sql_query_9))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_9[0]--;
      }
      if (_jspx_th_sql_query_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_9.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_9);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_15(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_15 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_15.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_9);
    _jspx_th_sql_param_15.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_15 = _jspx_th_sql_param_15.doStartTag();
    if (_jspx_th_sql_param_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_15);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_15);
    return false;
  }

  private boolean _jspx_meth_sql_param_16(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_16 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_16.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_9);
    _jspx_th_sql_param_16.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_16 = _jspx_th_sql_param_16.doStartTag();
    if (_jspx_th_sql_param_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_16);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_16);
    return false;
  }

  private boolean _jspx_meth_sql_param_17(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_17 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_17.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_9);
    _jspx_th_sql_param_17.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estimatedVal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_17 = _jspx_th_sql_param_17.doStartTag();
    if (_jspx_th_sql_param_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_17);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_17);
    return false;
  }

  private boolean _jspx_meth_c_if_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent(null);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty Category && not empty taskId && empty fromDate && empty toDate && not empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_sql_query_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_10 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_10.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_sql_query_10.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_10 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_10 = _jspx_th_sql_query_10.doStartTag();
      if (_jspx_eval_sql_query_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_10[0]++;
          _jspx_th_sql_query_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_10.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE taskid = ? && estimatedvalue = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_10, _jspx_page_context, _jspx_push_body_count_sql_query_10))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_10, _jspx_page_context, _jspx_push_body_count_sql_query_10))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_10.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_10[0]--;
      }
      if (_jspx_th_sql_query_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_10.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_10);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_18(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_18 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_18.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_10);
    _jspx_th_sql_param_18.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_18 = _jspx_th_sql_param_18.doStartTag();
    if (_jspx_th_sql_param_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_18);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_18);
    return false;
  }

  private boolean _jspx_meth_sql_param_19(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_19 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_19.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_10);
    _jspx_th_sql_param_19.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estimatedVal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_19 = _jspx_th_sql_param_19.doStartTag();
    if (_jspx_th_sql_param_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_19);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_19);
    return false;
  }

  private boolean _jspx_meth_c_if_11(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent(null);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty Category && not empty taskId && not empty fromDate && not empty toDate && empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_11, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_sql_query_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_11 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_11.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_11);
    _jspx_th_sql_query_11.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_11 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_11 = _jspx_th_sql_query_11.doStartTag();
      if (_jspx_eval_sql_query_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_11[0]++;
          _jspx_th_sql_query_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_11.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE category = ? && taskdate BETWEEN ? AND ? && taskid = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_11, _jspx_page_context, _jspx_push_body_count_sql_query_11))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_11, _jspx_page_context, _jspx_push_body_count_sql_query_11))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_11, _jspx_page_context, _jspx_push_body_count_sql_query_11))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_11, _jspx_page_context, _jspx_push_body_count_sql_query_11))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_11.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_11[0]--;
      }
      if (_jspx_th_sql_query_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_11.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_11);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_20(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_20 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_20.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_11);
    _jspx_th_sql_param_20.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_20 = _jspx_th_sql_param_20.doStartTag();
    if (_jspx_th_sql_param_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_20);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_20);
    return false;
  }

  private boolean _jspx_meth_sql_param_21(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_21 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_21.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_11);
    _jspx_th_sql_param_21.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_21 = _jspx_th_sql_param_21.doStartTag();
    if (_jspx_th_sql_param_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_21);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_21);
    return false;
  }

  private boolean _jspx_meth_sql_param_22(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_22 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_22.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_11);
    _jspx_th_sql_param_22.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_22 = _jspx_th_sql_param_22.doStartTag();
    if (_jspx_th_sql_param_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_22);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_22);
    return false;
  }

  private boolean _jspx_meth_sql_param_23(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_23 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_23.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_11);
    _jspx_th_sql_param_23.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_23 = _jspx_th_sql_param_23.doStartTag();
    if (_jspx_th_sql_param_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_23);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_23);
    return false;
  }

  private boolean _jspx_meth_c_if_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent(null);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty Category && not empty taskId && not empty fromDate && not empty toDate && not empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_sql_query_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_12 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_12.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_12);
    _jspx_th_sql_query_12.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_12 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_12 = _jspx_th_sql_query_12.doStartTag();
      if (_jspx_eval_sql_query_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_12[0]++;
          _jspx_th_sql_query_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_12.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE taskdate BETWEEN ? AND ? && taskid = ? && estimatedvalue = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_12, _jspx_page_context, _jspx_push_body_count_sql_query_12))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_12, _jspx_page_context, _jspx_push_body_count_sql_query_12))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_12, _jspx_page_context, _jspx_push_body_count_sql_query_12))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_12, _jspx_page_context, _jspx_push_body_count_sql_query_12))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_12.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_12[0]--;
      }
      if (_jspx_th_sql_query_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_12.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_12);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_24(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_24 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_24.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_12);
    _jspx_th_sql_param_24.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_24 = _jspx_th_sql_param_24.doStartTag();
    if (_jspx_th_sql_param_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_24);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_24);
    return false;
  }

  private boolean _jspx_meth_sql_param_25(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_25 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_25.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_12);
    _jspx_th_sql_param_25.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_25 = _jspx_th_sql_param_25.doStartTag();
    if (_jspx_th_sql_param_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_25);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_25);
    return false;
  }

  private boolean _jspx_meth_sql_param_26(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_26 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_26.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_12);
    _jspx_th_sql_param_26.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_26 = _jspx_th_sql_param_26.doStartTag();
    if (_jspx_th_sql_param_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_26);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_26);
    return false;
  }

  private boolean _jspx_meth_sql_param_27(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_27 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_27.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_12);
    _jspx_th_sql_param_27.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estimatedVal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_27 = _jspx_th_sql_param_27.doStartTag();
    if (_jspx_th_sql_param_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_27);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_27);
    return false;
  }

  private boolean _jspx_meth_c_if_13(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent(null);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty Category && not empty taskId && empty fromDate && empty toDate && not empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_13, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_sql_query_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_13 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_13.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_13);
    _jspx_th_sql_query_13.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_13 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_13 = _jspx_th_sql_query_13.doStartTag();
      if (_jspx_eval_sql_query_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_13[0]++;
          _jspx_th_sql_query_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_13.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE category = ? && taskid = ? && estimatedvalue = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_13, _jspx_page_context, _jspx_push_body_count_sql_query_13))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_29((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_13, _jspx_page_context, _jspx_push_body_count_sql_query_13))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_30((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_13, _jspx_page_context, _jspx_push_body_count_sql_query_13))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_13.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_13[0]--;
      }
      if (_jspx_th_sql_query_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_13[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_13.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_13.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_13);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_28(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_28 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_28.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_13);
    _jspx_th_sql_param_28.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_28 = _jspx_th_sql_param_28.doStartTag();
    if (_jspx_th_sql_param_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_28);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_28);
    return false;
  }

  private boolean _jspx_meth_sql_param_29(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_29 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_29.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_29.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_13);
    _jspx_th_sql_param_29.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_29 = _jspx_th_sql_param_29.doStartTag();
    if (_jspx_th_sql_param_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_29);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_29);
    return false;
  }

  private boolean _jspx_meth_sql_param_30(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_30 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_30.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_30.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_13);
    _jspx_th_sql_param_30.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estimatedVal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_30 = _jspx_th_sql_param_30.doStartTag();
    if (_jspx_th_sql_param_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_30);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_30);
    return false;
  }

  private boolean _jspx_meth_c_if_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent(null);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty Category && empty taskId && not empty fromDate && not empty toDate && not empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_14, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_sql_query_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_14 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_14.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_14);
    _jspx_th_sql_query_14.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_14 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_14 = _jspx_th_sql_query_14.doStartTag();
      if (_jspx_eval_sql_query_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_14[0]++;
          _jspx_th_sql_query_14.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_14.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE category = ? && taskdate BETWEEN ? AND ? && estimatedvalue = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_31((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_14, _jspx_page_context, _jspx_push_body_count_sql_query_14))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_14, _jspx_page_context, _jspx_push_body_count_sql_query_14))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_14, _jspx_page_context, _jspx_push_body_count_sql_query_14))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_34((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_14, _jspx_page_context, _jspx_push_body_count_sql_query_14))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_14.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_14 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_14[0]--;
      }
      if (_jspx_th_sql_query_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_14[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_14.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_14.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_14);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_31(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_31 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_31.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_31.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_14);
    _jspx_th_sql_param_31.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_31 = _jspx_th_sql_param_31.doStartTag();
    if (_jspx_th_sql_param_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_31);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_31);
    return false;
  }

  private boolean _jspx_meth_sql_param_32(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_32 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_32.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_14);
    _jspx_th_sql_param_32.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_32 = _jspx_th_sql_param_32.doStartTag();
    if (_jspx_th_sql_param_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_32);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_32);
    return false;
  }

  private boolean _jspx_meth_sql_param_33(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_33 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_33.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_14);
    _jspx_th_sql_param_33.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_33 = _jspx_th_sql_param_33.doStartTag();
    if (_jspx_th_sql_param_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_33);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_33);
    return false;
  }

  private boolean _jspx_meth_sql_param_34(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_34 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_34.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_34.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_14);
    _jspx_th_sql_param_34.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estimatedVal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_34 = _jspx_th_sql_param_34.doStartTag();
    if (_jspx_th_sql_param_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_34);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_34);
    return false;
  }

  private boolean _jspx_meth_c_if_15(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent(null);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty Category && not empty taskId && not empty fromDate && not empty toDate && not empty estimatedVal}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_sql_query_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_15, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_sql_query_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_15, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_15 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_15.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_15);
    _jspx_th_sql_query_15.setVar("listTasks");
    int[] _jspx_push_body_count_sql_query_15 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_15 = _jspx_th_sql_query_15.doStartTag();
      if (_jspx_eval_sql_query_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_15[0]++;
          _jspx_th_sql_query_15.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_15.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            SELECT * FROM projectdb2.addtask WHERE category = ? && taskid = ? && taskdate BETWEEN ? AND ? && estimatedvalue = ? ORDER BY taskdate DESC;\n");
          out.write("            ");
          if (_jspx_meth_sql_param_35((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_15, _jspx_page_context, _jspx_push_body_count_sql_query_15))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_36((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_15, _jspx_page_context, _jspx_push_body_count_sql_query_15))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_37((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_15, _jspx_page_context, _jspx_push_body_count_sql_query_15))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_38((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_15, _jspx_page_context, _jspx_push_body_count_sql_query_15))
            return true;
          out.write("\n");
          out.write("            ");
          if (_jspx_meth_sql_param_39((javax.servlet.jsp.tagext.JspTag) _jspx_th_sql_query_15, _jspx_page_context, _jspx_push_body_count_sql_query_15))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_sql_query_15.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_15 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_15[0]--;
      }
      if (_jspx_th_sql_query_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_15[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_15.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_15.doFinally();
      _jspx_tagPool_sql_query_var.reuse(_jspx_th_sql_query_15);
    }
    return false;
  }

  private boolean _jspx_meth_sql_param_35(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_35 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_35.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_35.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_15);
    _jspx_th_sql_param_35.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_35 = _jspx_th_sql_param_35.doStartTag();
    if (_jspx_th_sql_param_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_35);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_35);
    return false;
  }

  private boolean _jspx_meth_sql_param_36(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_36 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_36.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_36.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_15);
    _jspx_th_sql_param_36.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${taskId}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_36 = _jspx_th_sql_param_36.doStartTag();
    if (_jspx_th_sql_param_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_36);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_36);
    return false;
  }

  private boolean _jspx_meth_sql_param_37(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_37 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_37.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_37.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_15);
    _jspx_th_sql_param_37.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_37 = _jspx_th_sql_param_37.doStartTag();
    if (_jspx_th_sql_param_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_37);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_37);
    return false;
  }

  private boolean _jspx_meth_sql_param_38(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_38 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_38.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_38.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_15);
    _jspx_th_sql_param_38.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toDate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_38 = _jspx_th_sql_param_38.doStartTag();
    if (_jspx_th_sql_param_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_38);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_38);
    return false;
  }

  private boolean _jspx_meth_sql_param_39(javax.servlet.jsp.tagext.JspTag _jspx_th_sql_query_15, PageContext _jspx_page_context, int[] _jspx_push_body_count_sql_query_15)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:param
    org.apache.taglibs.standard.tag.rt.sql.ParamTag _jspx_th_sql_param_39 = (org.apache.taglibs.standard.tag.rt.sql.ParamTag) _jspx_tagPool_sql_param_value_nobody.get(org.apache.taglibs.standard.tag.rt.sql.ParamTag.class);
    _jspx_th_sql_param_39.setPageContext(_jspx_page_context);
    _jspx_th_sql_param_39.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sql_query_15);
    _jspx_th_sql_param_39.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estimatedVal}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sql_param_39 = _jspx_th_sql_param_39.doStartTag();
    if (_jspx_th_sql_param_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_39);
      return true;
    }
    _jspx_tagPool_sql_param_value_nobody.reuse(_jspx_th_sql_param_39);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("user");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTasks.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr onclick=\"getTaskListTbDetails(this)\">\n");
          out.write("                                    <td><button type=\"submit\" class=\"btn btn-primary\" name=\"button\" value=\"detailsBtn\">Details</button></td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td style=\"display: none;\">");
          if (_jspx_meth_c_out_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                    <td style=\"display: none;\">");
          if (_jspx_meth_c_out_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.taskid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.task}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.estimatedvalue}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.taskdate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }

  private boolean _jspx_meth_c_out_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_5.setPageContext(_jspx_page_context);
    _jspx_th_c_out_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_5 = _jspx_th_c_out_5.doStartTag();
    if (_jspx_th_c_out_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_5);
    return false;
  }

  private boolean _jspx_meth_c_out_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_6.setPageContext(_jspx_page_context);
    _jspx_th_c_out_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.uploadedfilename}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_6 = _jspx_th_c_out_6.doStartTag();
    if (_jspx_th_c_out_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_6);
    return false;
  }

  private boolean _jspx_meth_c_remove_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent(null);
    _jspx_th_c_remove_0.setVar("Category");
    _jspx_th_c_remove_0.setScope("session");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }

  private boolean _jspx_meth_c_remove_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_1 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_1.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_1.setParent(null);
    _jspx_th_c_remove_1.setVar("taskId");
    _jspx_th_c_remove_1.setScope("session");
    int _jspx_eval_c_remove_1 = _jspx_th_c_remove_1.doStartTag();
    if (_jspx_th_c_remove_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_1);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_1);
    return false;
  }

  private boolean _jspx_meth_c_remove_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_2 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_2.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_2.setParent(null);
    _jspx_th_c_remove_2.setVar("fromDate");
    _jspx_th_c_remove_2.setScope("session");
    int _jspx_eval_c_remove_2 = _jspx_th_c_remove_2.doStartTag();
    if (_jspx_th_c_remove_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_2);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_2);
    return false;
  }

  private boolean _jspx_meth_c_remove_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_3 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_3.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_3.setParent(null);
    _jspx_th_c_remove_3.setVar("toDate");
    _jspx_th_c_remove_3.setScope("session");
    int _jspx_eval_c_remove_3 = _jspx_th_c_remove_3.doStartTag();
    if (_jspx_th_c_remove_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_3);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_3);
    return false;
  }

  private boolean _jspx_meth_c_remove_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_4 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_4.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_4.setParent(null);
    _jspx_th_c_remove_4.setVar("estimatedVal");
    _jspx_th_c_remove_4.setScope("session");
    int _jspx_eval_c_remove_4 = _jspx_th_c_remove_4.doStartTag();
    if (_jspx_th_c_remove_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_4);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_4);
    return false;
  }
}
