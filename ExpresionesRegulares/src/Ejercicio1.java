import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String regex = "^[a-zA-Z][a-zA-Z0-9-_#$%?=+-]{2,19}$";
		
		System.out.println("Introduzca un nombre de usuario: ");
		String nombre = sc.nextLine();
		
		
		Pattern patron = Pattern.compile(regex);
		Matcher concordancia = patron.matcher(nombre);
		
		
		System.out.println("\nConcordancias: ");
		while(concordancia.find()) {
			System.out.println("indice: " + concordancia.start());
		}
		
		sc.close();
		

	}

}
