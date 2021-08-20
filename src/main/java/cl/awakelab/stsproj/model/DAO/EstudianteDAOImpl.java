package cl.awakelab.stsproj.model.DAO;

import java.util.ArrayList;
import java.util.List;

import cl.awakelab.stsproj.model.Estudiante;

public class EstudianteDAOImpl implements IEstudianteDAO {

	@Override
	public List<Estudiante> readAll() {
		// TODO Auto-generated method stub
		
		List<Estudiante> lista = new ArrayList<Estudiante>();
		
		lista.add(new Estudiante("1-1", "Eliseo", "Ávila"));
		lista.add(new Estudiante("2-2", "Gabriel", "Recabarren"));
		lista.add(new Estudiante("3-3", "Ronald", "Figueroa#"));
		lista.add(new Estudiante("4-4", "Alejandra", "Vejar"));
		lista.add(new Estudiante("5-5", "Natalia", "Aldana"));
		
		return lista;
	}

	@Override
	public Estudiante readOne(String rut) {
		// TODO Auto-generated method stub
		return new Estudiante("4-4", "Alejandra", "Vejar");
	}

}
