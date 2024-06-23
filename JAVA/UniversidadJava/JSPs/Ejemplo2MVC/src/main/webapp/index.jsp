<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>EJEMPLO MVC</h1>
        <br>
        <div style="color: red;">${mensaje}</div>
        <br>
        
        <a href="${pageContext.request.contextPath}/ServletControlador">
        Link al servlet controlador SIN parametros
        </a>
        
        <br>
        <br>
        
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregaVariables">
        Link al servlet controlador para agregar las variables
        </a>
        
        <br>
        <br>
        
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">
        Link al servlet controlador para listar variables
        </a>
        
    </body>
</html>