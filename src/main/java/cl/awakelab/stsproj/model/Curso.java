package cl.awakelab.stsproj.model;

import java.util.List;

public class Curso {

	private int idCurso;
	private List<Estudiante> estudiantes;
	private List<Facilitador> facilitadores;
	public Curso() {
		super();
	}
	public Curso(int idCurso, List<Estudiante> estudiantes, List<Facilitador> facilitadores) {
		super();
		this.idCurso = idCurso;
		this.estudiantes = estudiantes;
		this.facilitadores = facilitadores;
	}
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	public List<Facilitador> getFacilitadores() {
		return facilitadores;
	}
	public void setFacilitadores(List<Facilitador> facilitadores) {
		this.facilitadores = facilitadores;
	}
	
	
}
