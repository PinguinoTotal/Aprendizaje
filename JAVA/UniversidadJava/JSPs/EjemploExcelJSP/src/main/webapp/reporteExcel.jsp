<%-- quitamos el meta y el page porque este archivo 
no va a regresar texto en html--%>

<%-- Indicamos el JSP que va a ser el encargado de manegar las excepciones o los errores --%>
<%--lo que queremos hacer es que JSP sea privado por ende lo guardaremos en WEB-INF
ya que estaa carpeta no es accesaible para el navegador--%>
<%@page errorPage="/WEB-INF/manejoErrores.jsp"%>


<%-- importando las clases que vamos a necesitar--%>
<%@page import="utilerias.Conversiones, java.util.Date" %>

<%-- diciendo en que formato vamos a contestar --%>
<%@page contentType="application/vnd.ms-excel" %>

<%
    String nombreArchivo = "reporte.xls";
    //con esto al header le decimos que tipo de dato va a ser
    //y le decimos que descrague el archivo con su respectivo nombre
    //cambiamso esta linea de tecto: response.setHeader("Content-Disposition", "attachment;filename=" + nombreArchivo);
    //que nos decia que se descargaria el archivo y la cambiamos por esta para que muestre la excepcion
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <%-- ahora llenamos el archivo xml --%>
        <h1>Reporte de Excel</h1>
        <br>
        <table>
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            
            <tr>
                <td>1.- Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis basica de Java</td>
                <%-- ahora le damos un valor erroneo para ver como los JSP pueden 
                hacerce cargo de los errores --%>
                <td><%= Conversiones.format("500") %></td>
            </tr>
            
            <tr>
                <td>2.- Programacion con Java</td>
                <td>Poedremos en practica conceptos de la programacion orientada a objetos</td>
                <td><%= Conversiones.format(new Date()) %></td>
            </tr>
        </table>
    </body>
</html>
