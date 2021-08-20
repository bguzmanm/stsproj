package cl.awakelab.stsproj.model;

public class Facilitador {
	
	private String rut;
	private String nombre;
	private String apellido;
	
	public Facilitador() {
		
	}
	public Facilitador(String rut, String nombre, String apellido) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	

}
