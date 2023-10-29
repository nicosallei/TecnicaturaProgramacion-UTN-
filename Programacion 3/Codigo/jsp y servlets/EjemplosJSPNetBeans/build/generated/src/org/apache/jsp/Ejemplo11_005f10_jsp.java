package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ejemplo11_005f10_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int filas; 
 int columnas; 
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
      out.write('\n');
      out.write('\n');
      ejemplos.EjemploBean ejemploBean = null;
      synchronized (session) {
        ejemploBean = (ejemplos.EjemploBean) _jspx_page_context.getAttribute("ejemploBean", PageContext.SESSION_SCOPE);
        if (ejemploBean == null){
          ejemploBean = new ejemplos.EjemploBean();
          _jspx_page_context.setAttribute("ejemploBean", ejemploBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("ejemploBean"), "filas", "5", null, null, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("ejemploBean"), "columnas", "3", null, null, false);
      out.write("\n");
      out.write("\n");
      out.write("<P>Tabla de Salida (Filas: \n");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((ejemplos.EjemploBean)_jspx_page_context.findAttribute("ejemploBean")).getFilas())));
      out.write("\n");
      out.write(", Columnas: \n");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((ejemplos.EjemploBean)_jspx_page_context.findAttribute("ejemploBean")).getColumnas())));
      out.write("\n");
      out.write(")</P>\n");
      out.write("\n");
 filas = ejemploBean.getFilas(); 
      out.write('\n');
 columnas = ejemploBean.getColumnas(); 
      out.write("\n");
      out.write("\n");
      out.write("<TABLE BORDER=10>\n");
 for (int i=0; i<filas; i++) { 
      out.write("\n");
      out.write("\t<TR>\t\n");
      out.write("\t");
 for (int j=0; j<columnas; j++) { 
      out.write("\n");
      out.write("\t\t<TD>Reserva ");
      out.print(i+1);
      out.write('.');
      out.print(j+1);
      out.write("</TD>\n");
      out.write("\t");
 } 
      out.write("\n");
      out.write("\t</TR>\n");
 } 
      out.write("\n");
      out.write("</TABLE>\n");
      out.write("<FORM>\n");
      out.write("  <P><INPUT type=\"SUBMIT\" VALUE=\"OK\" NAME=\"boton2\">\n");
      out.write("  <INPUT TYPE=\"SUBMIT\" VALUE=\"Salir\" NAME=\"boton3\"></P>\n");
      out.write("</FORM>\n");
      out.write("\n");
      out.write("</BODY>\n");
      out.write("</HTML>\n");
      out.write("\n");
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
