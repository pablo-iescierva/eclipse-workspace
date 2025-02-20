import java.util.ArrayList;

public class Modulo {
	private int idModulo;
	private String nombreModulo;
	private int numeroModulo;
	private int horasModulo;
	private String profesorModulo;
	//array para almacenar alumnos
    ArrayList<Alumno> alumnos = new ArrayList<>();
	
	//constructores
	
	public Modulo() {
		super();
	}

	public Modulo(int idModulo, String nombreModulo, int numeroModulo, int horasModulo, String profesorModulo) {
		super();
		this.idModulo = idModulo;
		this.nombreModulo = nombreModulo;
		this.numeroModulo = numeroModulo;
		this.horasModulo = horasModulo;
		this.profesorModulo = profesorModulo;
	}
	
	//getters and setters


	public int getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}

	public String getNombreModulo() {
		return nombreModulo;
	}

	public void setNombreModulo(String nombreModulo) {
		this.nombreModulo = nombreModulo;
	}

	public int getNumeroModulo() {
		return numeroModulo;
	}

	public void setNumeroModulo(int numeroModulo) {
		this.numeroModulo = numeroModulo;
	}

	public int getHorasModulo() {
		return horasModulo;
	}

	public void setHorasModulo(int horasModulo) {
		this.horasModulo = horasModulo;
	}

	public String getProfesorModulo() {
		return profesorModulo;
	}

	public void setProfesorModulo(String profesorModulo) {
		this.profesorModulo = profesorModulo;
	}
		
}
