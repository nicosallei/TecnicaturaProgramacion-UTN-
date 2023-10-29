/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletJSP extends HttpServlet {

    private static final long serialVersionUID = 7238250573777088586L;
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";
    private String usuario;
    private String clave;
    private ServletContext context;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        context = getServletContext();
        context.log("Hola!");

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        String cuActual = request.getParameter("cu");
        HttpSession session = request.getSession(true);
        
        System.out.println("CU ACTUAL " + cuActual);
        
        try {

            if (request.getParameter("cu").equals("login")) {

                usuario = request.getParameter("usuario");
                if (usuario != null) {
                    usuario = usuario.toLowerCase();
                    request.setAttribute("usuario", usuario);
                }

                clave = request.getParameter("clave");

                String navegador = request.getParameter("navegador");
                boolean soportaImg;
                if (navegador.compareTo("Netscape") == 0) {
                    soportaImg = true;
                } else if (navegador.compareTo("Opera") == 0) {
                    soportaImg = true;
                } else {
                    soportaImg = false;
                }
                session.setAttribute("soportaImg", soportaImg);
                session.setAttribute("usuario", usuario);

                if (usuario.equals("admin") && clave.equals("123456")) {
                    out.println("1");
                } else {
                    out.println("0");
                }
            } else if (request.getParameter("cu").equals("CAA")) {
                //CASO DE USO A
            } else if (request.getParameter("cu").equals("CAB")) {
                //CASO DE USO B
            } else if (request.getParameter("cu").equals("CAC")) {
                //CASO DE USO C
            }




        } catch (Exception ex) {
            ex.printStackTrace();
            out.println("0¬" + ex.getMessage());
        }

        out.close();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType(CONTENT_TYPE);

    }
}
