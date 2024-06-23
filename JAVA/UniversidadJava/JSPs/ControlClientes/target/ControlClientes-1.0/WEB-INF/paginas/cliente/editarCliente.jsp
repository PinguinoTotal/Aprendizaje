<!DOCTYPE html>
<html>
  <head>
    <!-- Agregando las librerias de boostrap -->
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <title>Editar cliente </title>
  </head>
  <body>
    <!-- cabecero-->
    <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"></jsp:include>
    

    <form
      action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idCliente=${cliente.idCliente}"
      method="post"
      class="was-validated"
    >
      <!-- Botones de Navegacion-->
      <jsp:include
        page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"
      ></jsp:include>

      <section id="details">
        <div class="container">
          <div class="row">
            <div class="col">
              <div class="card">
                <div class="card-header">Editar Cliente</div>
                <div class="card-body">
                  <div class="mb-3">
                    <label for="nombre" class="form-label">Nombre</label>
                    <input
                      type="text"
                      class="form-control"
                      name="nombre"
                      id="nombre"
                      required
                      value="${cliente.nombre}"
                    />
                  </div>

                  <div class="mb-3">
                    <label for="apellido" class="form-label">Apellido</label>
                    <input
                      type="text"
                      class="form-control"
                      name="apellido"
                      id="apellido"
                      required
                      value="${cliente.apellido}"
                    />
                  </div>

                  <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input
                      type="email"
                      class="form-control"
                      name="email"
                      id="email"
                      required
                      value="${cliente.email}"
                    />
                  </div>

                  <div class="mb-3">
                    <label for="telefono" class="form-label">Telefono</label>
                    <input
                      type="tel"
                      class="form-control"
                      name="telefono"
                      id="telefono"
                      required
                      value="${cliente.telefono}"
                    />
                  </div>

                  <!--con el step any podemos hacer que el typoe number acepte centavos-->
                  <div class="mb-3">
                    <label for="saldo" class="form-label">Saldo</label>
                    <input
                      type="number"
                      class="form-control"
                      name="saldo"
                      id="saldo"
                      required
                      value="${cliente.saldo}"
                      step="any"
                    />
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </form>

    <!-- Pie de pagina -->
    <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp"></jsp:include>

    <!-- Scripts que trae boostrap -->
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
      integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
      crossorigin="anonymous"
    ></script>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
      integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
      crossorigin="anonymous"
    ></script>

    <!--Scripts que trae awesome fonts-->
    <script
      src="https://kit.fontawesome.com/5220ced5cc.js"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
