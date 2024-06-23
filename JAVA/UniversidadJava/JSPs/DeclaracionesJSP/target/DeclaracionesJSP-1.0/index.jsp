<%--Agregamos una declaracion de JSP --%>

<%!
//declaramos una variable con su metodo get
private String usuario = "Alberto";

public String getUsuario(){
return this.usuario;
}

//declaramos un contador de visitas
private int contadorVisitas = 1;
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones con JSPs</title>
    </head>
    <body>
        <h1>Uso de declaraciones con JSPs</h1>
        Valor de usuario por medio del atributo: <%= this.usuario%>
        <br>
        Valor usuario por medio del metodo: <%=this.getUsuario()%>
        <br>
        <%--y se le puede sumar  --%>
        Contador de visitas: <%= this.contadorVisitas++%>
    </body>
</html>
