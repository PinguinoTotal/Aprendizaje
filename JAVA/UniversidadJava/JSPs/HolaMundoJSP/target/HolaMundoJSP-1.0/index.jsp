<%-- 
Agregando comentarios en un JSP
    Document   : index
    Created on : 30 may. 2024, 15:26:51
    Author     : USER
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola mundo JSP</title>
    </head>
    <body>
        <h1>Hola mundo jsp</h1>
        <ul>
            <%--los <% %> son scriblets, aqui se le puede poner codigo java
            --%>
            <li> <% out.print("Hola mundo con Scriplets"); %> </li>
            <li> ${"Hola mudnoc on expression languahje (EL)"}</li>
            <li> <%= "Esto es igual a poner 'out.print()'" %> </li>
            <li> <c:out value="Hola mundo con JSTL" /></li>

        </ul>
    </body>
</html>
