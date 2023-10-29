<HTML>
<HEAD>
<TITLE>
Sistema de Reservaciones de Vuelo
</TITLE>
</HEAD>
<BODY>
<H1>SISTEMA DE RESERVACIONES DE VUELO</H1>

<jsp:useBean id="usuarioBean" class="ejemplos.UsuarioBean" scope="session" />

<FORM ACTION="EjemploServlet" METHOD="POST">
  <P><INPUT TYPE="SUBMIT" VALUE="Registrarse por Primera Vez" NAME="boton"></P>
  <P>Login: <INPUT TYPE="TEXT" NAME="login" SIZE="20"></P>
  <P>Password: <INPUT TYPE="PASSWORD" NAME="password" SIZE="20"></P>
  <P>	<INPUT type="SUBMIT" VALUE="OK" NAME="boton">
  	<INPUT TYPE="SUBMIT" VALUE="Salir" NAME="boton"></P>
</FORM>

</BODY>
</HTML>