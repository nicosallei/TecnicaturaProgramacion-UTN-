package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ejemplo11_005f7_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String login = "alfredo"; 
 String password = "weitzenfeld"; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<HTML>\n");
      out.write("<HEAD>\n");
      out.write("<TITLE>\n");
      out.write("Sistema de Reservaciones de Vuelo\n");
      out.write("</TITLE>\n");
      out.write("</HEAD>\n");
      out.write("<BODY>\n");
      out.write("<H1>SISTEMA DE RESERVACIONES DE VUELO</H1>\n");
      out.write('\n');
      out.write("\n");
      out.write("Forma de Entrada\n");
      out.write("<FORM>\n");
      out.write("  <P><INPUT TYPE=\"SUBMIT\" VALUE=\"Registrarse por Primera Vez\" NAME=\"boton1\"></P>\n");
      out.write("  <P>Login: <INPUT TYPE=\"TEXT\" NAME=\"login\" SIZE=\"20\" \n");
      out.write("VALUE=\"");
      out.print(login);
      out.write("\"></P>\n");
      out.write("  <P>Password: <INPUT TYPE=\"PASSWORD\" NAME=\"password\" SIZE=\"20\" \n");
      out.write("VALUE=\"");
      out.print(password);
      out.write("\"></P>\n");
      out.write("  <P><INPUT type=\"SUBMIT\" VALUE=\"OK\" NAME=\"boton2\">\n");
      out.write("  <INPUT TYPE=\"SUBMIT\" VALUE=\"Salir\" NAME=\"boton3\"></P>\n");
      out.write("</FORM>\n");
      out.write("</BODY>\n");
      out.write("</HTML>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
