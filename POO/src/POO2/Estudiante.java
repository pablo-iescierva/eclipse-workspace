package POO2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Estudiante {
	//atributos
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String grado;
	private String curso;
	private String universidad;
	private String email;
	private int telefono;
	
	
	// atributo estático en la clase Estudiante, para almacenar el número de total de objetos creados de esa clase
	private static int numEstudiantes = 0;
	
	// metodo para obtener numero de estudiantes
	public static int obtenerNumEstudiantes() {
		return numEstudiantes;
	}
	
	//metodo para mostrar informacion completa sobre el estudiate (metodo detalle de automovil)
	public String infoEstudiante() {
		return "\nNombre: "+this.nombre+" "+this.apellido1+" "+this.apellido2+"\n Grado y curso: "+this.curso+" "+this.grado;
	}
	
	
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String Grado) {
		this.grado = Grado;
	}
	public String getUniversidad() {
		return universidad;
	}
	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	//constructores
	
	public Estudiante() {
		super();
		numEstudiantes++;
	}

	public Estudiante(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		numEstudiantes++;
	}
	
	public Estudiante(String nombre, String apellido1, String apellido2, String grado, String curso, String universidad,
			String email, int telefono) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.grado = grado;
		this.curso = curso;
		this.universidad = universidad;
		this.email = email;
		this.telefono = telefono;
		numEstudiantes++;
	}
		
}
