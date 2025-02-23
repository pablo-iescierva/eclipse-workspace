import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1- DNI | 2- NIE ");
		int pregunta = sc.nextInt();
		
		
		if (pregunta == 1) {
			sc.nextLine(); 
			String regexDNI = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
			
			System.out.println("Introduce un DNI: ");
			String dni = sc.nextLine();
			
			Pattern patron = Pattern.compile(regexDNI);
			Matcher concordancia = patron.matcher(dni);
			
			if (concordancia.find()) {
				System.out.println("DNI VALIDO");
			}else {
				System.out.println("DNI NO VALIDO");
			}
			
			
		} else if (pregunta == 2) {
			System.out.println("Introduce un NIE: ");
			String nie = sc.nextLine();
			
			sc.nextLine(); 
			String regexNIE = "^[XYZxyz][0-9]{7}[TRWAGMYFPDXBNJZSQVHLCKE]$";
			
			
			Pattern patron = Pattern.compile(regexNIE);
			Matcher concordancia = patron.matcher(nie);
			
			if (concordancia.find()) {
				System.out.println("NIE VALIDO");
			}else {
				System.out.println("NIE NO VALIDO");
			}
		} else {
			System.out.println("opcion no encontrada");
		}
		
		sc.close();
		
	}

}
