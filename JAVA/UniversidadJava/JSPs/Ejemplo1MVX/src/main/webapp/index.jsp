<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>EJEMPLO MVC</h1>
        <br>
        <!-- usamos el pageContext, para no necesariamente poner el nombre
        de la aplicacion -->
        <a href="${pageContext.request.contextPath}/ServletControlador">
            Link al servlet controlador que despliega las variables
        </a>
    </body>
</html>