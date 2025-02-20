import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
public class Main{
	// TODO Auto-generated constructor stu

	public static void main(String[] args) {
		
		ArrayList<Modulo> listaModulos = new ArrayList<Modulo>();
		ArrayList<String> lineasFichero = new ArrayList<String>();
		
		//lectura de fichero
		try (FileReader fr = new FileReader("./assets/files/alumno.txt")) {
			BufferedReader br = new BufferedReader(fr);
			// Lectura del fichero
			String linea;
			while((linea=br.readLine())!=null)
				//System.out.println(linea);
				lineasFichero.add(linea);
			}
		catch(Exception e){
			e.printStackTrace();
			}

	}

}
