package pruebaPOO;

public class Automovil {
	
	private String marca;
	private String modelo;
	private String color;
	private double cilindrada;
	private String carroceria;
	
	
	
	
	
	public Automovil() {
		super();		
	}
	
	

	public Automovil(String marca, String modelo, String color, Double cilindrada) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cilindrada = cilindrada;
	}




	public void establecerMarca(String mar) {
		this.marca = mar;
	}
	
	public String obtenerMarca() {
		return this.marca;
	}
	
	public void establecerColor(String col) {
		this.color = col;
	}
	public void establecerCilindrada(double cil) {
		this.cilindrada = cil;
	}
	public void establecerCarroceria(String carr) {
		this.carroceria = carr;
	}
	public void establecerModelo(String mod) {
		this.modelo = mod;
	}

	
	public String detalle() {
		
		String texto = "";
		
		texto = "\n Auto - Marca: "+this.marca + "\n Auto - Modelo: "+ this.modelo + "\n Auto - Color: " + this.color + "\n Auto - Cilindrada: " + this.cilindrada;

		return texto;
	}
	
	public String acelerarAuto(int velocidad) {
		
				
		return "El automovil: "+this.detalle()+
				"\n Esta acelerando a esta velocidad: "+velocidad+" km/h";
	}
	
	public String frenarAuto(int frenada1, int frenada2, int frenada3) {
		
		
		return "El automovil: "+this.detalle()+
				"\n Ha frenado de: "+frenada1+" km/h a " +frenada2+" km/h " + " en " +frenada3+" segundos Gracias a su frenada de doble piston Brembo!";
	}

	
	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	
}

