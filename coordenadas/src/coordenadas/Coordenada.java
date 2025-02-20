package coordenadas;

public class Coordenada {
	
	//DECLARACION DE VARIABLES
	private double x;
	private double y;
	//getters and setters
	public double getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	//constructores
	public Coordenada(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}
