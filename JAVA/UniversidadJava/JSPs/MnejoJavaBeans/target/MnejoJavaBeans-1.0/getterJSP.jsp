<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que lee los valores del JavaBean</title>
    </head>
    <body>
        <h1>JSP que lee los valores del JavaBean</h1>
        <%-- aqui obtenemos el bean llamado rectangulo, si no lo encuentra lo crea por el 
        tambien dependeiendo de el alcance de este es importante, porque puede haber un bean 
        que se llame rectangulo pero con scope de sesion, y otro tambien llamado rectangulo pero con 
        otro alcance --%>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"></jsp:useBean>
        <br>
        Valor base : <jsp:getProperty name="rectangulo" property="base"></jsp:getProperty>
        <br>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura"></jsp:getProperty>
        <br>
        <%--Esta parte es importanyte porque dentro del bean realmnente no se tiene 
        una propiedad que se llame area, pero si tenemos un metodo que se llama getArea
        por ende el javaBean lo puede procesar de esta manera usando el metodo get,
        siendo asi que podemos usarlo--%>
        Valor area: <jsp:getProperty name="rectangulo" property="area"></jsp:getProperty>
        <br>
        <br>
        <a href="index.jsp">Regresar al Inicio</a>
    </body>
</html>
