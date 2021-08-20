package cl.awakelab.stsproj.model.DAO;

import java.util.List;

import cl.awakelab.stsproj.model.Estudiante;

public interface IEstudianteDAO {
	
	public List<Estudiante> readAll();
	public Estudiante readOne(String rut);
	

}
