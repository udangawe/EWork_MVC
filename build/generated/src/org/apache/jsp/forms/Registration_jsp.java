package org.apache.jsp.forms;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <link href = \"https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css\"\n");
      out.write("              rel = \"stylesheet\">\n");
      out.write("        <script src = \"https://code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src = \"https://code.jquery.com/ui/1.10.4/jquery-ui.js\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function previewFile() {\n");
      out.write("                var preview = document.querySelector('img');\n");
      out.write("                var file = document.querySelector('input[type=file]').files[0];\n");
      out.write("                var reader = new FileReader();\n");
      out.write("\n");
      out.write("                reader.onloadend = function () {\n");
      out.write("                    preview.src = reader.result;\n");
      out.write("                };\n");
      out.write("\n");
      out.write("                if (file) {\n");
      out.write("                    reader.readAsDataURL(file);\n");
      out.write("                } else {\n");
      out.write("                    preview.src = \"\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#birthday\").datepicker({\n");
      out.write("                    changeYear: true,\n");
      out.write("                    dateFormat: \"yy-mm-dd\"\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .ui-datepicker select.ui-datepicker-year{\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function clearImage() {\n");
      out.write("                document.getElementById('myImage').removeAttribute('src');\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function validateForm() {\n");
      out.write("                var firstName = document.forms[\"regForm\"][\"firstName\"].value;\n");
      out.write("                var lastName = document.forms[\"regForm\"][\"lastName\"].value;\n");
      out.write("                var inputEmail = document.forms[\"regForm\"][\"inputEmail\"].value;\n");
      out.write("                var inputUsername = document.forms[\"regForm\"][\"inputUsername\"].value;\n");
      out.write("                var inputPassword = document.forms[\"regForm\"][\"inputPassword\"].value;\n");
      out.write("                var retypePassword = document.forms[\"regForm\"][\"retypePassword\"].value;\n");
      out.write("\n");
      out.write("                if (firstName == \"\") {\n");
      out.write("                    alert(\"First Name must be filled out\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (lastName == \"\") {\n");
      out.write("                    alert(\"Last Name must be filled out\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (inputEmail == \"\") {\n");
      out.write("                    alert(\"Email must be filled out\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var atpos = inputEmail.indexOf(\"@\");\n");
      out.write("                var dotpos = inputEmail.lastIndexOf(\".\");\n");
      out.write("                if (atpos < 1 || (dotpos - atpos < 2)) {\n");
      out.write("                    alert(\"Please enter correct email\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (inputUsername == \"\") {\n");
      out.write("                    alert(\"Please enter your username\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if ((inputUsername.length < 5) || (inputUsername.length > 15)) {\n");
      out.write("                    alert(\"Username must be more than 5 characters and less than 15 characters\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var illegalChars = /\\W/;\n");
      out.write("                if (illegalChars.test(inputUsername)) {\n");
      out.write("                    alert(\"The username contains illegal characters\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (inputPassword == \"\") {\n");
      out.write("                    alert(\"Please enter your password\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (inputPassword != retypePassword) {\n");
      out.write("                    alert(\"Please confirm your password is correct\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var radioEmployer = document.getElementById(\"radioEmployer\").checked;\n");
      out.write("                var radioEmployee = document.getElementById(\"radioEmployee\").checked;\n");
      out.write("                if ((radioEmployer == false) && (radioEmployee == false)) {\n");
      out.write("                    alert(\"Please fill your status\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function clearParagraph() {\n");
      out.write("                document.getElementById(\"regpid\").innerHTML = \"\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            h2 {\n");
      out.write("                color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    <h2><p id=\"regpid\"></p></h2>\n");
      out.write("    <h1><center>Registration Form</center></h1><br>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form method=\"POST\" action=\"../Registration\" name=\"regForm\" onsubmit=\"return validateForm()\">\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"firstName\">First Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"firstName\" name=\"firstName\" placeholder=\"First Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"lastName\">Last Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"lastName\" name=\"lastName\" placeholder=\"Last Name\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"inputEmail\">Email</label>\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"inputEmail\" name=\"inputEmail\" placeholder=\"Email\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"inputUsername\">Username</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputUsername\" name=\"inputUsername\" placeholder=\"Username\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"inputPassword\">Password</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"inputPassword\" name=\"inputPassword\" placeholder=\"Password\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"retypePassword\">Retype Password</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"retypePassword\" name=\"retypePassword\" placeholder=\"Retype Password\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"phoneNumber\">Phone Number</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"phoneNumber\" name=\"phoneNumber\" placeholder=\"Phone Number\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"birthday\">Your Birthday</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"birthday\" name=\"birthday\" placeholder=\"Your Birthday\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"gender\">Your Gender</label>\n");
      out.write("                <select class=\"form-control\" id=\"gender\" name=\"gender\">\n");
      out.write("                    <option>Male</option>\n");
      out.write("                    <option>Female</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"country\">Country</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"country\" name=\"country\" placeholder=\"Country\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"city\">City</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"city\" name=\"city\" placeholder=\"City\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-row\">\n");
      out.write("            <div class=\"form-group col-md-1\">\n");
      out.write("                <label for=\"radioStatus\">Status</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-3\">\n");
      out.write("                <div class=\"form-check form-check-inline\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"inlineRadioOptions\" id=\"radioEmployer\" value=\"Employer\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"radioEmployer\">Employer</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-check form-check-inline\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"inlineRadioOptions\" id=\"radioEmployee\" value=\"Employee\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"radioEmployee\">Employee</label>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-5\">\n");
      out.write("                <br><input type=\"file\" onchange=\"previewFile()\" class=\"form-control-file\" id=\"uploadImage\" name=\"uploadImage\">\n");
      out.write("                <img src=\"\" class=\"img-thumbnail\" height=\"200\" alt=\"Upload Image\" id=\"myImage\"><br><br>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Create Account</button>\n");
      out.write("                <button type=\"reset\" class=\"btn btn-primary\" onclick=\"clearImage(); clearParagraph();\">Reset</button>\n");
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
