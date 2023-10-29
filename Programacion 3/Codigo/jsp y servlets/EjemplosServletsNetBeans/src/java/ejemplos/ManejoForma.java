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
public class ManejoForma extends HttpServlet {
    
    /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String login = request.getParameter("login");
	String password = request.getParameter("password");
	String boton1 = request.getParameter("boton1");
	String boton2 = request.getParameter("boton2");
	String boton3 = request.getParameter("boton3");
   
        out.println("<HTML>\n" +
                "<HEAD><TITLE>Sistema de Reservaciones de Vuelo</TITLE></HEAD>\n" +
                "<BODY>\n" +
                "<H1>SISTEMA DE RESERVACIONES DE VUELO</H1>\n" +
		"<P><H2>Se obtuvieron los siguientes datos</H2></P>\n" +
		"<P>Login:  " + login + "</P>\n" +
		"<P>Password:  " + password + "</P>\n" +
		"<P>Boton1: " + boton1 + "</P>\n" +
		"<P>Boton2: " + boton2 + "</P>\n" +
		"<P>Boton3: " + boton3 + "</P>\n" +
                "</BODY></HTML>");

        out.close();
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
