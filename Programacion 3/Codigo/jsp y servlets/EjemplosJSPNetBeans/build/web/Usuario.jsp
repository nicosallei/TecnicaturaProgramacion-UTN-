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

<%! String loginBD = "alfredo"; %>
<%! String passwordBD = "weitzenfeld"; %>
<%! String login = ""; %>
<%! String password = ""; %>
<%! String showPage = ""; %>
<%! String action = ""; %>
<%! String mensaje = ""; %>

<%	action = request.getParameter("boton");
	
	if (action.equals("Salir") == true)
		mensaje="Salida del sistema";
	else if (action.equals("OK") == true) {
		login = request.getParameter("login");
		password = request.getParameter("password");
		if (login.equals(loginBD) == true && password.equals(passwordBD) == true)
			mensaje="Bienvenido, " + login;
		else
			mensaje="Usuario desconocido";
	}
	else
		mensaje=action;
	
	showPage = "Mensaje.jsp?mensaje=" + mensaje;
%>

<jsp:forward page="<%= showPage %>" />

</BODY>
</HTML>
