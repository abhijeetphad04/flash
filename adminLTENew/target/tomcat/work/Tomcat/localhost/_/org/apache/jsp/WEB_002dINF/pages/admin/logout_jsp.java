/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-25 11:59:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>JavaByKiran | Log in</title>\n");
      out.write("    <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("    <!-- Bootstrap 3.3.5 -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\n");
      out.write("    <!-- Ionicons -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("    <!-- Theme style -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../dist/css/AdminLTE.min.css\">\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../plugins/iCheck/square/blue.css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body class=\"hold-transition login-page\">\n");
      out.write("    <div class=\"login-box\">\n");
      out.write("       <center>\n");
      out.write("        <img src=\"../images/jbk.png\" height=\"150px\">\n");
      out.write("    </center> \n");
      out.write("      <div class=\"login-logo\">\n");
      out.write("        <a href=\"#\"><b>Java By Kiran</b><h4>JAVA | SELENIUM | PYTHON</h4></a>\n");
      out.write("      </div><!-- /.login-logo -->\n");
      out.write("      <div class=\"login-box-body\">\n");
      out.write("        <p class=\"login-box-msg\">Sign in to start your session</p>\n");
      out.write("        <p style=\"color:red;text-align:center;\">Logout successfully</p>\n");
      out.write("        <form id=\"form\" action=\"login\" method=\"post\">\n");
      out.write("          <div class=\"form-group has-feedback\">\n");
      out.write("            <input type=\"text\" id=\"email\" class=\"form-control\" name=\"email\" placeholder=\"Email\">\n");
      out.write("            <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\n");
      out.write("            <div id=\"email_error\" style=\"color:red;\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group has-feedback\">\n");
      out.write("            <input type=\"password\" id=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\n");
      out.write("            <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\n");
      out.write("            <div id=\"password_error\" style=\"color:red;\"></div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <div class=\"col-xs-12\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">Sign In</button>\n");
      out.write("            </div><!-- /.col -->\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <a href=\"registerpage\" class=\"text-center\">Register a new membership</a>\n");
      out.write("\n");
      out.write("      </div><!-- /.login-box-body -->\n");
      out.write("    </div><!-- /.login-box -->\n");
      out.write("\n");
      out.write("    <!-- jQuery 2.1.4 -->\n");
      out.write("    <script src=\"../../plugins/jQuery/jQuery-2.1.4.min.js\"></script>\n");
      out.write("    <!-- Bootstrap 3.3.5 -->\n");
      out.write("    <script src=\"../../bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- iCheck -->\n");
      out.write("    <script src=\"../../plugins/iCheck/icheck.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      $(\"#form\").submit(function(){\n");
      out.write("        var email = $(\"#email\").val();\n");
      out.write("        var password = $(\"#password\").val();\n");
      out.write("\n");
      out.write("        //$(\"#email_error\").text(\"\");\n");
      out.write("        //$(\"#password_error\").text(\"\");\n");
      out.write("\n");
      out.write("        if(email=='' && password==''){\n");
      out.write("          $(\"#email_error\").text(\"Please enter email.\");\n");
      out.write("          $(\"#password_error\").text(\"Please enter password.\");\n");
      out.write("          return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("       /*  if(email!='' && password==''){\n");
      out.write("          if(!validateEmail(email)){\n");
      out.write("            $(\"#email_error\").text(\"Please enter valid email.\");\n");
      out.write("          }else{\n");
      out.write("            if(email!='kiran@gmail.com'){\n");
      out.write("              $(\"#email_error\").text(\"Please enter email as kiran@gmail.com\");\n");
      out.write("            }else{\n");
      out.write("              $(\"#email_error\").text(\"\");              \n");
      out.write("            }            \n");
      out.write("          }\n");
      out.write("          $(\"#password_error\").text(\"Please enter password.\");\n");
      out.write("\n");
      out.write("          return false;\n");
      out.write("        } */\n");
      out.write("\n");
      out.write("       /*  if(email=='' && password!=''){\n");
      out.write("          if(password!='123456'){      \n");
      out.write("            $(\"#password_error\").text(\"Please enter password 123456\");\n");
      out.write("          }else{\n");
      out.write("            $(\"#password_error\").text(\"\");\n");
      out.write("          } */\n");
      out.write("\n");
      out.write("          $(\"#email_error\").text(\"Please enter email\");\n");
      out.write("          return false;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var bol = true;\n");
      out.write("\n");
      out.write("        /* if(email!='' && password!=''){\n");
      out.write("          if(password!='123456'){      \n");
      out.write("            $(\"#password_error\").text(\"Please enter password 123456\");\n");
      out.write("            bol = false;\n");
      out.write("          }else{\n");
      out.write("            $(\"#password_error\").text(\"\");\n");
      out.write("          }\n");
      out.write("\n");
      out.write("          if(email!='kiran@gmail.com'){\n");
      out.write("            $(\"#email_error\").text(\"Please enter email as kiran@gmail.com\");\n");
      out.write("            bol = false;\n");
      out.write("          }else{\n");
      out.write("            $(\"#email_error\").text(\"\"); \n");
      out.write("          }\n");
      out.write("\n");
      out.write("          return bol;\n");
      out.write("        } */\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("      });\n");
      out.write("\n");
      out.write("      $(function () {\n");
      out.write("        $('input').iCheck({\n");
      out.write("          checkboxClass: 'icheckbox_square-blue',\n");
      out.write("          radioClass: 'iradio_square-blue',\n");
      out.write("          increaseArea: '20%' // optional\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("\n");
      out.write("      function validateEmail($email) {\n");
      out.write("        var emailReg = /^([\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4})?$/;\n");
      out.write("        return emailReg.test( $email );\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
