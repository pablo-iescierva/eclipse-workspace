package letras;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu palabra: ");
		String palabra = sc.nextLine();
		
		
		int[] indice = contadorLetras(palabra);
		
		public static int[] contadorLetras(String palabra) {
			
			String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
			
			
			for (int i = 0; i < palabra.length(); i++) {
	            for (int j = 0; j < letras.length; j++) {
	        }
			
			return indice;	
		}
	}

}
