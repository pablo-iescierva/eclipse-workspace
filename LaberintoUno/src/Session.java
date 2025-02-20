import java.util.Scanner;
import java.io.*;

public class Session {
	private User user;
	private boolean logged;
	
	//constructores
	
	public Session() {
		super();
	}

	public Session(User user, boolean logged) {
		super();
		this.user = user;
		this.logged = logged;
	}

	// getters and setters
	
	public void setUser(User user) {
		this.user = user;
	}

	public void setLogged(boolean logged) {
		this.logged = logged;
	} 
	
	
	//login - metodo para iniciar sesion
	
	public boolean login(String introUser, String introPasswd) {
		try {
			File myObj = new File(Config.USERS_FILE);
			Scanner sc = new Scanner(myObj);
			
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String[] cadenas = data.split("#");
				
				if (cadenas.length >= 7) {
                    String storedUser = cadenas[0];
                    String storedPass = cadenas[1];
                    
                    if (storedUser.equals(introUser) && storedPass.equals(introPasswd)) {
                        this.user = new User(cadenas[0], cadenas[2], cadenas[3], cadenas[4], cadenas[5], cadenas[6], cadenas[7]);
                        this.logged = true;
                        System.out.println(Config.WELCOME);
                        sc.close();
                        return true;
                        }
                    }
				}
			sc.close();
		
	}catch (FileNotFoundException e) {
        System.out.println("error en lectura de usuarios");
        e.printStackTrace();
	}
		System.out.println("valores incorrectos.");
        return false;
	}
	
	//signup - metodo para crear usuario
	
	public boolean signup(String username, String password, String name, String nif, String email, String address, String birthdate, String role) {
        try {
            File myObj = new File(Config.USERS_FILE);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            
            Scanner sc = new Scanner(myObj);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                String[] cadenas = data.split("#");
                if (cadenas.length > 0 && cadenas[0].equals(username)) {
                    System.out.println("nombre de usuario ya en uso");
                    sc.close();
                    return false;
                }
            }
            sc.close();
            
            FileWriter fw = new FileWriter(myObj, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            out.println(username + "#" + password + "#" + name + "#" + nif + "#" + email + "#" + address + "#" + birthdate + "#" + role);
            out.close();
            
            this.user = new User(username, name, nif, email, address, birthdate, role);
            this.logged = true;
            
            System.out.println("usuario registrado con exito!");
            return true;
        } catch (IOException e) {
            System.out.println("error - no se puede acceder al archivo users.txt");
            e.printStackTrace();
            return false;
        }
	}
	
	// showUser - ver datos de usuario conectado
	
	public void showUser() {
		if (user != null && logged != false) {
			System.out.println("-Usuario: " + user.getUsername()+"\n-Nombre: "+user.getName()+"\n-Email:  "+user.getEmail()+
					"\n-Direccion: "+user.getAddress()+"\n-Fecha de Nacimiento: "+user.getBirthdate()+"\n-Rol: "+user.getRole());
		}else {
			System.out.println("Error - Usuario descontectado.");
		}
	}
	
	//logout - metodo para cerrar sesion
	
	public void logout() {
		this.user = null;
		this.logged = false;
	}
}
