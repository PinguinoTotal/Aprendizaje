<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa Formulario</title>
    </head>
    <body>
        <h1>Resultado de Procesar el Formulario</h1>
        <br>
        <!-- tenemos acceso libre a el request ya que al ser un jsp tiene 
        acceso a los "parametros" como un servlet -->
        Usuario: <%= request.getParameter("usuario")%>
        <br>
        Password: <%= request.getParameter("password")%>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
