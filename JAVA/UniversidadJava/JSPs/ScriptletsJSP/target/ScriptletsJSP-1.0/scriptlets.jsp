<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>Jsp con Scriptlets</h1>
        <br>
        <%-- Scriblet para enviar informacion al navegador --%>
        <%
            out.print("saludos desde un scriplet");
        %>
        
        <%-- Scriblet para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("nombre de la aplicacion: " + nombreAplicacion);
        %>
        
        <br>
        
        <%-- Esto no esta bien echo pero se muestra para que se sepas que es posible hacerlo
        pero no es una buena practica--%>
        
        <%-- Scriblet con codigo condicionado --%>
        <%
            if(session != null && session.isNew()){
        %>
        la sesion Si es nueva
        <%
            }else if(session != null){
        %>
        la sesion No es nueva
        <%
            }
        %>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
