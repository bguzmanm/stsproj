package cl.awakelab.stsproj.model.DAO;

import java.util.List;

import cl.awakelab.stsproj.model.Estudiante;

public interface IEstudianteDAO {
	
	public List<Estudiante> readAll();
	public Estudiante readOne(String dni);
	public Estudiante readOne(int id);
	public void create(Estudiante e);
	public void update(Estudiante e);
	public void delete(int id);
	

}
