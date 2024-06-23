<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Con expresiones</title>
    </head>
    <body>
        <h1>JSP Con expresiones</h1>
        Concatenacion:  <%="saludos" + " " + "JSP" %>
        <br>
        <%--Tambien es posible hacer operaciones dentro de las esxpresiones --%>
        Operacion Matematico <%= 2 * 3 / 2 %>
        <br>
        <%--Tambien es posible hacer uso de el id de las sesiones --%>
        Session id: <%= session.getId() %>
        <br>
        <br>
        <a><a href="index.html">Regresar al inicio</a>
    </body>
</html>
