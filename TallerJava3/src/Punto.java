import java.lang.Math;

public class Punto {
	
	private double x;
	private double y;
	
	//constructores
	public Punto() {
		super();
	}

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//getters and setters
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
		
	//metodo cuadrante()
	
	public String cuadrante() {
		if (this.y > 0 && this.x > 0) {
			return "cuadrante 1";
		} else if (this.y > 0 && this.x < 0) {
			return "cuadrante 2";
		} else if (this.y < 0 && this.x < 0) {
			return "cuadrante 3";
		} else if (this.y < 0 && this.x > 0) {
			return "cuadrante 4";
		} else if (this.y == 0 && this.y == 0) {
			return "CENTRO";
		} else {
			return "ERROR";
		}
	}
	
	//metodo para calcular la distancia
	
	public double distancia() {
		return Math.sqrt(Math.pow(this.x - 0,2) + Math.pow(this.y - 0,2));
		
	}
	
	//metodo para mover C1
	
	public String moverC1() {
		
		this.x = Math.abs(this.x);
		this.y = Math.abs(this.y);
		
		return "El punto se cambia al cuadrante 1";
	}
	
	
	
	
	
}