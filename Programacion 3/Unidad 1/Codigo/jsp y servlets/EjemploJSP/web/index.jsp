<%-- 
    Document   : index
    Created on : 20/04/2009, 13:27:37
    Author     : 0535
--%>
<html>
    <head>
        <title>JSP</title>
    </head>
    <body>
        <script type="text/javascript">
            function aceptar(){

                var usuario, clave, navegador;
                usuario = document.getElementById('idusuario').value;
                clave = document.getElementById('idclave').value;
                navegador = navigator.appName;

                if(usuario == ''){
                    alert("Ingrese su nombre de Usuario");
                    return false;
                }
                if(clave == ''){
                    alert("Ingrese su clave de Ingreso");
                    return false;
                }

                ajax = (window.ActiveXObject) ? new ActiveXObject('Microsoft.XMLHTTP') : new XMLHttpRequest();
                if (ajax) {

                    s = 'cu=login';
                    s += '&usuario=' + usuario;
                    s += '&clave=' + clave;
                    s += '&navegador=' + navegador;
                    alert(s);
                    ajax.onreadystatechange = enviar;
                    ajax.open('POST', '<%=response.encodeURL("servlet/ServletJSP?")%>'+s, true);
                    ajax.send(null);
                }
            }

            function enviar() {
                if (ajax.readyState == 4 ) {
                    if (ajax.status == 200) {
                        datos = ajax.responseText;

                        ok = datos.split('-');
                        //alert(ok);
                        if(ok[0] == 1) {
                            document.location.href = "vista/home.jsp";
                        }
                        else {
                            alert('Su usuario y/o contraseña es incorrecta o ha caducado. Por favor vuelva a intentarlo o comuniquese con el Administrador.');
                        }
                    }
                    else {
                        alert(ajax.status + ': No se pudo cargar la página. Por favor vuelva a intentarlo');
                    }
                }
            }
            // presiono enter
            var tecla;
            function capturaTecla(e)
            {
                if(document.all)
                    tecla=event.keyCode;
                else
                {
                    tecla=e.which;
                }
                if(tecla==13)
                {
                    aceptar();
                }
            }
            document.onkeydown = capturaTecla;
        </script>
        
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <table align="center" width="100%">
            <tr>
            <tr>
                <td>Usuario</td>
                <td><input value="" type="text" name="usuario" id="idusuario"></input></td>
            </tr>
            <tr>
                <td>Clave</td>
                <td><input value="" type="password" name="clave" id="idclave"></input></td>
            </tr>
        </table>
        <br>
        <table width="100%">
            <tr>
                <td align="center"><input type="button" onclick="aceptar();" value="Aceptar" style="font-family: verdana; font-size: 14px; color: #150567; border-color: #92c7c7; background-color: #92c7c7" border="0"></input></td>
            </tr>
        </table>
        <br>
    </body>
</html>