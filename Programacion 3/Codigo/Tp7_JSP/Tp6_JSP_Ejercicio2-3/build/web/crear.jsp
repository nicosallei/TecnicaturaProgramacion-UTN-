<%-- 
    Document   : index
    Created on : 30 sept 2023, 15:59:40
    Author     : Nicolas Sallei Correa
--%>

<%@page import="java.sql.*"%>
<%@page import="com.mysql.jdbc.Driver"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/d0e635954b.js" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body>

        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <form action="crear.jsp" method="post">
                        <div class="form-group">
                            <label>Nombre</label>
                            <input type="text" class="form-control" name="nombre" placeholder="Nombre" required="required"> 
                        </div>
                        <div class="form-group">
                            <label>Apellido</label>
                            <input type="text" class="form-control" name="apellido" placeholder="Apellido" required="required"> 
                        </div>
                        <div class="form-group">
                            <label>DNI</label>
                            <input type="text" class="form-control" name="dni" placeholder="Dni" required="required"> 
                        </div>
                        <br>
                        <button type="submit" name="enviar" class="btn btn-primary">Guardar</button>
                    </form>
                </div>
            </div>
        </div>

        <%
            if (request.getParameter("enviar") != null) {
                out.print("probando");
                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String dni = request.getParameter("dni");

                try {
                    Connection con = null;
                    Statement st = null;

                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/jsp?user=root&password=123456");
                    st = con.createStatement();
                    st.executeUpdate("insert into persona (nombre,apellido,dni) values('" + nombre + "','" + apellido + "','" + dni + "')");
                    request.getRequestDispatcher("index.jsp").forward(request, response);

                } catch (Exception e) {

                    out.print(e);
                }
            }

        %>


    </body>
</html>

