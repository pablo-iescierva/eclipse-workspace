
public class Main {

	public static void main(String[] args) {
		Punto p1 = new Punto(10, 20);
		Punto p2 = new Punto(-4, -3);
		
		p1.cuadrante();
		
		double distancia = p1.distancia();
		
		System.out.println("La distancia es: "+distancia);
		
		System.out.println(p2.cuadrante());
		double distancia2 = p2.distancia();
		System.out.println("La distancia es: "+distancia2);
		
		System.out.println(p2.moverC1());
		double distancia3 = p2.distancia();
		System.out.println("La distancia es: "+distancia3);
	}

}
