<%-- Indicamos que esta pagina va aser la encargada de procesar los errores
si no ponemos esta linea no tendremos acceso al objeto exeption --%>
<%@page isErrorPage="true"%>

<%@page import="java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de Errores</title>
    </head>
    <body>
        <h1>Manejo de Errores </h1>
        <br/>
        <%-- Con esto solo podemos ver el mensaje general--%>
        Ocurrio una excepcion: <%=exception.getMessage()%>
        <br/>
        <textarea cols="30" rows="5">
                <%-- Con esto imprimimos toda la pila de excepciones--%>
                <% exception.printStackTrace(new PrintWriter(out));%>
        </textarea>
    </body>
</html>
