 <%
            if(request.getParameter("fila")!=null && request.getParameter("columna")!=null ){
            
            int fila = Integer.parseInt(request.getParameter("fila"));
            int columna = Integer.parseInt(request.getParameter("columna"));
            out.println("<table border='2'>");
            for(int fil=0; fil < fila; fil++){
            
            out.print("<tr>");
            
            for(int colum=0; colum < columna; colum++){
                
                 out.print("<td width='100px'>"+(fil+1)+ "."+(colum+1)+" </td>");
                }
                out.print("</tr>");
                }
                out.println("</table>");
     }
            %>