<!--El id debe sar igual al data-bs-target que le pusimosen el botones Navegacion -->
<div class="modal fade" id="agregarClienteModal">
  <div class="modal-dialog modal-lg">
    <div class="modal-content">
      <div class="modal-header bg-info text-white">
        <h5 class="modal-title fs-5">Agregar Cliente</h5>
        <button
          type="button"
          class="btn-close"
          data-bs-dismiss="modal"
          aria-label="Close"
        ></button>
      </div>
      <form
        action="${pageContext.request.contextPath}/ServletControlador?accion=insertar"
        method="post"
        class="was-validated"
      >
        <div class="modal-body">
          <div class="mb-3">
            <label for="nombre" class="form-label">Nombre</label>
            <input
              type="text"
              class="form-control"
              name="nombre"
              id="nombre"
              placeholder="Escribe tu nombre"
              required
            />
          </div>

          <div class="mb-3">
            <label for="apellido" class="form-label">Apellido</label>
            <input
              type="text"
              class="form-control"
              name="apellido"
              id="apellido"
              placeholder="Escribe tu apellido"
              required
            />
          </div>

          <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <input
              type="email"
              class="form-control"
              name="email"
              id="email"
              placeholder="Escribe tu email"
              required
            />
          </div>

          <div class="mb-3">
            <label for="telefono" class="form-label">Telefono</label>
            <input
              type="tel"
              class="form-control"
              name="telefono"
              id="telefono"
              placeholder="Escribe tu telefono"
              required
            />
          </div>

          <div class="mb-3">
            <label for="saldo" class="form-label">Saldo</label>
            <input
              type="number"
              class="form-control"
              name="saldo"
              id="saldo"
              placeholder="Escribe tu saldo"
              required
              step="any"
            />
          </div>
        </div>

        <div class="modal-footer">
          <button
            type="button"
            class="btn btn-secondary"
            data-bs-dismiss="modal"
          >
            Close
          </button>
          <input type="submit" class="btn btn-primary" value="Guardar" />
        </div>
      </form>
    </div>
  </div>
</div>
