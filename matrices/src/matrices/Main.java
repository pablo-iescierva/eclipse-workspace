package matrices;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int ladoMatriz = sc.nextInt();
		
		//mostrarA
		//int[][] matriz = secuenciaNaturalIntA(ladoMatriz);
        //imprimirMatrizA(matriz);
        
		//MOSTRAR B
		//int[][] matriz = secuenciaNaturalIntB(ladoMatriz);
        //imprimirMatrizB(matriz);
		
		//MOSTRAR C
		int[][] matriz = secuenciaNaturalIntC(ladoMatriz);
		imprimirMatrizC(matriz);
		
		
		
	}
	
	//METODO A
	
	public static int[][] secuenciaNaturalIntA(int ladoMatriz) {
		int[][] matriz;
		int contador = 0;
		
		matriz = new int[ladoMatriz][ladoMatriz];
		
		for (int columna = 0; columna<ladoMatriz; columna++) {
			for (int fila = 0; fila < ladoMatriz; fila++) {
				matriz[fila][columna]=++contador;
			}
		}
		return matriz;
	}
	
	public static void imprimirMatrizA(int[][] matriz) {
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	//METODO B
	
	public static int[][] secuenciaNaturalIntB(int ladoMatriz) {
	    int[][] matriz;
	    int contador = 0;

	    matriz = new int[ladoMatriz][ladoMatriz];

	    for (int columna = 0; columna < ladoMatriz; columna++) {
	    	
	        for (int fila = 0; fila < ladoMatriz; fila++) {
	        	
	            if (columna % 2==0) {
	            	matriz[fila][columna] = ++contador;
	            }else {
	            	matriz[matriz[columna].length-fila-1][columna]=++contador;
	            }
	        }
	    }
	    return matriz;
	}
	
	public static void imprimirMatrizB(int[][] matriz) {
	    for (int i = 0; i < matriz.length; i++) {
	        for (int j = 0; j < matriz.length; j++) {
	            System.out.print(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	//METODO C
	public static int[][] secuenciaNaturalIntC(int ladoMatriz){
		int[][] matriz;
	    int contador = 0;
	    
	    
		return matriz;
	}

}
