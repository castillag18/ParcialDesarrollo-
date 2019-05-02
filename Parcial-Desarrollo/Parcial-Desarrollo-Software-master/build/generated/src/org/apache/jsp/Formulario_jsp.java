package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.awt.TrayIcon.MessageType;
import javax.swing.JOptionPane;
import java.sql.*;
import Connect.db.*;

public final class Formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>FORMULARIO JSP & MYSQL</title>\n");
      out.write("    </head>\n");
      out.write("    <body>  \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1>Agregar Registro</h1>\n");
      out.write("            <hr>\n");
      out.write("            <form action=\"\" method=\"post\" class=\"form-control\" style=\"width: 500px; height: 400px\">\n");
      out.write("                Name:\n");
      out.write("                <input style=\"width: 200px; height: 15px\"  type=\"text\" name=\"txtName\" class=\"form-control\"/><br>\n");
      out.write("                <p></p>\n");
      out.write("                Last Name:\n");
      out.write("                <input type=\"text\" name=\"txtLastName\" class=\"form-control\" style=\"width: 170px; height: 15px\"/><br>\n");
      out.write("                <p></p>\n");
      out.write("                Email:\n");
      out.write("                <input style=\"width: 210px; height: 15px\" type=\"text\" name=\"txtBirth\" class=\"form-control\"/>\n");
      out.write("                <p></p>\n");
      out.write("                Lenguaje de Preferencia:\n");
      out.write("                <select>\n");
      out.write("                 <option value=\"Python\">Python</option>\n");
      out.write("                 <option value=\"JS\">JS</option>\n");
      out.write("                 <option value=\"Java\">Java</option>\n");
      out.write("                 <option value=\"C++\">C++</option>   \n");
      out.write("                </select>\n");
      out.write("                <p></p>\n");
      out.write("                <form action=\"/action_page.php\">\n");
      out.write("                <input type=\"checkbox\" name=\"Leer\" value=\"Leer\">Leer<br>\n");
      out.write("                <input type=\"checkbox\" name=\"Ecribir\" value=\"Escribir\" checked>Escribir<br>\n");
      out.write("                <input type=\"checkbox\" name=\"Programar\" value=\"Programar\">Programar<br>\n");
      out.write("                <input type=\"checkbox\" name=\"Correr\" value=\"Correr\">Correr<br>\n");
      out.write("                </form>\n");
      out.write("                <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary btn-lg\"/>\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
