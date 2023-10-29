<HTML>
<HEAD>
<TITLE>
Sistema de Reservaciones de Vuelo
</TITLE>
</HEAD>
<BODY>
<H1>SISTEMA DE RESERVACIONES DE VUELO</H1>
<%! String login = "alfredo"; %>
<%! String password = "weitzenfeld"; %>
Forma de Entrada
<FORM>
  <P><INPUT TYPE="SUBMIT" VALUE="Registrarse por Primera Vez" NAME="boton1"></P>
  <P>Login: <INPUT TYPE="TEXT" NAME="login" SIZE="20" 
VALUE="<%=login%>"></P>
  <P>Password: <INPUT TYPE="PASSWORD" NAME="password" SIZE="20" 
VALUE="<%=password%>"></P>
  <P><INPUT type="SUBMIT" VALUE="OK" NAME="boton2">
  <INPUT TYPE="SUBMIT" VALUE="Salir" NAME="boton3"></P>
</FORM>
</BODY>
</HTML>