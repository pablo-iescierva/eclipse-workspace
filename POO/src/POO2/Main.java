package POO2;

public class Main {
	public static void main(String[] args) {
		
		Estudiante alumno = new Estudiante();
		
		alumno.setNombre("Pablo");
		alumno.setApellido1("Arques");
		alumno.setApellido2("López");
		alumno.setCurso("1");
		alumno.setGrado("DAM");
		alumno.setUniversidad("ies ingeniero de la cierva");
		alumno.setTelefono(606271562);
		alumno.setEmail("pablo@gucci.es");

		System.out.println(alumno.infoEstudiante());
		
	}
}
