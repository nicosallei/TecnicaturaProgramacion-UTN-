<HTML>
<HEAD>
<TITLE>
Sistema de Reservaciones de Vuelo
</TITLE>
</HEAD>
<BODY>
<H1>SISTEMA DE RESERVACIONES DE VUELO</H1>
<%! int filas = 5; %>
<%! int columnas = 3; %>
<P>Tabla de Salida (Filas: <%=filas%>, Columnas: <%=columnas%>)</P>
<TABLE BORDER=10>
<% for (int i=0; i<filas; i++) { %>
	<TR>	
	<% for (int j=0; j<columnas; j++) { %>
		<TD>Reserva <%=i+1%>.<%=j+1%></TD>
	<% } %>
	</TR>
<% } %>
</TABLE>
<FORM>
  <P><INPUT type="SUBMIT" VALUE="OK" NAME="boton2">
  <INPUT TYPE="SUBMIT" VALUE="Salir" NAME="boton3"></P>
</FORM>
</BODY>
</HTML>
