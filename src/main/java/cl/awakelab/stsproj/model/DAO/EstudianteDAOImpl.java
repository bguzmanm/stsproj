package cl.awakelab.stsproj.model.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cl.awakelab.stsproj.model.Estudiante;

public class EstudianteDAOImpl implements IEstudianteDAO {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
    public List<Estudiante> readAll() {
        // TODO Auto-generated method stub

        String sql = "select idestudiante, nombre, apellido, direccion, fechanacimiento, dni from estudiantes";

        return template.query(sql, new EstudianteRowMapper());

    }

    @Override
    public Estudiante readOne(String dni) {
        // TODO Auto-generated method stub

        String sql = "select idestudiante, nombre, apellido, direccion, fechanacimiento, dni from estudiantes " +
                " where dni = ? ";


        return template.queryForObject(sql, new Object[]{dni}, new EstudianteRowMapper());
    }
    
    

	@Override
	public void create(Estudiante e) {
		// 
		
		String sql = "insert into estudiantes (idestudiante, nombre, apellido, direccion, fechanacimiento, dni) values " +
				"(?, ?, ?, ?, ?, ?)";
		
		template.update(sql, new Object[] {e.getId(), e.getNombre(), e.getApellido(), e.getDireccion(), e.getFechaNacimiento(), e.getDni()});
		
		
	}

	@Override
	public void update(Estudiante e) {
		
		String sql = "update estudiantes set nombre = ?, apellido = ?, direccion = ?, dni = ? where " +
				"idestudiante = ?";
		
		template.update(sql, new Object[] {e.getNombre(), e.getApellido(), e.getDireccion(), e.getDni(), e.getId()});
		
		
	}

	@Override
	public void delete(int id) {
		String sql = "delete from estudiantes where idestudiante = ?";
		
		template.update(sql, new Object[] {id});
		
		
	}

	@Override
	public Estudiante readOne(int id) {

        String sql = "select idestudiante, nombre, apellido, direccion, fechanacimiento, dni from estudiantes " +
                " where idestudiante = ? ";


        return template.queryForObject(sql, new Object[]{id}, new EstudianteRowMapper());
	}
}

class EstudianteRowMapper implements RowMapper<Estudiante> {

    @Override
    public Estudiante mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Estudiante(rs.getInt("idestudiante"), rs.getString("dni"), rs.getString("nombre"),
                rs.getString("apellido"), rs.getString("direccion"), rs.getString("fechanacimiento"));
    }
}
