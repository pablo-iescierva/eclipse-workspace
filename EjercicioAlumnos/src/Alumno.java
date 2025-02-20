public class Alumno {
	private int idAlumno;
	private String nombre;
	private String dni;
	private String email;
	private String direccion;
	private int telefono;
	
	//CONSTRUCTORES
	
	public Alumno() {
		super();
	}

	public Alumno(int idAlumno,String nombre, String dni, String email, String direccion, int telefono) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	//GETTERS AND SETTERS

	public int getIdAlumno() {
		return idAlumno;
	}
	
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	

}
