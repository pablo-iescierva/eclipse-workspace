package coordenadas;
import java.io.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> lineasFichero = new ArrayList<String>();
		ArrayList<Coordenada> lineasFicheroLista = new ArrayList<>();
		double distanciaTotal = 0.0;
		
		
		try (FileReader fr = new FileReader("./assets/files/coordenadas.txt")) {
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
		
		//EN LINEASFICHERO TENGO UN ELEMENTO POR CADA LINEA DEL FICHERO
		
		for (int i = 0; i<lineasFichero.size(); i++) {
			String lineaActual = lineasFichero.get(i);
			String[] coordenadaActual=lineaActual.split(",");
			
			double x = Double.parseDouble(coordenadaActual[0]);
			double y = Double.parseDouble(coordenadaActual[1]);
			
			lineasFicheroLista.add(new Coordenada(x,y));
		}
		for (int i = 0; i<lineasFicheroLista.size()-1; i++) {
			double distancia = Math.sqrt(Math.pow(lineasFicheroLista.get(i+1).getX()-(lineasFicheroLista.get(i).getX())),2);
			
			distanciaTotal = distanciaTotal+distancia;
			System.out.println("Distancia entre el punto: "+lineasFicheroLista.get(i+1));
			
		}
		
	}
}
