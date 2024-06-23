<!-- ahora vamos a iterar la lista de clientes
que ha obtenido y nos ha pasado el servletControlador
por ende metemos la libreria de jstl-->

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"></fmt:setLocale>

<section id="clientes">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Clientes</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="table-dark">
                            <tr>
                                <th>#</th>
                                <th>Nombre</th>
                                <th>Saldo</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--Iteramos cada elemento de la lista de cliemte-->
                            <c:forEach var="cliente" items="${clientes}" varStatus="status">
                                <tr>
                                    <!--con el status hacemos que si muestre 1 2 3 y no el id
                                    de la base de datos-->
                                    <td>${status.count}</td>
                                    <td>${cliente.nombre} ${cliente.apellido}</td>
                                    <td><fmt:formatNumber value="${cliente.saldo}" type="currency"></fmt:formatNumber>  </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idCliente=${cliente.idCliente}" 
                                            class="btn btn-warning"><i class="fa fa-angle-double-right" aria-hidden="true"></i> Editar</a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

            <!--Trajetas para los toltales-->
            <div class="col-md-3">
                <div class="card text-center bg-danger text-white mb-3">
                    <div class="card-body">
                        <h3>Saldo Total</h3>
                        <h4 class="display-4">
                            <fmt:formatNumber value="${saldoTotal}" type="currency"></fmt:formatNumber>
                        </h4>
                    </div>
                </div>

                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-body">
                        <h3>Total Clientes</h3>
                        <h4 class="display-4">
                            <i class="fa-solid fa-users"></i>
                            ${totalClientes}
                        </h4>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!--Agregar cliente MODAL-->
<jsp:include page="/WEB-INF/paginas/cliente/agregarCliente.jsp"></jsp:include>
