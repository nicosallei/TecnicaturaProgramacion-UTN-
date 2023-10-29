<%-- 
    Document   : index
    Created on : 30 sept 2023, 13:50:22
    Author     : Nicolas Sallei Correa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="destino.jsp">
                <br>
                Ingrese la Fila: 
                <br>
                <input type="number" name="fila" id="fila" /> 
                <br>
                Ingrese la Columna: 
                <br>
                <input type="number" name="columna" id="columna" />
                <br>
                <br>
                <button type="submit">Enviar</button> 
        </form>
        
        
        
    </body>
</html>
