<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<HTML>
<HEAD>
<TITLE>
Sistema de Reservaciones de Vuelo
</TITLE>
</HEAD>
<BODY>
<H1>SISTEMA DE RESERVACIONES DE VUELO</H1>

<jsp:useBean id="usuarioBean" class="ejemplos.UsuarioBean" scope="session" />

<%! String login = ""; %>
<%! String password = ""; %>
<%! String showPage = ""; %>
<%! String action = ""; %>
<%! String mensaje = ""; %>

<%	action = request.getParameter("boton");
	
	if (action.equals("Salir") == true)
		mensaje="Salida del sistema";
	else if (action.equals("OK") == true) {
		if (usuarioBean != null){
			login = request.getParameter("login");
			password = request.getParameter("password");
			if (usuarioBean.validar(login,password) == true)
				mensaje="Bienvenido, " + login;
			else
				mensaje="Usuario desconocido";
		}
		else
			mensaje="Bean desconocido";
	}
	else
		mensaje=action;
	
	showPage = "/Mensaje.jsp?mensaje=" + mensaje;
%>

<jsp:forward page="<%= showPage %>" />

</BODY>
</HTML>
