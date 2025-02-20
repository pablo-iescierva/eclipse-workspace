import java.util.Scanner;

public class Main {
	static int numAlumnos;
	static Alumno[] alumnos;
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		boolean salir = false;
		
		
		System.out.println("Numero de alumnos a introducir: ");
		numAlumnos = sc.nextInt();	
		sc.nextLine();
		
		alumnos = new Alumno[numAlumnos];
		
		solicitarAlumnos();
		mostrarAlumnos();
		crearMenu();
		
		while (!salir) {
			int alumnoSel = sc.nextInt();
			sc.nextLine();
			
			if (alumnoSel==0){
				System.out.println("Programa Finalizado");
				salir=true;
			}else if (alumnoSel > 0 && alumnoSel <= numAlumnos){
				Alumno alumno=alumnos[alumnoSel-1];
				System.out.printf("\nInformacion del alumno %d: ",alumnoSel);
				System.out.println(alumno.infoAlumno());
			}
		}
			
	}
	
	//crear menu
	
	public static void crearMenu() {
		System.out.println();
		System.out.println("Selecciona un ALUMNO: ");
		System.out.println("0 - Salir");
		for (int i = 0; i<numAlumnos;i++) {
			System.out.println((i+1) + ". " + alumnos[i].getNombre());
		}
		
		
	}
	
	//mostrarAlumnos - metodo
	
	public static void mostrarAlumnos() {
		for (int i=0; i<numAlumnos; i++) {
			System.out.printf("\nInformación del alumno %d: ",i+1);
			System.out.println(alumnos[i].infoAlumno());
		}
	}
	
	//SOLICITAR ALUMNOS METODO
	
	public static void solicitarAlumnos() {
		
		String nombre;
		String apellidos;
		String nre;
		String email;
		String direccion;
		
		for (int i = 0; i< numAlumnos; i++) {
			
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Apellidos: ");
			apellidos = sc.nextLine();
			System.out.println("NRE: ");
			nre = sc.nextLine();
			System.out.println("Email: ");
			email = sc.nextLine();
			System.out.println("Dirección: ");
			direccion = sc.nextLine();
			
			alumnos[i] = new Alumno(nombre, apellidos, nre, email, direccion);
			
		}
		
	}
	
}
