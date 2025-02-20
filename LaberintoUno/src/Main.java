/**
 * Main.java
 * Programa principal del sistema para resolver un laberinto
 * DMS - 2025.02.8 - 2025.02.16
 * version 0.1.0
 */

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Session session = new Session();
		Scanner sc = new Scanner(System.in);
		
        while (true) {
        	System.out.print("====Selecciona una opcion====");
            System.out.println("\n1- Iniciar sesion");
            System.out.println("2- Registrarse");
            System.out.println("3- Salir");
            
            int opcion = sc.nextInt();
            sc.nextLine();
            
            if (opcion == 1) {
                System.out.print("Usuario: ");
                String username = sc.nextLine();
                System.out.print("Contraseña: ");
                String passwd = sc.nextLine();
                
                if (session.login(username, passwd)) {
                    System.out.println("Inicio de sesión exitoso.");
                    session.showUser();
                    session.logout();
                }
            } else if (opcion == 2) {
                System.out.print("Nuevo usuario: ");
                String username = sc.nextLine();
                System.out.print("Contraseña: ");
                String passwd = sc.nextLine();
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("NIF: ");
                String nif = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Dirección: ");
                String address = sc.nextLine();
                System.out.print("Fecha de Nacimiento: ");
                String birthdate = sc.nextLine();
                String role = "user";
                
                if (session.signup(username, passwd, nombre, nif, email, address, birthdate,"user")) {
                    System.out.println("regsistro exitoso");
                } else {
                    System.out.println("Error al registrarse.");
                }
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opcion no valida");
            }
        }		
		
	}

}
