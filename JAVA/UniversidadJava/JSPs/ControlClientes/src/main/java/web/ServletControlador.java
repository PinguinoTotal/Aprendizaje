package web;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import datos.ClienteDaoJDBC;
import dominio.Cliente;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
  // el servlet controlador lo que va a hacer es recuperar el listado de clientes
  // compartir esta informacion hacie clientes.jsp

  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null) {
          switch (accion) {
            case "editar":
              this.editarCliente(request, response);
              break;
            case "eliminar":
            this.eliminarCliente(request,response);
              break;
            default:
              this.accionDefault(request, response);
              break;
          }
        }else{
          this.accionDefault(request, response);
        }
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // agarramos la accion que quieren que hagamos
    String accion = request.getParameter("accion");
    if (accion != null) {
      switch (accion) {
        case "insertar":
          this.insertarCliente(request, response);
          break;
        case "modificar":
          this.modificarCliente(request, response);
          break;
        default:
          this.accionDefault(request, response);
          break;
      }
    }else{
      this.accionDefault(request, response);
    }
  }

  private void accionDefault(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // tomamos a traves de clientesDaoJDBC toda la lista de cliente que se
    // encuentra en la base de datos
    List<Cliente> clientes = new ClienteDaoJDBC().listar();
    System.out.println("clientes = " + clientes);

    HttpSession sesion = request.getSession();
    sesion.setAttribute("clientes", clientes);
    sesion.setAttribute("totalClientes", clientes.size());
    sesion.setAttribute("saldoTotal", this.calcularSaldoTotal(clientes));
    
    //vamos a quitar el dispacher porque el url sigue haciendo la accion de añadir
    //request.getRequestDispatcher("clientes.jsp").forward(request, response);


    //siempre se necesita un jsp publico para iniciar una pagina 
    response.sendRedirect("clientes.jsp");
  }

  private double calcularSaldoTotal(List<Cliente> clientes) {
    double saldoTotal = 0;
    for (Cliente cliente : clientes) {
      saldoTotal += cliente.getSaldo();
    }
    return saldoTotal;
  }

  private void insertarCliente(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    //recuperamos los valores del formulario proporcionado
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String email = request.getParameter("email");
    String telefono = request.getParameter("telefono");
    double saldo = 0;
    String saldoString = request.getParameter("saldo");
    if (saldoString!= null && !"".equals(saldoString)) {
      saldo = Double.parseDouble(saldoString);
    }

    //creamos el objeto cliente
    Cliente nuevoCliente = new Cliente(nombre, apellido, email, telefono, saldo);

    //insertamos el nuevo objeto en la base de datos
    int registrosModificados = new ClienteDaoJDBC().insertar(nuevoCliente);
    System.out.println("Registros modificados: " + registrosModificados);

    //Redirigiomos hacia la accion por defaul
    this.accionDefault(request, response);
  }

  private void editarCliente(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    //recuepamos el idCliente
    int idCliente = Integer.parseInt(request.getParameter("idCliente"));
    Cliente cliente = new ClienteDaoJDBC().encontrar(new Cliente(idCliente));
    request.setAttribute("cliente", cliente);
    //este es el jsp que se desplegara y se le pondran los datos recuperados
    String jspEditar = "/WEB-INF/paginas/cliente/editarCliente.jsp";
    request.getRequestDispatcher(jspEditar).forward(request, response);
  }

  private void modificarCliente(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    //recuperamos los valores del formulario editar Cliente
    int idCliente = Integer.parseInt(request.getParameter("idCliente"));
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String email = request.getParameter("email");
    String telefono = request.getParameter("telefono");
    double saldo = 0;
    String saldoString = request.getParameter("saldo");
    if (saldoString!= null && !"".equals(saldoString)) {
      saldo = Double.parseDouble(saldoString);
    }

    //creamos el objeto cliente
    Cliente cliente = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);

    //Modificar el objeto en la base de datos
    int registrosModificados = new ClienteDaoJDBC().actualizar(cliente);
    System.out.println("Registros modificados: " + registrosModificados);

    //Redirigiomos hacia la accion por defaul
    this.accionDefault(request, response);
  }

  private void eliminarCliente(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    //recuperamos los valores del formulario editar Cliente
    int idCliente = Integer.parseInt(request.getParameter("idCliente"));
    

    //creamos el objeto cliente
    Cliente cliente = new Cliente(idCliente);

    //Eliminamos el objeto en la base de datos
    int registrosModificados = new ClienteDaoJDBC().eliminar(cliente);
    System.out.println("Registros modificados: " + registrosModificados);

    //Redirigiomos hacia la accion por defaul
    this.accionDefault(request, response);
  }
}
