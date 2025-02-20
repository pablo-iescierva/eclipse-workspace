public class Utils {

    public static String tipoTriangulo(int valor1, int valor2, int valor3) {
        if (!esTriangulo(valor1, valor2, valor3)) {
            return ("ERROR"); 
        }
        if (valor1 == valor2 && valor2 == valor3) {
        	return ("EQUILATERO"); 
        } else if (valor1 == valor2 || valor2 == valor3 || valor1 == valor3) {
        	return ("ISOSCELES"); 
        } else {
        	return ("ESCALENO"); 
        }
    }

    // Método auxiliar para verificar si los valores forman un triángulo
    public static boolean esTriangulo(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0 && (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {
        System.out.println(tipoTriangulo(3, 3, 3)); // EQUILATERO
        System.out.println(tipoTriangulo(3, 3, 5)); // ISOSCELES
        System.out.println(tipoTriangulo(3, 4, 5)); // ESCALENO
        System.out.println(tipoTriangulo(1, 1, 3)); // ERROR
    }
}
