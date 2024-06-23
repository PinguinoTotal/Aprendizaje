<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica a un JavaBean</title>
    </head>
    <body>
        <h1>JSP que modifica a un JavaBean</h1>
        <%-- creamos un objeto con nombre rectangulo de tipo Rectangulo con alcance de sesion 
        si el alcance fuera de request, el javaBean solo existe mientras se haga la peticion--%>
        
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"></jsp:useBean>
        Modificamos los atributos:
        <br>
        <br>
        <%
            int baseValor = 5;
            int alturaValor = 10;
        %>
        <%-- y cambiamos los valores de ese objeto con el setProperty apuntando al objeto --%>
        <jsp:setProperty name="rectangulo" property="base" value="<%=baseValor%>"></jsp:setProperty>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=alturaValor%>"></jsp:setProperty>
        
        <br>
        Nuevo valor base (fijo): <%=baseValor%>
        <br>
        Nuevo valor altura (fijo): <%=alturaValor%>
        
        <br>
        <br>
        
        Nuevo valor base (javaBean): <jsp:getProperty name="rectangulo" property="base"></jsp:getProperty>
        <br>
        Nuevo valor altura (javaBean): <jsp:getProperty name="rectangulo" property="altura"></jsp:getProperty>
        
        <br>
        <br>
        <a href="index.jsp">Regresar al Inicio</a>
        
    </body>
</html>
