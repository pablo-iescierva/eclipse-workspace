import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
import java.io.FileWriter;
import java.io.IOException;

public class Session{
	//Ruta donde tenemos el archivo con los usuarios
	private final String FILE_PATH = "./assets/files/";
	private final String USER_FILE = "usuarios.txt";
	
	public boolean login(String username, String password) {
		boolean logged = false;
		try {
			//abrimos el archivo users.txt
			File file = new File(FILE_PATH + USER_FILE);
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				String[] parts = line.split("#");
				//metemos en un array de tipo string cortando por cada posicion en la que hay '#'
				if (parts.length > 0) {
					String usernameInFile = parts[0].trim();
					String passwordInFile = parts[1].trim();
					//Asignamos a una variable de tipo String la posicion 0 y 1 del array, usuario y contraseña respectivamente
					if (usernameInFile.equalsIgnoreCase(username) && passwordInFile.equals(password)) {
					//Comparamos los datos que recibimos con los guardados en las variables y si coinciden ponemos la variable en true
						logged = true;
					}
				}
			}
		} catch (FileNotFoundException e) {
			//Si no puede abrir el archivo o da error, ponemos la variable en false
			logged = false;
		}
		//devolvemos el booleano de la variable logged
		return logged;
	}
}
