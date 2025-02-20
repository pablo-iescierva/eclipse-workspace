package cuentaBancaria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		Cuenta cuenta1 = null;
		
		do {
			
			System.out.println("Selecciona una opción del menú:"+"\n"+"1 - Crear cuenta."+"\n"+"2 - Ver información."
					+"\n"+"3 - Ingresar Dinero"+"\n"+"4 - Sacar dinero."+"\n"+"0 - Salir.");
			int respuesta = sc.nextInt();
			
			switch (respuesta) {
				case 1:
		            System.out.println("Introduce los datos para crear la cuenta:");
                    System.out.print("numero de cuenta: ");
                    int numeroCuenta = sc.nextInt();
                    System.out.print("DNI: ");
                    int DNI = sc.nextInt();
                    System.out.print("Saldo inicial: ");
                    double saldoInicial = sc.nextDouble();

                    cuenta1 = new Cuenta(numeroCuenta,saldoInicial);
                    System.out.println("Cuenta creada correctamente!");
                    break;
                    
			   case 2:
					if (cuenta1 != null) {
                        System.out.println(cuenta1.detallesCuenta());
                    } else {
                        System.out.println("NO EXISTE NINGUNA CUENTA");
                    }
                    break;
               case 3:
            	   if (cuenta1 != null) {
                       System.out.print("Cantidad que desea ingresar: ");
                       double ingreso = sc.nextDouble();
                       cuenta1.ingresarSaldo(ingreso);
                       System.out.println("dinero ingresado con exito.");
                   } else {
                       System.out.println("NO EXISTE NINGUNA CUENTA");
                   }
                   break;
               case 4:
                   if (cuenta1 != null) {
                       System.out.print("Cantidad a para sacar: ");
                       double retiro = sc.nextDouble();
                       cuenta1.extraerSaldo(retiro);
                   } else {
                       System.out.println("NO EXISTE NINGUNA CUENTA");
                   }
                   break;
               case 0:
            	   ok = true;
                   System.out.println("Saliendo del banco...");
                   break;

               default:
                   System.out.println("error - opcion no disponible");   
					
			}
			
			
		} while (!ok);
	}

}
