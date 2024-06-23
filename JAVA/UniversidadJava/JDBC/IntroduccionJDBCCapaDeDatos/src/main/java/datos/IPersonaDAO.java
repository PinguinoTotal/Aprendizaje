package datos;

import java.sql.SQLException;
import java.util.List;

import domain.PersonaDTO;

public interface IPersonaDAO {
  public List<PersonaDTO> seleccionar() throws SQLException;

  public int insertar(PersonaDTO personaDTO) throws SQLException;

  public int actualizar(PersonaDTO personaDTO) throws SQLException;

  public int eliminar(PersonaDTO personaDTO) throws SQLException;

}
