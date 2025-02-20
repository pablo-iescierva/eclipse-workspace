import java.lang.StringBuilder;

public class Main {
	
	//metodo1-sin stringBuilder
	/*
	public static void main(String[] args) {
		
		String texto = "invertir";
		
		invertirTexto(texto);
	}
	
	public static void invertirTexto(String texto) {
		String auxTexto ="";
		
		for (int i=0; i<texto.length(); i++) {
			
			auxTexto= texto.charAt(i) + auxTexto;
		}
		System.out.println(auxTexto);
	}*/
	
	//metodo2-con StringBuilder
	
	public static void main(String[] args) {
		String texto = "invertir";
		
		invertirTexto(texto);
	}
	
	public static void invertirTexto(String texto) {
		StringBuilder textoInvertido = new StringBuilder(texto);
		
		System.out.println(textoInvertido.reverse());
	}

}
