<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclision Estatica</title>
    </head>
    <body>
        <h1>Ejemplo Inclision Estatica</h1>
        <br>
        <ul>
            <%-- con esto ya le ponemos que va a ser estatica incluyendolo de 
            esta manera --%>
            <li><%@include file="paginas/noticias1.html"%></li>
            <li><%@include file="paginas/noticias2.jsp"%> </li>
        </ul>
    </body>
</html>
