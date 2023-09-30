/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplos;

import java.io.*;
import java.net.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author WEITZENFELD
 */
public class EjemploServlet extends HttpServlet {
   
    /** 
    * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
    * @param request servlet request
    * @param response servlet response
    */
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
	String action = request.getParameter("boton");
	HttpSession session = request.getSession();
	        
        String mensaje = " ";
        
        if (action != null) {
 
            if (action.equals("Salir") == true)
		mensaje="Salida del sistema";
            else if (action.equals("OK") == true) {
		UsuarioBean usuarioBean = (UsuarioBean) session.getAttribute("usuarioBean");
		if (usuarioBean != null){
			String login = request.getParameter("login");
			String password = request.getParameter("password");
			if (usuarioBean.validar(login, password) == true)
				mensaje="Bienvenido, " + login;
			else
				mensaje="Usuario desconocido";
		}
		else
			mensaje="Bean desconocido";
            }
            else
		mensaje=action;

        }
        String showPage = "/Mensaje.jsp?mensaje=" + mensaje;
            
        gotoPage(showPage,request, response);
    }
 
    private void gotoPage(String address,HttpServletRequest request,HttpServletResponse response)
	  throws ServletException, IOException {
	  ServletContext sc = getServletContext();
	  RequestDispatcher dispatcher = sc.getRequestDispatcher(address);
	  dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
    * Handles the HTTP <code>GET</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
    * Handles the HTTP <code>POST</code> method.
    * @param request servlet request
    * @param response servlet response
    */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>
}
