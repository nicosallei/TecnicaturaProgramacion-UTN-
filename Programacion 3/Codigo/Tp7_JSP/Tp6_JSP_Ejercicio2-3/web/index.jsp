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
        <%
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;
        %>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col" colspan="4" class="text-center"><h3>Personas</h3></th>
                    <th scope="col" >
                        <a href="crear.jsp"><i class="fa-solid fa-user-plus"></i></a>
                    </th>
                    
                </tr>
                <tr>
                    
                    <th scope="col">Nombre</th>
                    <th scope="col">Apellido</th>
                    <th scope="col">DNI</th>
                    <th scope="col">Acciones</th>
                </tr>
            </thead>
            <tbody>
                <%
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/jsp?user=root&password=123456");
                        st = con.createStatement();
                        rs = st.executeQuery("SELECT * FROM persona;");
                        while (rs.next()) {

                %>
                <tr>
                    
                    <td><%= rs.getString(2)%></td>
                    <td><%= rs.getString(3)%></td>
                    <td><%= rs.getString(4)%></td>
                    <td>
                        
                        <a href="editar.jsp?nombre=<%= rs.getString(2)%>&apellido=<%= rs.getString(3)%>&dni=<%= rs.getString(4)%>"><i class="fa fa-pencil" aria-hidden="true"></i></a>
                        <a href="borrar.jsp?dni=<%= rs.getString(4)%>" class="ml-1"><i class="fa fa-trash" aria-hidden="true"></i></a>
                    </td>

                </tr>
                <%
                        }
                    } catch (Exception e) {
                        out.print("Error mysql "+e); 
                    }
                %>


            </tbody>
        </table>



    </body>
</html>
