package pruebaPOO;

public class Main {
	public static void main(String[] args) {
		
		Automovil auto = new Automovil();
		
		//auto.marca = "BMW";
		auto.establecerMarca("BMW");
		//auto.modelo = "118d";
		auto.establecerModelo("118d");
		//auto.color = "blanco";
		auto.establecerColor("Blanco");
		//auto.carroceria = "E81";
		auto.establecerCarroceria("e81");
		//auto.cilindrada = 2.000;
		auto.establecerCilindrada(2.000);

		System.out.println(auto.detalle());
		
		/*
		System.out.println(auto.acelerarAuto(120));
		System.out.println(auto.frenarAuto(120,50,3));
		System.out.println("La marca del automovil es: "+auto.getMarca());
		
		
		Automovil auto2 = new Automovil();
		System.out.println(auto2.detalle());
		
		Automovil auto3 = new Automovil("Golf", "mk4", "Gris", 1.900 );
		System.out.println("auto3");
		System.out.println(auto3.detalle());
		*/

	}
}
