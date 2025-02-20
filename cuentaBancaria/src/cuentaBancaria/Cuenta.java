package cuentaBancaria;

public class Cuenta {
	private int numeroCuenta;
	private int DNI;
	private double saldoActual;	
	
	//constructores
	public Cuenta() {
		super();
	}

	public Cuenta(int dNI, double saldoActual) {
		super();
		DNI = dNI;
		this.saldoActual = saldoActual;
	}
	
	//GETTERS Y SETTERS

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}
	
	//METODO PARA OBTENER TODA LA INFORMACIÓN DE LA CUENTA
	public String detallesCuenta() {
		String datos = "";
		
		datos = "Numero de cuenta: "+getNumeroCuenta()+"\n"+"DNI: "+getDNI()+"\n"+"Saldo Actual: "+getSaldoActual();
		
		return datos;
	}
	//METODO PARA INGRESAR DINERO A LA CUENTA
	public void ingresarSaldo(double recibido) {
		double saldoActual = 500;
		saldoActual = saldoActual+recibido;
	}
	
	//METODO PARA SACAR DINERO A LA CUENTA
	public void extraerSaldo(double extraido) {
		saldoActual = saldoActual-extraido;
	}
}
