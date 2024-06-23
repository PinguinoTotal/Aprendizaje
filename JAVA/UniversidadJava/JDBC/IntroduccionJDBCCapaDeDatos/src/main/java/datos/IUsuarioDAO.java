package datos;

import java.sql.SQLException;
import java.util.List;

import domain.UsuarioDTO;

public interface IUsuarioDAO {
  public List<UsuarioDTO> seleccionar() throws SQLException;

  public int insertar(UsuarioDTO UsuarioDTO) throws SQLException;

  public int actualizar(UsuarioDTO UsuarioDTO) throws SQLException;

  public int eliminar(UsuarioDTO UsuarioDTO) throws SQLException;
}
