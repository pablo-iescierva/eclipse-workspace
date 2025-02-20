package simulacrodos;
import java.util.Scanner;


public class figuras {
	public static void Main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//FORMA PARA DIBUJAR 
		String asterisco = "*";
		
		System.out.println("Número de línea de altura de una figura: ");
		int numeroFigura = sc.nextInt();
		
		
		String impresion = figura(numeroFigura);
		System.out.println(impresion);
	}
	
	public static String figura(int numeroFigura) {
		
		
		//validacion de datos introducidos
		if (numeroFigura < 3 || numeroFigura > 15) {
			return "valores no validos";
		} 
		
		//espacios
		int espacio = 0;
		
		if (numeroFigura > 3 && numeroFigura <=6) {
			espacio = 5;
		} 
		else if (numeroFigura > 7 && numeroFigura <=12) {
			espacio = 7;
		}
		else {
			espacio = 9;
		}
		//ancho 
		int ancho = 0;
		if (numeroFigura > 3 && numeroFigura <5) {
			ancho = 3;
		} 
		else if (numeroFigura > 6 && numeroFigura <8) {
			espacio = 5;
		}
		else if (numeroFigura > 9 && numeroFigura <12) {
			espacio = 7;
		}
		else {
			espacio = 9;
		}
		
		//impresion de la figura
		String figuraFormada = "";
		
        for (int i = 0; i < numeroFigura; i++) {
            for (int j = 0; j < espacio; j++) {
            	figuraFormada += " ";
            }
            for (int j = 0; j < ancho; j++) {
            	figuraFormada += "*";
            }
            figuraFormada += "\n";
        }
		
		return figuraFormada;
	}
	
}
