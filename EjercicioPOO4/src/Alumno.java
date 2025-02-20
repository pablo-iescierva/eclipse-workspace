public class Alumno {
	private String nombre;
	private String apellidos;
	private String NRE;
	private String email;
	private String direccion;
	
	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNRE() {
		return NRE;
	}
	public void setNRE(String nRE) {
		NRE = nRE;
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
	
	//constructores
	public Alumno() {
		super();
	}
		
	public Alumno(String nombre, String apellidos, String nRE, String email, String direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		NRE = nRE;
		this.email = email;
		this.direccion = direccion;
	}
	
	//metodo INFO
	public String infoAlumno() {
		String texto = "";
		
		texto = "\n========================\n"+"- Nombre: "+this.nombre+"\n- Apellidos: "+this.apellidos+"\n- NRE: "
				+this.NRE+"\n- Email: "+this.email+"\n Dirección: "+this.direccion+"\n========================";
		
		return texto;
		
	}

}
